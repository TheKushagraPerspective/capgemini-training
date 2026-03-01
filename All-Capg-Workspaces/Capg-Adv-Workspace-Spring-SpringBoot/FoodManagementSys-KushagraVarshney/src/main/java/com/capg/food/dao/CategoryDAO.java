package com.capg.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.food.entity.Category;

@Repository
public class CategoryDAO {

    @PersistenceContext
    private EntityManager em;

    public void save(Category c){
        em.persist(c);
    }

    public Category find(Long id){
        return em.find(Category.class,id);
    }

    public void delete(Long id){
        Category c = em.find(Category.class,id);
        if(c!=null) em.remove(c);
    }
}