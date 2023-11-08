package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ViewModel {

    @Id
    Integer viewId;
    Integer newsId;
    String ipAddress;
    String lastDate;
    Integer numberVisit;

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public Integer getNumberVisit() {
        return numberVisit;
    }

    public void setNumberVisit(Integer numberVisit) {
        this.numberVisit = numberVisit;
    }

}
