package com.lou.mybatis.model;

import java.util.List;

public class ComplexUser {
    private Integer id;
    private String name;
    private Integer age;

    private List<Account> accounts;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "ComplexUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                '}';
    }
}
