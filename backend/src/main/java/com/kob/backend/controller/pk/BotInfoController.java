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
    public Map<String,String> getBotInfo(){
        Map<String,String> bot = new HashMap<>();
        bot.put("name","it男");
        bot.put("rating","100");
        return bot;
    }
}
