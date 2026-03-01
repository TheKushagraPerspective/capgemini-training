package com.capg.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.food.entity.FoodItem;

@Repository
public class FoodItemDAO {

    @PersistenceContext
    private EntityManager em;

    public void save(FoodItem f){
        em.persist(f);
    }

    public FoodItem find(Long id){
        return em.find(FoodItem.class,id);
    }

    public void delete(Long id){
        FoodItem f = em.find(FoodItem.class,id);
        if(f!=null) em.remove(f);
    }
}