package com.injured.server.api.enums;

/**
 * 任务状态
 * @author cli
 *
 */
public enum TaskType {

	INJURED_SURVEY(1,"人伤查勘"),
	FAST_COMPENSAT(2,"快赔定损"),
	FAST_REVIEW(3,"快赔审核"),
	TRACK_MED(4,"跟踪调查"),
	MED_REVIEW(5,"调查审核"),
	MED_TAIK(6,"调解协谈"),
	MED_APPROVAL(7,"调解审批"),
	MED_CONFIRM(8,"调解确认"),
	INJURED_CONFIRM(9,"人伤定损"),
	INJURED_FIXED(10,"人伤核损"),
	ASSIST_INITIATE(11,"协办发起"),
	ASSIST_DEAL(12,"协办处理"),
	INJURY_LITUGATION(13,"人伤诉讼"),
	AGENCY_MANAGE(14,"机构管理"),
	USER_MANAGE(15,"用户管理"),
	USER_PERMISSION(16,"用户权限"), //用户权限日志合并为一个，去掉菜单、机构、金额权限分类
	AGENCY_PERMISSION(17,"机构权限"),
	MONEY_PERMISSION(18,"金额权限"),
	TASK_MANAGE(19,"任务管理"),
	TASK_REASSIGNMENT(20,"任务改派")
	;

    private int code;

    private String msg;

    TaskType(int code,String msg){
         this.code = code;
         this.msg = msg;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
