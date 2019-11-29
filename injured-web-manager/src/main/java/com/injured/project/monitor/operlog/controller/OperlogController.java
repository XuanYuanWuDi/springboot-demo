package com.injured.project.monitor.operlog.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.poi.ExcelUtil;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.framework.aspectj.lang.annotation.Log;
import com.injured.framework.aspectj.lang.enums.BusinessType;
import com.injured.framework.web.controller.BaseController;
import com.injured.framework.web.domain.AjaxResult;
import com.injured.framework.web.page.TableDataInfo;
import com.injured.project.monitor.operlog.domain.OperLog;
import com.injured.project.monitor.operlog.service.IOperLogService;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.model.response.BaseResponse;

/**
 * 操作日志记录
 * 
 * @author lzx
 */
@Controller
@RequestMapping("/monitor/operlog")
public class OperlogController extends BaseController
{
    private String prefix = "monitor/operlog";

    @Autowired
    private IOperLogService operLogService;
    
    @Reference
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;

    @RequiresPermissions("monitor:operlog:view")
    @GetMapping()
    public String operlog()
    {
        return prefix + "/operlog";
    }

    @RequiresPermissions("monitor:operlog:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OperLog operLog)
    {
        startPage();
        List<OperLog> list = operLogService.selectOperLogList(operLog);
        return getDataTable(list);
    }

    @Log(title = "操作日志", businessType = BusinessType.EXPORT)
    @RequiresPermissions("monitor:operlog:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OperLog operLog)
    {
        List<OperLog> list = operLogService.selectOperLogList(operLog);
        ExcelUtil<OperLog> util = new ExcelUtil<OperLog>(OperLog.class);
        return util.exportExcel(list, "操作日志");
    }

    @RequiresPermissions("monitor:operlog:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(operLogService.deleteOperLogByIds(ids));
    }

    @RequiresPermissions("monitor:operlog:detail")
    @GetMapping("/detail/{operId}")
    public String detail(@PathVariable("operId") Long operId, ModelMap mmap)
    {
        mmap.put("operLog", operLogService.selectOperLogById(operId));
        return prefix + "/detail";
    }
    
    @Log(title = "操作日志", businessType = BusinessType.CLEAN)
    @RequiresPermissions("monitor:operlog:remove")
    @PostMapping("/clean")
    @ResponseBody
    public AjaxResult clean()
    {
        operLogService.cleanOperLog();
        return success();
    }
    
    
//=====新
    
    /**
     * 查询历史记录
     */
    @PostMapping("/viewList/{id}/{type}")
    @ResponseBody
    public TableDataInfo editList(@PathVariable("id") Long id,@PathVariable("type") int type)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        if(id == 0) {
        	id = null;
        }
        BaseResponse baseResponse = injuredStaffOperatLogContract.logListByTaskId(type,id,currentUser.getCompanyId());
        return getDataTableLog((List<InjuredStaffOperatLog>)baseResponse.getData());
    }
}
