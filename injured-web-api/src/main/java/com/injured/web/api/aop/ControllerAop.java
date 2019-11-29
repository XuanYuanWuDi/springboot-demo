package com.injured.web.api.aop;

import com.injured.server.api.model.response.BaseResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:42
 * @Description:对controller切面输出请求和返回报文
 */

@Component // 将对象交由spring进行管理
@Aspect // 代表此类为一个切面类
public class ControllerAop {



    @Pointcut("execution(public * com.injured.web.api.controller.*.*(..))") // 切入点表达式
    public void privilege() {

    }

    @Around("privilege()")
    public Object around(ProceedingJoinPoint pjd) throws Throwable {
        // 获取方法名
        String className = pjd.getTarget().getClass().getName();
        // 获取执行的方法名称
        String methodName = pjd.getSignature().getName();
        /** 初始化日志打印 */
        Logger log = LoggerFactory.getLogger(className);
        // 定义返回参数
        Object result = null;
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 获取方法参数
        Object[] args = pjd.getArgs();
        String params = "请求参数为:";
        //获取请求参数集合并进行遍历拼接
        for (Object object : args) {
            params += object + ",";
        }
        params = params.substring(0, params.length() - 1);
        //打印请求参数参数
        log.info(className + "类的" + methodName + "的" + params);
        // 执行目标方法
        result = pjd.proceed();
        // 打印返回报文
        log.info(className + "类的" + methodName + "的返回报文为:" + (result instanceof BaseResponse ? (BaseResponse) result : result));
        // 获取执行完的时间
        log.info(methodName + "方法执行时长为:" + (System.currentTimeMillis() - start));
        return result;
    }
}
