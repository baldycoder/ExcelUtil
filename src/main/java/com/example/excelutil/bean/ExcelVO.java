package com.example.excelutil.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ：a123145
 * @date ：Created in 2022/7/20 20:53
 * @description：实体bean
 * @modified By：`
 * @version: 1.0
 */

@Component
@Data
@ToString
public class ExcelVO {
    @ExcelProperty("员工编号")
    Integer workId;
    @ExcelProperty("姓名")
    String userName;
    @ExcelProperty("年龄")
    Integer age;
    @ExcelProperty("日期")
    @DateTimeFormat(value = "YYYY-MM-DD hh:mm:ss")
    Date workdate;
}
