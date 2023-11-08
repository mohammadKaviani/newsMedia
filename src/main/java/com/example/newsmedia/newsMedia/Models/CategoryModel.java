package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

@Entity
public class CategoryModel {

    @Id
    Integer categoryId;
    String categoryName;

    @OneToMany(mappedBy = "categoryModel",cascade = CascadeType.ALL,orphanRemoval = true)
    List<NewsModel> newsModels;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<NewsModel> getNewsModels() {
        return newsModels;
    }

    public void setNewsModels(List<NewsModel> newsModels) {
        this.newsModels = newsModels;
    }


}
