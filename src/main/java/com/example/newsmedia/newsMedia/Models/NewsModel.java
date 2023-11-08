package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class NewsModel {


    @Id
    Integer newsId;
    String title;
    String abstractNews;
    String description;
    String imageName;
    String datePublish;
    Integer userId;
    boolean isPublish;
    String url;
    String kewWords;
    String metaDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    CategoryModel categoryModel;
    @ManyToOne(fetch = FetchType.LAZY)
    TagModel tagModel;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractNews() {
        return abstractNews;
    }

    public void setAbstractNews(String abstractNews) {
        this.abstractNews = abstractNews;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(String datePublish) {
        this.datePublish = datePublish;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public boolean isPublish() {
        return isPublish;
    }

    public void setPublish(boolean publish) {
        isPublish = publish;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKewWords() {
        return kewWords;
    }

    public void setKewWords(String kewWords) {
        this.kewWords = kewWords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public CategoryModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CategoryModel categoryModel) {
        this.categoryModel = categoryModel;
    }

    public TagModel getTagModel() {
        return tagModel;
    }

    public void setTagModel(TagModel tagModel) {
        this.tagModel = tagModel;
    }
}
