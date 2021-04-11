package com.example.demo3.repository;

import com.example.demo3.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//import requests;
//import json;
//d = {"asd": 1}
//reqsts.post(d)

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByCliId(Long id);
}
