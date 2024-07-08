package com.apineoris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apineoris.model.Item;
import com.apineoris.repository.ItemRepository;

@Component
public class ItemService implements IItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getByCategoryName(String category){

        return itemRepository.findByCategoryName(category);
    }
    public List<Item> getAllItems(){

        return itemRepository.findAll();
    }
}
