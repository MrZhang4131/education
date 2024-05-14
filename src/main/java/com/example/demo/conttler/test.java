package com.example.demo.conttler;

import com.example.demo.Service.OpenID_Service;
import com.example.demo.Service.TestService;
import com.example.demo.pojo.User;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;


@RestController
public class test {
    @Autowired
    private TestService testService;
    @Autowired
    private OpenID_Service openIDService;
    @RequestMapping("/test")

    public String test() throws IOException {
        System.out.println("1");
        String str=testService.json();
        Gson gson = new Gson();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        FileInputStream inputStream =null;
//        System.out.println(username);
//        System.out.println(password);

        return "test";
    }
    @RequestMapping("/img1")
    public byte[] test1(String path) throws IOException {
//        System.out.println(data);
//        String str=testService.json();
//        return "hello esp32";

            InputStream in = null ;
            in= new FileInputStream("C:\\Users\\31283\\Desktop\\test1.jpg");
            return IOUtils.toByteArray(in);


    }
    @GetMapping(value = "/img",
            produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public byte[] getImage() throws IOException {
        final InputStream in = new FileInputStream("C:\\Users\\31283\\Desktop\\test1.jpg");
        return IOUtils.toByteArray(in);
    }

}
//    @RequestMapping("/hello2")
//    public String test2(){
//        System.out.println("1");
//        String str=testService.json();
//        return "{\n" +
//                "  \"imgListData\": [\n" +
//                "    {\n" +
//                "      \"id\": \"1\",\n" +
//                "      \"title\": \"标题描述\",\n" +
//                "      \"content\": \"内容描述 \",\n" +
//                "      \"city\": \"详细地址\",\n" +
//                "      \"adrs\": \"上海\",\n" +
//                "      \"room\": \"楼房描述\",\n" +
//                "      \"imgUrl\": \"https://upload-images.jianshu.io/upload_images/13570975-792453585d7b84af.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240\",\n" +
//                "      \"dataTimes\": \"时间\",\n" +
//                "      \"peo\": \"姓名\",\n" +
//                "      \"tel\": \"手机号\",\n" +
//                "      \"pho\": \"照片地址\",\n" +
//                "      \"money\": \"价格\",\n" +
//                "      \"unitprice\": \"单价\",\n" +
//                "      \"tag\": [\n" +
//                "        {\n" +
//                "          \"tags\": \"标签一\"\n" +
//                "        },{\n" +
//                "          \"tags\": \"标签七\"\n" +
//                "        },{\n" +
//                "          \"tags\": \"标签八\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"id\": \"2\",\n" +
//                "      \"title\": \"标题描述\",\n" +
//                "      \"content\": \"内容描述 \",\n" +
//                "      \"city\": \"详细地址\",\n" +
//                "      \"adrs\": \"上海\",\n" +
//                "      \"room\": \"楼房描述\",\n" +
//                "      \"imgUrl\": \"https://upload-images.jianshu.io/upload_images/13570975-792453585d7b84af.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240\",\n" +
//                "      \"dataTimes\": \"时间\",\n" +
//                "      \"peo\": \"姓名\",\n" +
//                "      \"tel\": \"手机号\",\n" +
//                "      \"pho\": \"照片地址\",\n" +
//                "      \"money\": \"价格\",\n" +
//                "      \"unitprice\": \"单价\",\n" +
//                "      \"tag\": [\n" +
//                "        {\n" +
//                "          \"tags\": \"标签二\"\n" +
//                "        },{\n" +
//                "          \"tags\": \"标签六\"\n" +
//                "        },{\n" +
//                "          \"tags\": \"标签七\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";
//    }