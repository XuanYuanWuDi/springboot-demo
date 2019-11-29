package com.injured.project.monitor.druid;

import com.injured.dubbo.controllers.CompensatController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.injured.framework.web.controller.BaseController;

import javax.servlet.http.HttpServletRequest;

/**
 * druid 监控
 * 
 * @author lzx
 */
@Controller
@RequestMapping("/monitor/data")
public class DruidController extends BaseController
{
    @Value("${durid.monitor.url}")
    private String Url;

    private static Logger logger = LogManager.getLogger(DruidController.class);

    @RequiresPermissions("monitor:data:view")
    @GetMapping()
    public String index(HttpServletRequest request)
    {
        return redirect(Url);
    }
}
