package com.sy.controller.yhb;

import com.sy.model.resp.BaseResp;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

@Controller
@Scope("prototype")
public class UploadController {
    /**
     * 文件上传目录的路径
     * TODO:可以配置在properties中，通过@Value注解注入
     */
    private static final String UPLOAD_DIR = "D:\\SL\\sl\\src\\main\\webapp\\headImg\\";
    //private static final String UPLOAD_DIR2 = "d:\\imgs\\";
    /**
     * ajax上传
     */
    @RequestMapping("/statics/html/identityCardload")
    @ResponseBody
    public BaseResp ajaxUpload(@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        BaseResp baseResp=new BaseResp();
        //1.判断保存上传文件的目录是否存在，如果不存在，则创建之
        File saveDir = new File(UPLOAD_DIR);
        if (!saveDir.exists()) {
            saveDir.mkdirs();
        }
        //2.构建保存时文件的文件名：uuid+.+原来文件的类型
        String oldFileName = file.getOriginalFilename();

        String newFileName = UUID.randomUUID().toString().replace("-", "") + "."
                + oldFileName.substring(oldFileName.lastIndexOf(".") + 1);
        //3.将上传以后的文件对应的输入流拷贝到服务器文件对应的输出流
        // --文件上传的本质
        try (InputStream is = file.getInputStream();
             OutputStream os = new FileOutputStream(UPLOAD_DIR + newFileName);
        ) {
            FileCopyUtils.copy(is, os);
            String str=UPLOAD_DIR.substring(UPLOAD_DIR.indexOf("webapp\\")+"webapp\\".length());
            baseResp.setData(str + newFileName);
            baseResp.setSuccess(1);
        } catch (Exception e) {
            baseResp.setSuccess(0);
            baseResp.setErrorMsg("文件上传出错");
            e.printStackTrace();
        }
        //TODO:如果成功上传，可以在json中携带用来显示图片的url路径
        return baseResp;
    }

    @RequestMapping("/statics/html/identityCardload1")
    @ResponseBody
    public BaseResp ajaxUpload1(@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        BaseResp baseResp=new BaseResp();
        //1.判断保存上传文件的目录是否存在，如果不存在，则创建之
        File saveDir = new File(UPLOAD_DIR);
        if (!saveDir.exists()) {
            saveDir.mkdirs();
        }
        //2.构建保存时文件的文件名：uuid+.+原来文件的类型
        String oldFileName = file.getOriginalFilename();

        String newFileName = UUID.randomUUID().toString().replace("-", "") + "."
                + oldFileName.substring(oldFileName.lastIndexOf(".") + 1);
        //3.将上传以后的文件对应的输入流拷贝到服务器文件对应的输出流
        // --文件上传的本质
        try (InputStream is = file.getInputStream();
             OutputStream os = new FileOutputStream(UPLOAD_DIR + newFileName);
        ) {
            FileCopyUtils.copy(is, os);
            String str=UPLOAD_DIR.substring(UPLOAD_DIR.indexOf("webapp\\")+"webapp\\".length());
            baseResp.setData(str + newFileName);
            baseResp.setSuccess(1);
        } catch (Exception e) {
            baseResp.setSuccess(0);
            baseResp.setErrorMsg("文件上传出错");
            e.printStackTrace();
        }
        //TODO:如果成功上传，可以在json中携带用来显示图片的url路径
        return baseResp;
    }
}
