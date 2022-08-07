package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    // 前台异步请求

    @ResponseBody
    @RequestMapping("fileUpload.do")
    public String fileUploaD(MultipartFile nameToUseByController, HttpServletRequest req) throws IOException {

        String realUploadPath = req.getServletContext().getRealPath("upload");
        // 指定文件存储目录
        File dir = new File(realUploadPath);

        if(!dir.exists()){
            dir.mkdirs();//可能会创建多层路径，索性用mkdirs
        }

        // 原文件名
        String originalFilename = nameToUseByController.getOriginalFilename();

        // 文件具体位置
        File file = new File(dir, originalFilename);

        // 往目标传输
        nameToUseByController.transferTo(file);

        return "OK";
    }
}
