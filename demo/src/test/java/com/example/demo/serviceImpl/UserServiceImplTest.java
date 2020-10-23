//package com.example.demo.serviceImpl;
//
//import com.example.demo.bean.UserBean;
//import com.example.demo.service.UserService;
//import net.minidev.json.JSONObject;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.IOException;
//
//class UserServiceImplTest {
//
//    public static String send(String url, JSONObject jsonObject, String encoding) throws ParseException, IOException {
//        String body = "";
//
//        //创建httpclient对象
//        CloseableHttpClient client = HttpClients.createDefault();
//        //创建post方式请求对象
//        HttpPost httpPost = new HttpPost(url);
//
//        //装填参数
//        StringEntity s = new StringEntity(jsonObject.toString(), "utf-8");
//        s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
//                "application/json"));
//        //设置参数到请求对象中
//        httpPost.setEntity(s);
//        System.out.println("请求地址："+url);
////        System.out.println("请求参数："+nvps.toString());
//
//        //设置header信息
//        //指定报文头【Content-type】、【User-Agent】
////        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
//        httpPost.setHeader("Content-type", "application/json");
//        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
//
//        //执行请求操作，并拿到结果（同步阻塞）
//        CloseableHttpResponse response = client.execute(httpPost);
//        //获取结果实体
//        HttpEntity entity = response.getEntity();
//        if (entity != null) {
//            //按指定编码转换结果实体为String类型
//            body = EntityUtils.toString(entity, encoding);
//        }
//        EntityUtils.consume(entity);
//        //释放链接
//        response.close();
//        return body;
//    }
//
//}