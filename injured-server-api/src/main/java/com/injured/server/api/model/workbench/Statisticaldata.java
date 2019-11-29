package com.injured.server.api.model.workbench;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
@Setter
@Getter
@ToString
public class Statisticaldata implements Serializable {
    //未处理的总数据
    private Integer untreatedNum;
    //今日处理完成的数据
    private Integer todayProcessed;
    //本周处理完成的数据
    private Integer weekProcessed;
    //本月处理完成的数据
    private List<DateNum> currentDate;
}
