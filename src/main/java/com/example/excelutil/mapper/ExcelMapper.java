package com.example.excelutil.mapper;

import com.example.excelutil.bean.ExcelVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：a123145
 * @date ：Created in 2022/7/20 21:00
 * @description：Excel入库mapper
 * @modified By：`
 * @version: 1.0
 */
@Mapper
public interface ExcelMapper {

    int insertExcelTable(List<ExcelVO> cachedDataList);
}
