package com.lou.mybatis.model;

public class AccountCondition {
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AccountCondition{" +
                "userId=" + userId +
                '}';
    }
}
