package com.capg.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.food.dao.CategoryDAO;
import com.capg.food.dao.FoodItemDAO;
import com.capg.food.entity.Category;
import com.capg.food.entity.FoodItem;

@Service
@Transactional
public class FoodService {

    @Autowired
    private FoodItemDAO foodDAO;

    @Autowired
    private CategoryDAO categoryDAO;

    public void addFoodItem(Long catId,String name,double price){

        Category c = categoryDAO.find(catId);

        FoodItem f = new FoodItem();
        f.setItemName(name);
        f.setPrice(price);
        f.setCategory(c);

        foodDAO.save(f);
    }

    public void removeFoodItem(Long id){
        foodDAO.delete(id);
    }
}