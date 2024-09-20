package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<Map<String,String>> getBotInfo(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("name","tiger");
        map1.put("version","1.0.0");
        Map<String,String> map2 = new HashMap<>();
        map2.put("name","wolf");
        map2.put("version","2.0.0");
        list.add(map1);
        list.add(map2);
        return list;
    }
}
