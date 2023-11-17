package com.chen.service;


import com.chen.pojo.Items;


public interface ItemsService {
    Items queryItem(String id);
    int saveItem(Items items);
    void updateItem(String id);
    // TODO
    void deleteItem(String id);
}
