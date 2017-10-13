package com.maofengqiang.controller;


import com.maofengqiang.util.SearchUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SearchController {

    private static Logger logger = Logger.getLogger(SearchController.class);

    @RequestMapping("search")
    @ResponseBody
    public Map searchFromElastic(){
        return SearchUtil.searchById("customer","external","1");
    }

    @RequestMapping("update")
    @ResponseBody
    public void updateFromElastic(){
        Map<String, String> map = new HashMap<>();
        map.put("name","deam White");
        SearchUtil.updateById("customer","external","1",map);
    }

    @RequestMapping("insert")
    @ResponseBody
    public void insertDoucmentElastic(){
        Map<String, String> map = new HashMap<>();
        map.put("name","samm Castiel");
        SearchUtil.indexByMap("customer","external","1",map);
    }

}
