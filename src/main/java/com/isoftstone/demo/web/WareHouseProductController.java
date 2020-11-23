package com.isoftstone.demo.web;

import com.isoftstone.demo.pojo.WareHouseProduct;
import com.isoftstone.demo.service.WareHouseProductService;
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
public class WareHouseProductController {

    @Autowired
    private WareHouseProductService wareHouseProductService;

    @RequestMapping(value = "/getWarehouseProductById" ,method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getWarehouseProductById(int id) {
        Map<String,Object> model = new HashMap<>();
        Logger logger = LoggerFactory.getLogger(WareHouseController.class);
        List<WareHouseProduct> products = null;
        try {
            products = wareHouseProductService.getWarehouseProductById(id);
            model.put("list",products);
            model.put("success",true);
        } catch (Exception e) {
            model.put("success",false);
            model.put("msg",e.toString());
            logger.error(e.toString());
        }
        return model;
    }
}
