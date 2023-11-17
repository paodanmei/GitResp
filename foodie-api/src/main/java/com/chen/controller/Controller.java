package com.chen.controller;


import com.chen.pojo.Items;
import com.chen.service.ItemsService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class Controller {

    @Autowired
    public ItemsService itemsService;

    @RequestMapping(path="/selectItems/{itemId}", method = RequestMethod.GET)
    public Items selectItems(@ApiParam(name = "itemId", value = "商品id", required = true)
                                 @PathVariable String itemId){
        /*http://localhost:8088/items/selectItems/cake-48*/
        return itemsService.queryItem(itemId);
    }
    @RequestMapping(path="/selectItems", method = RequestMethod.GET)
    public Items selectItems1(String id){
        /*http://localhost:8088/items/selectItems?id=cake-48*/
        return itemsService.queryItem(id);
    }

}
