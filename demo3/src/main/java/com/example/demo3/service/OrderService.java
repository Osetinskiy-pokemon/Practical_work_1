package com.example.demo3.service;

import com.example.demo3.entity.Order;
import com.example.demo3.repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public void create(Order order){
        orderRepository.save(order);
    }

    public Order update(Order order, Order orderFromDB){
        BeanUtils.copyProperties(order, orderFromDB, "id");
        return orderRepository.save(order);
    }

    public boolean delete(Order order) {
        if (order != null){
            orderRepository.delete(order);
            return true;
        }
        return false;
    }

}
