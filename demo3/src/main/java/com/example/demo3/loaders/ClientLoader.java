package com.example.demo3.loaders;

import com.example.demo3.entity.Client;
import com.example.demo3.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class ClientLoader implements CommandLineRunner {
    private final ClientRepository clientRepository;
    private ClientLoader(ClientRepository clientRepository){ this.clientRepository = clientRepository;}


    @Override
    public void run(String... args) throws Exception {
        this.clientRepository.save(new Client("Иван", "Иванов", "12345@mail.ru", "+7-988-899-90-09"));
        this.clientRepository.save(new Client("Петр", "Петров", "petrushka@gmail.com", "+7-983-842-91-59"));
        this.clientRepository.save(new Client("Анна", "Кукушкина", "kukulya@gmail.com", "+7-918-844-12-34"));
        this.clientRepository.save(new Client("Валерия", "Засеева", "lera_valera@gmail.com", "+7-989-899-92-56"));
        this.clientRepository.save(new Client("Агриппина ", "Зайцева", "99999@mail.ru", "+7-988-899-45-66"));
        this.clientRepository.save(new Client("Аделаида", "Гречка", "121212@mail.ru", "+7-988-867-30-39"));
        this.clientRepository.save(new Client("Георгий", "Вартанян", "georrr@mail.ru", "+7-928-234-43-42"));
        this.clientRepository.save(new Client("Алан", "Кортиев", "alanchik@gmail.com", "+7-982-446-28-28"));
        this.clientRepository.save(new Client("Артур", "Гависов", "arturik@mail.ru", "+7-988-879-93-72"));
    }
}
