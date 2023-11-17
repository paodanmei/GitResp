package com.chen.service.impl;

import com.chen.mapper.ItemsMapper;
import com.chen.pojo.Items;
import com.chen.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items queryItem(String id) {
        System.out.println("");
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveItem(Items items) {
        return itemsMapper.insert(items);
    }

    @Override
    public void updateItem(String id) {
    }

    @Override
    public void deleteItem(String id) {
    }
}
