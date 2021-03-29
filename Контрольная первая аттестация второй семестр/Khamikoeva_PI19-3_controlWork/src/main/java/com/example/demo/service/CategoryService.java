package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public void create(Category category){
        categoryRepository.save(category);
    }

    public Category update(Category category, Category categoryFromDB){
        BeanUtils.copyProperties(category, categoryFromDB, "id");
        return categoryRepository.save(category);
    }

    public boolean delete(Category category) {
        if (category != null){
            categoryRepository.delete(category);
            return true;
        }
        return false;
    }
}
