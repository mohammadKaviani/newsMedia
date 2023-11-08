package com.example.newsmedia.newsMedia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
public class RollClaim {
    @Id
    Integer claimId;

    String Claim;

    @ManyToOne(fetch = FetchType.LAZY)
    RollModel rollModel;

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getClaim() {
        return Claim;
    }

    public void setClaim(String claim) {
        Claim = claim;
    }

    public RollModel getRollModel() {
        return rollModel;
    }

    public void setRollModel(RollModel rollModel) {
        this.rollModel = rollModel;
    }
}
