package com.dhy.file.controller;

import com.alibaba.fastjson.JSON;
import com.dhy.file.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Slf4j
@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping(value = "/file/get")
    public String getFile(String path) {

        List<String> fileList = fileService.getFileName(path);

        if (CollectionUtils.isEmpty(fileList)) {
            log.error("获取到的文件列表为空, 查询参数为:{}", path);
            return "failed";
        }


        return JSON.toJSONString(fileList);
    }

    @PostMapping(value = "/file/rename")
    public String rename(HttpServletRequest request) {


        String arr = request.getParameter("param");
        String path = request.getParameter("path");

        List<String> fileList = fileService.getFileName(path);

        if (CollectionUtils.isEmpty(fileList)) {
            return "failed";
        }


        return JSON.toJSONString(fileList);
    }


}
