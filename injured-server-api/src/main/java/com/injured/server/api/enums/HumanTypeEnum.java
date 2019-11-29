package com.injured.server.api.enums;

/**
 * 伤者属性
 * @author cli
 *
 */
public enum HumanTypeEnum {

	SUBJECT_DRIVER(1,"主车驾驶员"),
	SUBJECT_PASSENGER(2,"主车乘客"),
	THREE_PEDESTRIANS(3,"三者步行人"),
	THREE_RIDERS(4,"三者骑乘人"),
	THREE_CAR_PERSON(5,"三者车上人"),
	;

    private int code;

    private String msg;

    HumanTypeEnum(int code,String msg){
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
     
    public static String getMsg(int code) {  
        for (HumanTypeEnum enums : HumanTypeEnum.values()) {  
            if (enums.getCode() == code) {  
                return enums.getMsg();
            }  
        }  
        return null;  
    }  
    
}
