package org.example.job.controller;

import org.example.job.entites.Category;
import org.example.job.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }


    @GetMapping("/findAll")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @PutMapping("/updateCategory/{id}")
    public Category updateCategory(@PathVariable Integer id, @RequestBody Category category) {

        category.setId(id);
        return categoryService.updateCategory(category);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
    }
}
