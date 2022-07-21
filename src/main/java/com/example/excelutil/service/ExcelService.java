package com.example.excelutil.service;

import com.example.excelutil.bean.ExcelVO;
import com.example.excelutil.mapper.ExcelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：a123145
 * @date ：Created in 2022/7/20 21:21
 * @description：Excel的导入服务类
 * @modified By：`
 * @version: 1.0
 */
@Service
public class ExcelService {

    @Autowired
    ExcelMapper excelMapper;

    public int insertExcelVO(List<ExcelVO> list){
        return excelMapper.insertExcelTable( list);
    }
}
