package com.lou.mybatis.model.enums;

public enum AccountType implements BaseEnumType {

    Normal(1,"普通"),
    Advanced(2,"高级");

    private final Integer typeId;
    private final String typeDesc;

    AccountType(Integer typeId, String typeDesc) {
        this.typeId = typeId;
        this.typeDesc = typeDesc;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    @Override
    public int getId() {
        return typeId;
    }
}
