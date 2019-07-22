package com.lou.mybatis;

import com.lou.mybatis.model.enums.AccountType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyAccountTypeTypeHandler extends BaseTypeHandler<AccountType> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, AccountType parameter, JdbcType jdbcType) throws SQLException {
        System.out.println(parameter.getId());
        ps.setInt(i,parameter.getId());
    }

    @Override
    public AccountType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int i = rs.getInt(columnName);
        for (AccountType value : AccountType.values()) {
            if (value.getId() == i) {
                return value;
            }
        }
        return null;
    }

    @Override
    public AccountType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public AccountType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
