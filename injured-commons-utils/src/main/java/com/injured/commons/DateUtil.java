package com.injured.commons;

import io.lettuce.core.output.ScanOutput;
import io.lettuce.core.output.ScoredValueScanOutput;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:27
 * @Description: 时间工具类
 */
public class DateUtil {

    static SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
    public static final String YEAR_MONTH_DAY_SECOND = "yyyy-MM-dd HH:mm:ss";
    public static final String YEAR_MONTH_DAY_SECOND2 = "yyyy/MM/dd HH:mm:ss";
    public static final String YEAR_MONTH_DAY_SECOND3 = "yyyy年MM月dd日 HH时mm分ss秒";
    public static final String YEAR_MONTH_DAY = "yyyy-MM-dd";
    public static final String YEAR_MONTH_DAY2 = "yyyy年MM月dd日";
    public static final String YEAR_MONTH_DAY_SECOND_MILLISECOND = "yyyy-MM-dd HH:mm:ss:SSS";

    /**
     * 采用 ThreadLocal 避免 SimpleDateFormat 非线程安全的问题
     * <p>
     * Key —— 时间格式
     * Value —— 解析特定时间格式的 SimpleDateFormat
     */
    private static ThreadLocal<Map<String, SimpleDateFormat>> threadLocal = new ThreadLocal<Map<String, SimpleDateFormat>>();

    /**
     * 获取解析特定时间格式的 SimpleDateFormat
     *
     * @param pattern 时间格式
     */
    private static SimpleDateFormat getDateFormat(String pattern) {
        Map<String, SimpleDateFormat> strDateFormatMap = threadLocal.get();

        if (strDateFormatMap == null) {
            strDateFormatMap = new HashMap<String, SimpleDateFormat>();
        }

        SimpleDateFormat simpleDateFormat = strDateFormatMap.get(pattern);
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
            strDateFormatMap.put(pattern, simpleDateFormat);
            threadLocal.set(strDateFormatMap);
        }

        return simpleDateFormat;
    }
    //查询当前月的所有日期
    public static List<String> getMonthFullDay(){
       SimpleDateFormat dateFormatYYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");
       LocalDate currentDate = LocalDate.now();
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM");
       String dateTime = currentDate.format(fmt);
       int year = Integer.parseInt(dateTime.substring(0,4));
       int month = Integer.parseInt(dateTime.substring(5));
        List<String> fullDayList = new ArrayList<>(32);
        // 获得当前日期对象
        Calendar cal = Calendar.getInstance();
        cal.clear();// 清除信息

        cal.set(Calendar.YEAR, year);
        // 1月从0开始
        cal.set(Calendar.MONTH, month-1 );
        // 当月1号
        cal.set(Calendar.DAY_OF_MONTH,1);
        int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int j = 1; j <= count ; j++) {
            fullDayList.add(dateFormatYYYYMMDD.format(cal.getTime()));
            cal.add(Calendar.DAY_OF_MONTH,1);
        }
        return fullDayList;
    }
    //求出本周周一的日期
    public static String getMondayOfThisWeek() {
        Calendar c = Calendar.getInstance();
        int day_of_week = c.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0)
            day_of_week = 7;
        c.add(Calendar.DATE, -day_of_week + 1);
        //System.out.println(c.getTime());
        String nowTime = format.format(c.getTime())+" "+"00:00:00";
        return nowTime;
    }

    /**
     * 时间格式化
     *
     * @param date：要格式化的时间
     * @param pattern：要格式化的类型
     */
    public static String formatDate(Date date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        }

        return getDateFormat(pattern).format(date);
    }

    /**
     　　* @description: 获取某时间减去N分钟之后的时间
     　　* @param [nowTime, minutes]
     　　* @return java.util.Date
     　　* @throws
     　　* @author LZX
     　　* @date 2019/5/15 17:46
     　　*/
    public static Date dateMinusMinutes(LocalDateTime nowTime, Long minutes) {
        LocalDateTime minusMinutes = nowTime.minusMinutes(minutes);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = minusMinutes.atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    // 获得某天最大时间 2017-10-15 23:59:59
    public static Date getEndOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());;
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    // 获得某天最小时间 2017-10-15 00:00:00
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static String getTimeUntil(Date begin,Date end){
        try {
            BigDecimal between=new BigDecimal(end.getTime()-begin.getTime()).divide(new BigDecimal(1000));//除以1000是为了转换成秒

            BigDecimal hourBig = new BigDecimal(0);
            if(between.compareTo(new BigDecimal(3600)) >= 0){
                hourBig = between.divide(new BigDecimal(3600),0,BigDecimal.ROUND_DOWN);
            }
            between = between.subtract(new BigDecimal(3600).multiply(hourBig));
            BigDecimal minuteBig=between.divide(new BigDecimal(60),0,BigDecimal.ROUND_DOWN);
            between = between.subtract(new BigDecimal(60).multiply(minuteBig));
            BigDecimal secondBig=between.divide(new BigDecimal(60),0,BigDecimal.ROUND_DOWN);

            Long hour = hourBig.longValue();
            Long minute = minuteBig.longValue();
            //Long second = secondBig.longValue();
            if(hour.toString().length() == 1
                    && minute.toString().length() == 1){
                return "0"+ hour + "时" +"0"+ minute +"分";
            }else if(hour.toString().length() == 1){
                if(minute == 0){
                    return "0"+ hour + "时00分";
                }
                return "0"+ hour + "时" + minute + "分" ;
            }else{
                BigDecimal dayBig = hourBig.divide(new BigDecimal(24), 2, RoundingMode.HALF_UP);
                String dayStr = dayBig.toString();
                String day = null;
                String hourStr = null;
                if(dayStr.contains(".")) {
                    day = dayStr.substring(0, dayStr.indexOf("."));
                    hourStr = dayStr.substring(dayStr.indexOf(".") + 1, dayStr.length());
                    BigDecimal hourBig2 = new BigDecimal("0."+hourStr).multiply(new BigDecimal(24)).setScale(0,BigDecimal.ROUND_HALF_UP);
                    hourStr = hourBig2 .toString();
                }

                if(minute.toString().length() == 1) {
                    if (hourStr.length() == 1) {
                        return day + "天 0" + hourStr + "时" + "0" + minute + "分";
                    }
                    return day + "天 " + hourStr + "时" + "0" + minute + "分";
                }else{
                    if(hourStr.length() == 1) {
                        return day + "天 0" +  hourStr + "时" + minute + "分";
                    }
                    return day + "天 " +  hourStr + "时" + minute + "分";
                }
            }
        }catch(Exception e){

        }
        return null;
    }


    public static int getDaysBetweenHour(Date smallDate,Date bigDate){
        return (int) ((bigDate.getTime() - smallDate.getTime())/(1000 * 60 * 60));
    }


    public static void main(String[] args) throws ParseException {
       /* long number = System.currentTimeMillis()-new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-01 16:50:00").getTime();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(number);
        System.out.println(number+ " = " + formatter.format(calendar.getTime()));*/
        //System.out.println(getTimeUntil(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-01 16:00:00"),new Date()));
        //System.out.println(getMonthFullDay());
        //Time time1 = new Time();
        String str = "4.5";
        System.out.println(str.substring(0,str.indexOf(".")));
        System.out.println(str.substring(str.indexOf(".")+1,str.length()));
    }
}
