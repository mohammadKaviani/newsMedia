package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class TagModel {

    @Id
    Integer tagId;
    String tagName;

    @OneToMany(mappedBy = "tagModel",cascade = CascadeType.ALL,orphanRemoval = true)
    List<NewsModel> newsModels;


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<NewsModel> getNewsModels() {
        return newsModels;
    }

    public void setNewsModels(List<NewsModel> newsModels) {
        this.newsModels = newsModels;
    }
}
