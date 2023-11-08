package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MenuModel {
    @Id
    Integer Id;
    String parentName;
    String url;
    Integer parentId;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
