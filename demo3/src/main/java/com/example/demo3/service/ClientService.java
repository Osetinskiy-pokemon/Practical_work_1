package com.example.demo3.service;

import com.example.demo3.entity.Client;
import com.example.demo3.repository.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public void create(Client client){
        clientRepository.save(client);
    }

    public Client update(Client client, Client clientFromDB){
        BeanUtils.copyProperties(client, clientFromDB, "id");
        return clientRepository.save(client);
    }

    public boolean delete(Client client) {
        if (client != null){
            clientRepository.delete(client);
            return true;
        }
        return false;
    }

}
