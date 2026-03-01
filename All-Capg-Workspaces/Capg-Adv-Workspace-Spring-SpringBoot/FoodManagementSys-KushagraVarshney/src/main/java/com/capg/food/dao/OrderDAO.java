package com.capg.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.food.entity.FoodOrder;

@Repository
public class OrderDAO {

    @PersistenceContext
    private EntityManager em;

    public void save(FoodOrder o){
        em.persist(o);
    }

    public FoodOrder find(Long id){
        return em.find(FoodOrder.class,id);
    }
}