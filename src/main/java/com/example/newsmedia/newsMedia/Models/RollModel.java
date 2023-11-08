package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class RollModel {


    @Id
    Integer rollId;
    String rollName;

    public List<RollClaim> getRollClaims() {
        return rollClaims;
    }

    public void setRollClaims(List<RollClaim> rollClaims) {
        this.rollClaims = rollClaims;
    }

    @OneToMany(mappedBy = "rollModel" ,cascade = CascadeType.ALL, orphanRemoval = true)
    List<UsersModel> usersModels;

    @OneToMany(mappedBy = "rollModel" ,cascade = CascadeType.ALL, orphanRemoval = true)
    List<RollClaim> rollClaims;


    public Integer getRollId() {
        return rollId;
    }

    public void setRollId(Integer rollId) {
        this.rollId = rollId;
    }

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }

    public List<UsersModel> getUsersModels() {
        return usersModels;
    }

    public void setUsersModels(List<UsersModel> usersModels) {
        this.usersModels = usersModels;
    }
}
