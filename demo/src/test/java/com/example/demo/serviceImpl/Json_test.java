package com.example.demo.serviceImpl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.bean.UserBean;
import net.minidev.json.JSONObject;
import net.sf.json.JSON;
import net.sf.json.JSONException;

import java.util.Map;

public class Json_test {
    public static void main(String[] args){
        JSONObject zhangsan = new JSONObject();
        try {
            //添加
            zhangsan.put("name", "张三");
            zhangsan.put("age", 18.4);
            zhangsan.put("birthday", "1900-20-03");
            zhangsan.put("majar", new String[] {"哈哈","嘿嘿"});
            zhangsan.put("null", null);
            zhangsan.put("house", false);
            System.out.println(zhangsan.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        UserBean u = new UserBean(1,"w","2","2");


    }
}
