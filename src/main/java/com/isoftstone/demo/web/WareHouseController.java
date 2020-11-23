package com.isoftstone.demo.web;

import com.isoftstone.demo.pojo.WareHouse;
import com.isoftstone.demo.service.WareHouseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WareHouseController {

    @Autowired
    private WareHouseService wareHouseService;

    @RequestMapping(value = "/getAllWareHouse",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> listWareHouse() {
        Map<String,Object> model = new HashMap<>();
        Logger logger = LoggerFactory.getLogger(WareHouseController.class);
        List<WareHouse> houses = null;
        try {
            houses = wareHouseService.getAllWareHouse();
            model.put("houses",houses);
            model.put("success","true");
        } catch (Exception e) {
            model.put("success",false);
            model.put("msg",e.toString());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return model;
    }
}
