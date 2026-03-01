package com.capg.food.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.food.dao.FoodItemDAO;
import com.capg.food.dao.OrderDAO;
import com.capg.food.entity.FoodItem;
import com.capg.food.entity.FoodOrder;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private FoodItemDAO foodDAO;

    public void placeOrder(List<Long> ids,String name){

        List<FoodItem> items = new ArrayList<>();
        double total=0;

        for(Long id:ids){
            FoodItem f = foodDAO.find(id);
            items.add(f);
            total += f.getPrice();
        }

        FoodOrder o = new FoodOrder();
        o.setCustomerName(name);
        o.setOrderDate(new Date());
        o.setFoodItems(items);
        o.setTotalAmount(total);

        orderDAO.save(o);
    }
}