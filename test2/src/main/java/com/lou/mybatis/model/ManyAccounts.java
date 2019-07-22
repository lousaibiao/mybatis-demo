package com.lou.mybatis.model;

import java.util.List;

public class ManyAccounts {
    private List<Account> accounts;
    private String batchId;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Override
    public String toString() {
        return "ManyAccounts{" +
                "accounts=" + accounts +
                ", batchId='" + batchId + '\'' +
                '}';
    }
}
