package com.apineoris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.apineoris.service.ItemService;
import com.apineoris.model.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    @Autowired
    ItemService itemService;
    
    @GetMapping("/itemByCategoriName")
    public List<Item> getMethodName(@RequestParam String category) {
        
       return  itemService.getByCategoryName(category);
    }
    
    @GetMapping("/getAll")
    public List<Item> getAllItems() {
        
       return  itemService.getAllItems();
    }

}
