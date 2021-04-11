package com.example.demo3.service;//package kursach.khamikoeva_version2.service;
//
//import kursach.khamikoeva_version2.entity.Basket;
//import kursach.khamikoeva_version2.repository.BasketRepository;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BasketService {
//    @Autowired
//    private BasketRepository basketRepository;
//
//    public List<Basket> findAll(){
//        return basketRepository.findAll();
//    }
//
//    public void create(Basket basket){
//        basketRepository.save(basket);
//    }
//
//    public Basket update(Basket basket, Basket basketFromDB){
//        BeanUtils.copyProperties(basket, basketFromDB, "id");
//        return basketRepository.save(basket);
//    }
//
//    public boolean delete(Basket basket) {
//        if (basket != null){
//            basketRepository.delete(basket);
//            return true;
//        }
//        return false;
//    }
//
//}
