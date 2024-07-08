package com.apineoris.service;

import java.util.List;

import com.apineoris.model.Item;

public interface IItemService {
    public List<Item> getByCategoryName(String category);
    public List<Item> getAllItems();
}
