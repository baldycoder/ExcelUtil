package com.example.excelutil.controller;

import com.alibaba.fastjson.JSON;
import com.example.excelutil.POJO.ErrRows;
import com.example.excelutil.bean.ExcelVO;
import com.example.excelutil.listener.BaseExcelListener;
import com.example.excelutil.listener.impl.MyExcelListener;
import com.example.excelutil.service.ExcelService;
import com.example.excelutil.utils.ExcelTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author ：a123145
 * @date ：Created in 2022/7/20 20:56
 * @description：读EXCELcontroller
 * @modified By：`
 * @version: 1.0
 */
@Slf4j
@RestController
public class ReadController {

    @Autowired
    ExcelService excelService;

    /**
     * 读取测试
     *
     * excel本地文件路径方式读取
     */
    @RequestMapping("/listener/import")
    public  List<ErrRows> excelImport1() {
        String readFilePath = "/Users/a123145/progrom/tmp/demo1.xlsx";
        BaseExcelListener baseExcelListener = new MyExcelListener(excelService).batchCount(1).continueAfterThrowing(true);
        List<ErrRows> errRows = ExcelTool.readExcel(readFilePath, ExcelVO.class, baseExcelListener);
        log.info("/*------- 错误的行号数为 :  {}-------*/", JSON.toJSONString(errRows));
        return errRows;
    }

    /**
     * 读取测试
     *
     * @param excel excel文件
     */
    @PostMapping("/readExcel")
    public void excelImport2(@RequestParam MultipartFile excel) {
        List<ErrRows> errRows = ExcelTool.readExcel(excel, ExcelVO.class, new MyExcelListener(excelService));
        log.info("/*------- 错误的行号数为 :  {}-------*/", JSON.toJSONString(errRows));
    }
}
