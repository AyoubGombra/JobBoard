package org.example.job.service;
import org.example.job.entites.Category;
import org.example.job.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    public void deleteCategory(Integer idCategory) {
        categoryRepo.deleteById(idCategory);
    }

    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    public Category updateCategory(Category category) {
        return categoryRepo.findById(category.getId())
                .map(existingEvent -> {
                    existingEvent.setId(category.getId());
                    existingEvent.setName(category.getName());
                    existingEvent.setDescription(category.getDescription());
                    return categoryRepo.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + category.getId()));
    }
}
