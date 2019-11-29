package com.injured.web.api.interceptor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.injured.commons.encrypt.MD5;
import com.injured.server.api.contract.CeInsuranceCompanyContract;
import com.injured.server.api.entity.CeInsuranceCompany;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.Charset;

/**
 * @author zlu
 * @title: InterfaceAuthCheckInterceptor
 * @projectName injured
 * @description: TODO
 * @date 2019/7/2517:57
 */
@Component
class InterfaceAuthCheckInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(timeout = 60000)
    private CeInsuranceCompanyContract ceInsuranceCompanyContract;


    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)
            throws Exception {

        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("utf-8");

        BaseResponse baseResponse = new BaseResponse();
        try {
            String URI = request.getRequestURI();

            logger.info("过滤器获取URI结果为{}", URI);

            String token = request.getHeader("auth_token");

            String companyId = request.getHeader("auth_id");
            //校验TOKEN是否为空
            if (StringUtils.isBlank(token)) {
                logger.info("保险公司{}请求{}校验TOKEN为空", companyId, URI);
                baseResponse = ResponseUtil.error(ResultEnum.TOKEN_IS_NULL);
                String resultJson = JSONObject.toJSONString(baseResponse);
                PrintWriter writer = response.getWriter();
                writer.write(resultJson);
                writer.flush();
                return false;
            }

            //校验AUTH_ID是否为空
            if (StringUtils.isBlank(companyId)) {
                logger.info("保险公司请求{}校验AUTH_ID为空", URI);
                baseResponse = ResponseUtil.error(ResultEnum.AUTH_ID_IS_NULL);
                String resultJson = JSONObject.toJSONString(baseResponse);
                PrintWriter writer = response.getWriter();
                writer.write(resultJson);
                writer.flush();
                return false;
            }

            CeInsuranceCompany ceInsuranceCompany = ceInsuranceCompanyContract.getCompanyById(Integer.valueOf(companyId));
            String secreKey = ceInsuranceCompany.getSecretKey();
            String body = getBodyString(request);

            if (!MD5.verify(body, token, secreKey, "UTF-8")) {
                logger.info("保险公司{}请求{}校验签名数据失败", URI);
                baseResponse = ResponseUtil.error(ResultEnum.TOEKN_CHECK_ERROR);
                String resultJson = JSONObject.toJSONString(baseResponse);
                PrintWriter writer = response.getWriter();
                writer.write(resultJson);
                writer.flush();
                return false;
            }
            return true;
        }catch(Exception e){
            logger.error("校验数据异常",e);
            e.printStackTrace();
            baseResponse = ResponseUtil.error(ResultEnum.EXCEPTION);
            String resultJson = JSONObject.toJSONString(baseResponse);
            PrintWriter writer = response.getWriter();
            writer.write(resultJson);
            writer.flush();
            return false;
        }
    }



    /**
     * 获取请求Body
     *
     * @param request
     * @return
     */
    public static String getBodyString(final ServletRequest request) {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = request.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
