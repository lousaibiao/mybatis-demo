package com.lou.mybatis.model;

import com.lou.mybatis.model.enums.AccountType;

import java.math.BigDecimal;

public class ComplexAccount {
    private Integer id;
    private String name;
    private Integer userId;
    private BigDecimal money;
    private AccountType accountType;

    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ComplexAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", money=" + money +
                ", accountType=" + accountType +
                ", user=" + user +
                '}';
    }
}
