package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("/getBotInfo/")

    public Map<String, String> getBotInfo() {
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> bot=new HashMap<>();

        bot.put("name", "tiger");
        bot.put("rating", "1500");
        return bot;
    }
}
