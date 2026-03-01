package com.capg.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.food.dao.CategoryDAO;
import com.capg.food.entity.Category;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryDAO dao;

    public void addCategory(String name,String desc){
        Category c = new Category();
        c.setCategoryName(name);
        c.setDescription(desc);
        dao.save(c);
    }

    public Category getCategory(Long id){
        return dao.find(id);
    }
}