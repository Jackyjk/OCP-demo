package com.isoftstone.demo.web;

import com.isoftstone.demo.pojo.AgentUser;
import com.isoftstone.demo.pojo.Shop;
import com.isoftstone.demo.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/getAgentShops" ,method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getShopsByAgentId(HttpServletRequest request) {
        Map<String,Object> map = new HashMap<>();
        Logger logger = LoggerFactory.getLogger(ShopController.class);
        AgentUser user = ((AgentUser) request.getSession().getAttribute("agentUser"));
        try {
            List<Shop> shops = shopService.getShopsByAgentId(user.getId());
            map.put("success",true);
            map.put("shops",shops);
        } catch (Exception e) {
            map.put("success",false);
            map.put("msg",e.toString());
            logger.error(e.toString());
        }
        return map;
    }
}
