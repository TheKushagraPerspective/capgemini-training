package com.capg.food.app.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.food.service.CategoryService;
import com.capg.food.service.FoodService;
import com.capg.food.service.OrderService;

public class FoodManagementApplication {

    public static void main(String[] args){

        ApplicationContext ctx =
        new ClassPathXmlApplicationContext("spring.xml");

        CategoryService cs = ctx.getBean(CategoryService.class);
        FoodService fs = ctx.getBean(FoodService.class);
        OrderService os = ctx.getBean(OrderService.class);

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1.Add Category");
            System.out.println("2.Add Food Item");
            System.out.println("3.Place Order");
            System.out.println("4.Exit");

            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    System.out.println("Name:");
                    String name = sc.next();
                    System.out.println("Desc:");
                    sc.nextLine();
                    String desc = sc.nextLine();
                    cs.addCategory(name,desc);
                    break;

                case 2:
                    System.out.println("Category Id:");
                    Long cid = sc.nextLong();
                    System.out.println("Item Name:");
                    String iname = sc.next();
                    System.out.println("Price:");
                    double price = sc.nextDouble();
                    fs.addFoodItem(cid,iname,price);
                    break;

                case 3:
                    System.out.println("Customer Name:");
                    String cname = sc.next();

                    System.out.println("Enter Item IDs:");
                    List<Long> ids = new ArrayList<>();
                    ids.add(sc.nextLong());

                    os.placeOrder(ids,cname);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}