package com.injured.commons.encrypt;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.SignatureException;

/**
 * 
 *类名：MD5Util
 *日期：2014年1月13日
 *描述：TODO
 *提示：TODO
 */

public class MD5 {

    /**
     * 签名字符串
     * @param text 需要签名的字符串
     * @param key 密钥
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static String sign(String text, String key, String input_charset) {
        text = text + key;
        return DigestUtils.md5Hex(getContentBytes(text, input_charset));
    }

    /**
     * 签名字符串全部大写
     * @param text 需要签名的字符串
     * @param key 密钥
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static String signtoUpperCase(String text, String key, String input_charset) {
        text = text + key;
        return DigestUtils.md5Hex(getContentBytes(text, input_charset)).toUpperCase();
    }


    /**
     * 签名字符串
     * @param text 需要签名的字符串
     * @param sign 签名结果
     * @param key 密钥
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static boolean verify(String text, String sign, String key, String input_charset) {
    	text = text + key;
    	String mysign = DigestUtils.md5Hex(getContentBytes(text, input_charset));
    	if(mysign.equals(sign)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /**
     * 签名对象
     * @param text 需要签名的对象
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static String signObject(Object obj , String input_charset) {
        return DigestUtils.md5Hex(getContentBytes(JSON.toJSONString(obj) , input_charset));
    }
    
    /**
     * 校验签名对象正确性
     * @param text 需要签名的字符串
     * @param sign 签名结果
     * @param input_charset 编码格式
     * @return 签名结果
     */
    public static boolean verifyObject(Object obj , String sign, String input_charset) {
    	
    	
    	String mysign = DigestUtils.md5Hex(getContentBytes(JSON.toJSONString(obj), input_charset));
    	if(mysign.equals(sign)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /**
     * @param content
     * @param charset
     * @return
     * @throws SignatureException
     * @throws UnsupportedEncodingException 
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }
    //"branchCompanyCode":"02",
    public static void main(String[] args) {
        String str = "{\"branchCompanyname\":\"北京分公司\",\"check\":{\"checkAddress\":\"北京东城区西大街南胡同北47号\",\"checkDate\":\"2018-10-10 10:10:10\",\"checkEmployee1Name\":\"张三报\",\"checkEmployee1Phone\":\"18915236987\",\"checkType\":\"1\",\"contactPerson\":\"李四天\",\"contactTel\":\"15998744569\",\"disposeType\":\"1\",\"driver\":{\"driverAge\":22,\"driverAllowedVehicleType\":\"1\",\"driverLicenseNo\":\"13098775963256\",\"driverSex\":\"1\",\"driverTel\":\"1897539514\",\"identifyNumber\":\"13098775963256\",\"name\":\"王五夜\"},\"eventAddressType\":\"1\",\"eventReason\":\"1\",\"eventReasonType\":\"1\",\"eventResponsibility\":\"1\",\"eventType\":\"1\",\"isCarAnnual\":\"1\",\"isFirstScene\":true,\"lossPass\":\"经过就是车主撞了行人\"},\"claimNumber\":\"10087\",\"commercialInsurances\":[{\"approvedCapacity\":\"10KG\",\"buyInsuranceDate\":\"2018-10-10 10:10:10\",\"firstRegistrationDate\":\"2018-10-10 10:10:10\",\"insuranceAmount\":10000,\"insuranceEndDate\":\"2018-10-10 10:10:10\",\"insuranceFee\":5000,\"insuranceItems\":[{\"deductibleMoney\":1000,\"deductibleRate\":20,\"insuranceAmount\":2000,\"insuranceFee\":1000,\"name\":\"每次事故无责医疗费用\",\"nonDeductible\":\"1\",\"unitCount\":5},{\"deductibleMoney\":1000,\"deductibleRate\":20,\"insuranceAmount\":2000,\"insuranceFee\":1000,\"name\":\"每次事故无责财产损失\",\"nonDeductible\":\"1\",\"unitCount\":5}],\"insuranceNumber\":\"1000000987789\",\"insuranceStartDate\":\"2018-10-10 10:10:10\",\"insuranceType\":\"1\",\"issueDate\":\"2018-10-10 10:10:10\",\"policyHolder\":\"露天有\",\"seatCount\":10,\"signAddress\":\"北京市朝阳区\",\"signDate\":\"2018-10-10 10:10:10\",\"theInsuredName\":\"展昭\"},{\"approvedCapacity\":\"10KG\",\"buyInsuranceDate\":\"2018-10-10 10:10:10\",\"firstRegistrationDate\":\"2018-10-10 10:10:10\",\"insuranceAmount\":10000,\"insuranceEndDate\":\"2018-10-10 10:10:10\",\"insuranceFee\":5000,\"insuranceItems\":[{\"deductibleMoney\":1000,\"deductibleRate\":20,\"insuranceAmount\":2000,\"insuranceFee\":1000,\"name\":\"车辆损失险\",\"nonDeductible\":\"1\",\"unitCount\":5},{\"deductibleMoney\":1000,\"deductibleRate\":20,\"insuranceAmount\":2000,\"insuranceFee\":1000,\"name\":\"车上人员责任险乘客座位\",\"nonDeductible\":\"1\",\"unitCount\":5}],\"insuranceNumber\":\"1000000987789\",\"insuranceStartDate\":\"2018-10-10 10:10:10\",\"insuranceType\":\"2\",\"issueDate\":\"2018-10-10 10:10:10\",\"policyHolder\":\"露天有\",\"seatCount\":10,\"signAddress\":\"北京市朝阳区\",\"signDate\":\"2018-10-10 10:10:10\",\"theInsuredName\":\"展昭\"}],\"injury\":{\"humanType\":\"B\",\"damageName\":\"定损员一号\",\"damageNo\":\"10000\",\"humanName\":\"呵呵哒\",\"mainDrivingStatus\":\"1\",\"receiptAccount\":\"622202588521478\",\"receiptName\":\"王麻子\",\"surveyFirstAddress\":\"1\",\"theInsuredName\":\"展昭\",\"wouTransportat\":\"1\"},\"insuranceCompanyCode\":\"AB\",\"insuranceCompanyID\":\"523\",\"isPayBackForOthers\":\"1\",\"registrationNumber\":\"京A8888\",\"report\":{\"contactPerson\":\"世界首富\",\"eventAddress\":\"北京市东城区\",\"eventAddressType\":\"1\",\"eventDate\":\"2018-10-10 10:10:10\",\"eventDescription\":\"车主撞了行人\",\"eventReason\":\"1\",\"eventReasonType\":\"1\",\"eventResponsibility\":\"1\",\"hurtNum\":3,\"informant\":\"行人\",\"informantIsDriver\":\"1\",\"informantIsInsured\":\"1\",\"isPersonInjured\":\"1\",\"isProtectLoss\":\"1\",\"isScene\":\"1\",\"reportDate\":\"2018-10-10 10:10:10\"},\"taskNo\":\"10086\",\"vehicle\":{\"brand\":\"东风雪铁龙\",\"engineNumber\":\"009982922020202\",\"insuredName\":\"十九世纪\",\"isMortgage\":\"1\",\"isPersonInjured\":\"1\",\"isProtectLoss\":\"1\",\"isTelemarketing\":\"1\",\"licensePlate\":\"京A8888\",\"licensePlateColor\":\"1\",\"licensePlateType\":\"1\",\"modelCode\":\"1\",\"modelName\":\"东风雪铁龙WME888轿车\",\"newCarAmount\":125000,\"seatCount\":5,\"vehicleType\":\"1\",\"vin\":\"009982922020202\"}}";
        System.out.println(MD5.sign(str,"1","UTF-8"));
    }
}