package com.example.excelutil.listener.impl;

import com.example.excelutil.bean.ExcelVO;
import com.example.excelutil.listener.BaseExcelListener;
import com.example.excelutil.service.ExcelService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ：a123145
 * @date ：Created in 2022/7/20 21:17
 * @description：Excel的listener继承自抽象封装类BaseExcelListener
 * @modified By：`
 * @version: 1.0
 */
@Slf4j
@AllArgsConstructor
public class MyExcelListener extends BaseExcelListener<ExcelVO> {

    //通过lombok的全参构造方法，将controller中spring管理的service传入进来
    private ExcelService excelService;

    //逻辑校验，返回true则校验通过，返回false校验不通过
    @Override
    public boolean validateBeforeAddData(ExcelVO vo) {
        Integer age = vo.getAge();
        if(null == age && age <=0)
            return false;

        return true;
    }

    @Override
    public void doService() {
        //父类有数组存储data,lombok的@Getter
        this.excelService.insertExcelVO(this.getData());

    }
}
