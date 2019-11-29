package com.injured.server.provider;

import com.alibaba.fastjson.JSONObject;
import com.injured.commons.encrypt.MD5;
import com.injured.server.api.model.request.fast.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: ApiJsonTest
 * @projectName injured
 * @description: 测试报文生成
 * @date 2019/8/1916:00
 */
public class ApiJsonTest {


    @Test
    public void testJson1() throws ParseException {
        FastCompensatInfoRequest request = new FastCompensatInfoRequest();
        request.setBranchCompanyCode("0109");
        request.setBranchCompanyname("德联财产保险股份有限公司宁波分公司海曙中心支公司");
        request.setTaskNo("1");
        request.setClaimNumber("9045903202019001195");
        request.setInsuranceCompanyID("523");
        request.setInsuranceCompanyCode("AB");
        //是否无责代培
        request.setIsPayBackForOthers("1");
        request.setRegistrationNumber("苏F63893");

        //查勘信息
        Check check = new Check();
        check.setCheckAddress("江苏省 南通市 海安市 海安");
        check.setCheckStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 10:10:00"));
        check.setCheckEndTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 17:26:00"));
        check.setCheckEmployee1Name("周网");
        //查勘类型
        check.setCheckType("4");
        check.setContactPerson("毛根");
        check.setContactTel("17712223661");
        //事故处理方式
        check.setDisposeType("4");
        //道路类型
        check.setEventAddressType("2");
        //出险原因
        check.setEventReason("A10095A");
        //事故原因
        //check.setEventReasonType("1");
        //责任类型
        check.setEventResponsibility("1");
        //责任比例
        check.setEventDutyRatio(new BigDecimal(100.00));
        //事故类型
        check.setEventType("3");
        check.setIsFirstScene("0");
        check.setLossPass("3车追尾，标的车（是前数第3辆）受损，三者车2辆受损，标的车无人伤，三者车无人伤。已提醒客户保持电话畅通，稍后我司客服经理为您提供服务");
        check.setIsCarAnnual("1");
        check.setCaseType("2");
        check.setIsPersonInjured("0");
        check.setSubrogationFlag("0");
        check.setIsMutualCollisionSelfCompensation("0");
        check.setIsCarInsurance("1");
        check.setSubCertiType("1");
        check.setDriverReview("1");
        check.setIsAppointDriver("0");
        check.setSubrogationFlag("1");
        check.setEventAddress("这是查勘的出险地址");
        check.setCheckEmployee1Code("A002");
        check.setCheckEmployee1Phone("18910588523");

        //驾驶员信息
        Driver driver = new Driver();
        driver.setName("杨柏");
        driver.setDriverSex("1");
        driver.setDriverAge(42);
        driver.setDriverLicenseNo("211223198505010610");
        driver.setDriverPhone("17712223661");
        //驾照类型
        driver.setDriverAllowedVehicleType("2");
        driver.setIdentifyNumber("211223198505010610");
        driver.setIdentifyType("01");
        //驾驶员性别
        //是否为酒后驾车
        driver.setIsDrinkingDriving(new Byte((byte) 0));

        check.setDriver(driver);

        request.setCheck(check);


        //交强险信息
        CommercialInsurance commercialInsurance_1 = new CommercialInsurance();
        commercialInsurance_1.setInsuranceType("1");
        commercialInsurance_1.setBuyInsuranceDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-17 16:14:24"));
        commercialInsurance_1.setFirstRegistrationDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-07-18 00:00:00"));
        commercialInsurance_1.setInsuranceAmount(new BigDecimal(122000.00));
        commercialInsurance_1.setInsuranceEndDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-07-17 23:59:59"));
        //commercialInsurance_1.setInsuranceFee(new BigDecimal(5000.00));
        commercialInsurance_1.setInsuranceNumber("2045903202019005376");
        commercialInsurance_1.setInsuranceStartDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-18 00:00:00"));
        //commercialInsurance_1.setIssueDate(new Date());
        commercialInsurance_1.setPolicyHolder("海安平顺运输有限公司");
        //commercialInsurance_1.setSignAddress("北京市朝阳区");
        commercialInsurance_1.setSignDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-17 16:14:24"));
        commercialInsurance_1.setTheInsuredName("海安平顺运输有限公司");
        commercialInsurance_1.setApprovedCapacity(9);
        commercialInsurance_1.setSeatCount(2);
        commercialInsurance_1.setTheInsuredNo("82016671746");
        commercialInsurance_1.setTheInsuredNoType("71");
        commercialInsurance_1.setAgent("王永平");
        commercialInsurance_1.setChannels("51");
        commercialInsurance_1.setCompanyName("江苏分公司南通中心支公司");
        commercialInsurance_1.setVehicleColor("003");
        //进口国产
        //commercialInsurance_1.setImportDomestic();
        commercialInsurance_1.setUsedYears(new Byte((byte) 3));
        commercialInsurance_1.setNewVehiclePrice(new BigDecimal(100000.00));
        commercialInsurance_1.setVehiclePrice(new BigDecimal(90000.00));
        commercialInsurance_1.setOwner("测试AAA");
        commercialInsurance_1.setIsTransfer(new Byte((byte) 1));
        commercialInsurance_1.setIsContinuousPolicy("0");
        commercialInsurance_1.setInsuranceCategory("1");
        commercialInsurance_1.setVin("LVBV6PBC3JW066189");
        commercialInsurance_1.setTypeOfUsage("101");
        commercialInsurance_1.setVehicleType("96");
        commercialInsurance_1.setIssueDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 10:08:55"));
        commercialInsurance_1.setPolicyHolderPhone("18975896325");
        commercialInsurance_1.setSignDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 10:08:55"));
        commercialInsurance_1.setCompanyName("人保公司");
        commercialInsurance_1.setImportDomestic("1");
        commercialInsurance_1.setVehiclePrice(new BigDecimal(23000.00));







        InsuranceItem insuranceItem = new InsuranceItem();
        insuranceItem.setDeductibleRate(new BigDecimal(0.00));
        insuranceItem.setDeductibleMoney(new BigDecimal(0.00));
        insuranceItem.setInsuranceAmount(new BigDecimal(122000.00));
        insuranceItem.setInsuranceFee(new BigDecimal(1000.00));
        insuranceItem.setName("机动车交强险");
        insuranceItem.setInsuranceItemCode("100");
        //承包不计免赔
        insuranceItem.setNonDeductible("1");
        insuranceItem.setUnitCount(1);
        insuranceItem.setUnitAmount(new BigDecimal(122000.00));
        insuranceItem.setPremiums(new BigDecimal(3105.00));


        List<InsuranceItem> insuranceItems = new ArrayList<>();
        insuranceItems.add(insuranceItem);

        commercialInsurance_1.setInsuranceItems(insuranceItems);

        List<CommercialInsurance> commercialInsurances = new ArrayList<>();
        commercialInsurances.add(commercialInsurance_1);


        request.setCommercialInsurances(commercialInsurances);

        //报案信息
        Report report = new Report();
        report.setHurtNum(1);
        //是否有物损
        report.setIsPersonInjured("1");
        //是否有人伤
        report.setIsProtectLoss("1");
        report.setContactPerson("世界首富");
        report.setEventAddress("这是报案的出险地址");
        //道路类型
        report.setEventAddressType("2");
        report.setEventDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-06 18:00:55"));
        report.setEventDescription("3车追尾，标的车（是前数第3辆）受损，三者车2辆受损，标的车无人伤，三者车无人伤。已提醒客户保持电话畅通，稍后我司客服经理为您提供服务");
        //出险原因
        report.setEventReason("A10095A");
        report.setEventAddress("江苏省南通市海安市通榆路老204国道");
        report.setEventReasonType("1");
        //责任类型
        report.setEventResponsibility("1");
        report.setInformant("毛根");
        report.setInformantTel("17712223661");
        //报案人是否是驾驶员
        report.setInformantIsDriver("0");
        //报案人是否是被保险人
        report.setInformantIsInsured("1");
        //是否现场报案
        report.setRegistSource("0");
        report.setReportDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 10:08:55"));
        report.setIsClosed("0");
        report.setIsPolice("1");
        report.setIsOutofLocalClaim("0");
        report.setSubrogationFlag("0");
        report.setIsSimpleClaim("1");
        report.setFirstSceneInd("0");
        report.setIsSubjectNormal("1");


        request.setReport(report);


        //车辆信息
        Vehicle vehicle = new Vehicle();
        vehicle.setSeatCount(2);
        vehicle.setBrand("福田");
        vehicle.setEngineNumber("76386266");
        vehicle.setInsuredName("海安平顺运输有限公司");
        //车辆型号
        vehicle.setModelCode("1");
        vehicle.setModelName("福田BJ1186VKPFK-A1载货汽车");
        vehicle.setNewCarAmount(new BigDecimal(162800.00));
        vehicle.setLicensePlate("苏F63893");
        //车辆种类
        vehicle.setLicensePlateType("01");
        //号牌底色
        vehicle.setLicensePlateColor("01");
        //车辆种类
        vehicle.setVehicleType("96");
        vehicle.setVin("LVBV6PBC3JW066189");
        //是否按揭
        //vehicle.setIsMortgage("1");
        //是否电销
        //vehicle.setIsTelemarketing("1");
        //是否包含人伤
        vehicle.setIsPersonInjured("1");

        vehicle.setSubCompanyName("江苏分公司");
        //使用性质
        vehicle.setTypeOfUsage("101");
        //是否包含物损
        vehicle.setIsProtectLoss("1");
        //车主
        vehicle.setOwner("海安平顺运输有限公司");

        vehicle.setIsRescue("0");
        vehicle.setIsDisassemble("0");

        request.setVehicle(vehicle);

        Injury injury = new Injury();
        //主车行驶情况
        injury.setMainDrivingStatus("1");
        //伤者交通方式
        injury.setWouTransportat("3");
        //人伤首勘地
        injury.setSurveyFirstAddress("2");
        //injury.setReceiptName("王麻子");
        //injury.setReceiptAccount("622202588521478");
        injury.setHumanName("陈晓龙");
        injury.setDamageName("张四");
        injury.setDamageNo("CEBJ002");
        //injury.setTheInsuredName("展昭");
        injury.setHumanType("D");
        injury.setVisitTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 14:45:00"));
        injury.setMedicalExpensesFee(new BigDecimal(600.00));
        injury.setIncomeStatus("2");
        //injury.setEngagedIndustry("");
        injury.setLossFirstType("A02");
        injury.setLossSecondType("A0201");
        injury.setIdCard("320682198811160672");
        injury.setIdCardType("01");
        injury.setTheInsuredName("海安平顺运输有限公司");
        injury.setDamageDesc("麻烦老师审核，微信建群上级批复截图已上传。");
        injury.setHumanSex("1");
        injury.setHumanAge(45);

        request.setInjury(injury);
        request.setNotifyUrl("http://www.baidu.com");
        request.setReturnUrl("http://www.baidu.com");
        request.setTaskType("A01");

        String str  = JSONObject.toJSONString(request);
        System.out.println(str);
        System.out.println(MD5.sign(str,"1","UTF-8"));
    }




