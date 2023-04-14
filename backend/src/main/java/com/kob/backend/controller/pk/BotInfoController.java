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

    public List<Map<String, String>> getBotInfo() {
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> map1=new HashMap<>();
        Map<String, String> map2=new HashMap<>();

        map1.put("name", "tiger");
        map1.put("age", "14");

        map2.put("name", "lion");
        map2.put("age", "12");

        list.add(map1);
        list.add(map2);
        return list;
    }
}
