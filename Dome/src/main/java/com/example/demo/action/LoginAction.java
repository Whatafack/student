package com.example.demo.action;

import com.example.demo.entity.DpdouyUserEntity;
import com.example.demo.entity.DpdouyVideoEntity;
import com.example.demo.service.DpdouyUserServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Api(description = "注册登录")
@RestController
public class LoginAction {
    @Autowired
    DpdouyUserServiceI dpdouyUserService;

    @ApiOperation(value = "登录" , notes="登录")
    @RequestMapping(value="login",method = RequestMethod.POST)
    public int login(DpdouyUserEntity dpdouyUserEntity){
        return  dpdouyUserService.login(dpdouyUserEntity);
    }

    @ApiOperation(value = "注册" , notes="注册")
    @RequestMapping(value="register",method = RequestMethod.POST)
    public int register(DpdouyUserEntity dpdouyUserEntity){
        return  dpdouyUserService.reg1ister(dpdouyUserEntity);
    }

    @ApiOperation(value = "上传文件" , notes="上传文件")
    @RequestMapping(value="/upload",method = RequestMethod.POST)
    public String upload(@RequestParam("crowd_file") MultipartFile file,DpdouyVideoEntity dpdouyVideoEntity) {
        String fileName = file.getOriginalFilename();
        String filePath = "D:\\"+fileName;
        saveFile(file,filePath);
        dpdouyVideoEntity.setVideoUrl(fileName);
        System.out.println(dpdouyVideoEntity);
         dpdouyUserService.upload(dpdouyVideoEntity);
        return "上传成功!";
    }
    public void saveFile(MultipartFile file,String filePath){
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(filePath);
            out.write(file.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
