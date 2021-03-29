package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {this.categoryService = categoryService; }

    //получение значения по login
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getOne(@PathVariable(name = "id") Category category) {
        final Category currentCategory = category;
        return category != null
                ? new ResponseEntity<>(currentCategory, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<?> create (@RequestBody Category category){
        categoryService.create(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<Category>> readAll(){
        final List<Category> categoryList = categoryService.findAll();
        return categoryList != null && !categoryList.isEmpty()
                ? new ResponseEntity<>(categoryList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> put(@PathVariable(name = "id") Category categoryFromDB,
                                 @RequestBody Category category){
        Category updatedCategory = categoryService.update(category, categoryFromDB);
        return updatedCategory != null
                ? new ResponseEntity<>(updatedCategory, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<Category>> delete(@PathVariable(name = "id") Category category){
        if (categoryService.delete(category)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
