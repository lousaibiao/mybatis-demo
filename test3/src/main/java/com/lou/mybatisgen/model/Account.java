package com.lou.mybatisgen.model;

import java.math.BigDecimal;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Account.Id
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Account.Name
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Account.UserId
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Account.Money
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Account.AccountType
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    private Byte accounttype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Account.Id
     *
     * @return the value of Account.Id
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Account.Id
     *
     * @param id the value for Account.Id
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Account.Name
     *
     * @return the value of Account.Name
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Account.Name
     *
     * @param name the value for Account.Name
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Account.UserId
     *
     * @return the value of Account.UserId
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Account.UserId
     *
     * @param userid the value for Account.UserId
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Account.Money
     *
     * @return the value of Account.Money
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Account.Money
     *
     * @param money the value for Account.Money
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Account.AccountType
     *
     * @return the value of Account.AccountType
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public Byte getAccounttype() {
        return accounttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Account.AccountType
     *
     * @param accounttype the value for Account.AccountType
     *
     * @mbg.generated Mon Jul 22 09:29:25 CST 2019
     */
    public void setAccounttype(Byte accounttype) {
        this.accounttype = accounttype;
    }
}