    @Test
    public void testJson2() throws ParseException {
        FastCompensatInfoRequest request = new FastCompensatInfoRequest();
        request.setBranchCompanyCode("0201");
        request.setBranchCompanyname("德联财产保险股份有限公司北京分公司朝阳中心支公司");
        request.setTaskNo("2");
        request.setClaimNumber("9041203362018003157");
        request.setInsuranceCompanyID("523");
        request.setInsuranceCompanyCode("AB");
        //是否无责代培
        request.setIsPayBackForOthers("1");
        request.setRegistrationNumber("苏JB359S");

        //查勘信息
        Check check = new Check();
        check.setCheckAddress("江苏省 南通市 海门市 临江");
        check.setCheckStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-01 11:01:00"));
        check.setCheckEndTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-08-01 15:41:00"));
        check.setCheckEmployee1Name("王跃彬");
        //查勘类型
        check.setCheckType("1");
        check.setContactPerson("柳海");
        check.setContactTel("15950236186");
        //事故处理方式
        check.setDisposeType("4");
        //道路类型
        check.setEventAddressType("2");
        //出险原因
        check.setEventReason("A10095A");
        //事故原因
        //check.setEventReasonType("1");
        //责任类型
        check.setEventResponsibility("1");
        //责任比例
        check.setEventDutyRatio(new BigDecimal(100.00));
        //事故类型
        check.setEventType("3");
        check.setIsFirstScene("0");
        check.setLossPass("标的车被三者摩托车撞，标的车受损，三者车受损，标的车无人伤，三者车无人伤。已提醒客户保持电话畅通，保护好现场，稍后我司客服经理为您提供服务");
        check.setIsCarAnnual("1");
        check.setCaseType("1");
        check.setSubrogationFlag("0");
        check.setIsPersonInjured("0");
        check.setIsMutualCollisionSelfCompensation("0");
        check.setIsCarInsurance("1");
        check.setSubCertiType("1");
        check.setDriverReview("1");
        check.setIsAppointDriver("0");
        check.setSubrogationFlag("1");
        check.setEventAddress("这是查勘的出险地址");
        check.setCheckEmployee1Code("A002");
        check.setCheckEmployee1Phone("18910588523");

        //驾驶员信息
        Driver driver = new Driver();
        driver.setName("张建和");
        driver.setDriverSex("1");
        driver.setDriverAge(30);
        driver.setDriverLicenseNo("32091119650115667X");
        driver.setDriverPhone("15950236186");
        //驾照类型
        driver.setDriverAllowedVehicleType("2");
        driver.setIdentifyNumber("32091119650115667X");
        driver.setIdentifyType("01");
        //是否为酒后驾车
        driver.setIsDrinkingDriving(new Byte((byte) 0));
        //驾驶员性别

        check.setDriver(driver);

        request.setCheck(check);


        //交强险信息
        CommercialInsurance commercialInsurance_1 = new CommercialInsurance();
        commercialInsurance_1.setInsuranceType("1");
        commercialInsurance_1.setBuyInsuranceDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-03-05 17:17:26"));
        commercialInsurance_1.setFirstRegistrationDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-03-05 00:00:00"));
        commercialInsurance_1.setInsuranceAmount(new BigDecimal(122000.00));
        commercialInsurance_1.setInsuranceEndDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-03-24 23:59:59"));
        //commercialInsurance_1.setInsuranceFee(new BigDecimal(5000.00));
        commercialInsurance_1.setInsuranceNumber("2041203202018015132");
        commercialInsurance_1.setInsuranceStartDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-03-25 00:00:00"));
        //commercialInsurance_1.setIssueDate(new Date());
        commercialInsurance_1.setPolicyHolder("施正卉");
        //commercialInsurance_1.setSignAddress("北京市朝阳区");
        commercialInsurance_1.setSignDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-03-05 17:17:26"));
        commercialInsurance_1.setTheInsuredName("施正卉");
        commercialInsurance_1.setApprovedCapacity(9);
        commercialInsurance_1.setSeatCount(6);
        commercialInsurance_1.setTheInsuredNo("320924197605165729");
        commercialInsurance_1.setTheInsuredNoType("01");
        commercialInsurance_1.setAgent("李萍");
        commercialInsurance_1.setChannels("51");
        commercialInsurance_1.setCompanyName("江苏分公司南通中心支公司");
        commercialInsurance_1.setVehicleColor("003");
        //进口国产
        //commercialInsurance_1.setImportDomestic();
        commercialInsurance_1.setUsedYears(new Byte((byte) 3));
        commercialInsurance_1.setNewVehiclePrice(new BigDecimal(100000.00));
        commercialInsurance_1.setVehiclePrice(new BigDecimal(90000.00));
        commercialInsurance_1.setOwner("测试AAA");
        commercialInsurance_1.setIsTransfer(new Byte((byte) 1));
        commercialInsurance_1.setIsContinuousPolicy("0");
        commercialInsurance_1.setInsuranceCategory("2");
        commercialInsurance_1.setVin("LVBV6PBC3JW066190");
        commercialInsurance_1.setTypeOfUsage("101");
        commercialInsurance_1.setVehicleType("96");
        commercialInsurance_1.setIssueDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 10:08:55"));
        commercialInsurance_1.setPolicyHolderPhone("18975896325");
        commercialInsurance_1.setSignDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-07 10:08:55"));
        commercialInsurance_1.setCompanyName("人保公司");
        commercialInsurance_1.setImportDomestic("1");
        commercialInsurance_1.setVehiclePrice(new BigDecimal(23000.00));



        InsuranceItem insuranceItem = new InsuranceItem();
        insuranceItem.setDeductibleRate(new BigDecimal(0.00));
        insuranceItem.setDeductibleMoney(new BigDecimal(0.00));
        insuranceItem.setInsuranceAmount(new BigDecimal(122000.00));
        insuranceItem.setInsuranceFee(new BigDecimal(1000.00));
        insuranceItem.setName("机动车交强险");
        //承包不计免赔
        insuranceItem.setNonDeductible("1");
        insuranceItem.setUnitCount(1);
        insuranceItem.setUnitAmount(new BigDecimal(122000.00));
        insuranceItem.setPremiums(new BigDecimal(1100.00));
        insuranceItem.setInsuranceItemCode("100");


        List<InsuranceItem> insuranceItems = new ArrayList<>();
        insuranceItems.add(insuranceItem);

        commercialInsurance_1.setInsuranceItems(insuranceItems);

        List<CommercialInsurance> commercialInsurances = new ArrayList<>();
        commercialInsurances.add(commercialInsurance_1);


        request.setCommercialInsurances(commercialInsurances);

        //报案信息
        Report report = new Report();
        report.setHurtNum(2);
        //是否有物损
        report.setIsPersonInjured("1");
        //是否有人伤
        report.setIsProtectLoss("1");
        report.setContactPerson("世界首富2");
        report.setEventAddress("这是报案出险地址2");
        //道路类型
        report.setEventAddressType("2");
        report.setEventDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-07-31 20:20:10"));
        report.setEventDescription("标的车被三者摩托车撞，标的车受损，三者车受损，标的车无人伤，三者车无人伤。已提醒客户保持电话畅通，保护好现场，稍后我司客服经理为您提供服务");
        //出险原因
        report.setEventReason("A10095A");
        //report.setEventReasonType("");
        report.setEventAddress("江苏省南通市海门市临江镇");
        //report.setEventReasonType("1");
        //责任类型
        report.setEventResponsibility("1");
        report.setInformant("柳海");
        report.setInformantTel("15950236186");
        //报案人是否是驾驶员
        report.setInformantIsDriver("0");
        //报案人是否是被保险人
        report.setInformantIsInsured("1");
        //是否现场报案
        report.setRegistSource("1");
        report.setReportDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-07-31 20:25:50"));
        report.setIsClosed("1");
        report.setIsPolice("1");
        report.setIsOutofLocalClaim("0");
        report.setSubrogationFlag("0");
        report.setIsSimpleClaim("1");
        report.setFirstSceneInd("0");
        report.setIsSubjectNormal("1");


        request.setReport(report);


        //车辆信息
        Vehicle vehicle = new Vehicle();
        vehicle.setSeatCount(2);
        vehicle.setBrand("福田");
        vehicle.setEngineNumber("E132");
        vehicle.setInsuredName("施正卉");
        //车辆型号
        vehicle.setModelCode("1");
        vehicle.setModelName("福田BJ6516MD2VA-XD多用途乘用车");
        vehicle.setNewCarAmount(new BigDecimal(162800.00));
        vehicle.setLicensePlate("苏JB359S");
        //车辆种类
        vehicle.setLicensePlateType("01");
        //号牌底色
        vehicle.setLicensePlateColor("02");
        //车辆种类
        vehicle.setVehicleType("96");
        vehicle.setVin("LVCP2CVA3ES017655");
        //是否按揭
        //vehicle.setIsMortgage("1");
        //是否电销
        //vehicle.setIsTelemarketing("1");
        //是否包含人伤
        vehicle.setIsPersonInjured("1");

        vehicle.setSubCompanyName("江苏分公司");
        //使用性质
        vehicle.setTypeOfUsage("101");
        //是否包含物损
        //vehicle.setIsProtectLoss("1");
        //车主
        vehicle.setOwner("海安平顺运输有限公司");


        vehicle.setIsRescue("0");
        vehicle.setIsDisassemble("0");


        request.setVehicle(vehicle);

        Injury injury = new Injury();
        //主车行驶情况
        injury.setMainDrivingStatus("2");
        //伤者交通方式
        injury.setWouTransportat("2");
        //人伤首勘地
        injury.setSurveyFirstAddress("2");
        //injury.setReceiptName("王麻子");
        //injury.setReceiptAccount("622202588521478");
        injury.setHumanName("顾菊花");
        injury.setDamageName("测试");
        injury.setDamageNo("CE000001");
        //injury.setTheInsuredName("展昭");
        injury.setHumanType("D");
        injury.setVisitTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-07-31 21:20:00"));
        injury.setMedicalExpensesFee(new BigDecimal(1200.00));
        injury.setIncomeStatus("2");
        //injury.setEngagedIndustry("");
        injury.setLossFirstType("A02");
        injury.setLossSecondType("A0201");
        injury.setIdCard("320626197004232048");
        injury.setIdCardType("01");
        injury.setTheInsuredName("施正卉");
        injury.setDamageDesc("三者车乘客现场调解。");
        injury.setHumanSex("1");
        injury.setHumanAge(45);

        request.setInjury(injury);
        request.setNotifyUrl("http://www.baidu.com");
        request.setReturnUrl("http://www.baidu.com");
        request.setTaskType("A01");

        String str  = JSONObject.toJSONString(request);
        System.out.println(str);
        System.out.println(MD5.sign(str,"1","UTF-8"));
    }
}
