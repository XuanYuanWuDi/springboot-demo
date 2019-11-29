package com.injured.server.api.model.workbench;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/*
  每天完成的任务数量
  @author cm
 */
@Getter
@Setter
@ToString
public class DateNum implements Serializable {
    /*
     查询到日期
     */
    private String dateTime;
    /*
     每日的完成任务数量
     */
    private int num=0;
}
