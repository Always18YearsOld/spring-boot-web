package com.atguigu.springbootwebdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author ：ltb
 * @date ：2020/6/24
 */
@RestController
public class FileUploadController {

    @PostMapping(value = "/fileUploadController")
    public String fileUpload(MultipartFile file) throws Exception{
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("D:/" + file.getOriginalFilename()));
        return "OK";
    }
}
