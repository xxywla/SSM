package com.xxyw.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class TestFileUpDownController {

    @RequestMapping("/file/down")
    public ResponseEntity<byte[]> downFile(HttpSession session) throws IOException {
        ServletContext servletContext = session.getServletContext();
        String path = servletContext.getRealPath("/img/serverFile.txt");
        InputStream is = new FileInputStream(path);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=file.txt");
        HttpStatus httpStatus = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, httpStatus);
        is.close();
        return responseEntity;
    }

    @RequestMapping("/file/up")
    public String upFile(MultipartFile textFile, HttpSession session) throws IOException {
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("upload");
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdir();
        }
        String fileName = textFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffix;
        String finalFileName = realPath + File.separator + fileName;
        textFile.transferTo(new File(finalFileName));
        return "success";
    }
}
