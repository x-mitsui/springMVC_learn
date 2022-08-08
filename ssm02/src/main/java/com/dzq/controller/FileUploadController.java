package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileUploadController {
    // 前台异步请求

    @ResponseBody
    @RequestMapping("fileUpload.do")
    public Map<String,String> fileUploaD(MultipartFile nameToUseByController, HttpServletRequest req) throws IOException {
        Map<String,String> rlt = new HashMap<String, String>();
        String realUploadPath = req.getServletContext().getRealPath("upload");
        if(nameToUseByController.getSize()>1024*1204*5){
            rlt.put("message","文件大小不能超过5MB");
            return rlt;
        }
        // 指定文件存储目录
        File dir = new File(realUploadPath);

        if(!dir.exists()){
            dir.mkdirs();//可能会创建多层路径，索性用mkdirs
        }

        // 原文件名
        String originalFilename = nameToUseByController.getOriginalFilename();

        String extName = originalFilename.substring(originalFilename.lastIndexOf('.'));

        if(!".png".equals(extName)){
            rlt.put("message","不支持的文件类型");
            return rlt;
        }
        String newFileName = UUID.randomUUID().toString().concat(extName);

        // 文件具体位置
        File file = new File(dir, newFileName);

        // 往目标传输
        nameToUseByController.transferTo(file);

        rlt.put("filename",newFileName);
        rlt.put("url","upload/".concat(newFileName));
        rlt.put("message","OK");
        rlt.put("fileType",nameToUseByController.getContentType());
        return rlt;
    }
}
