package com.lou.mybatis;

import com.lou.mybatis.model.enums.BaseEnumType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyEnumTypeHandler<E extends Enum & BaseEnumType> extends BaseTypeHandler<BaseEnumType> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, BaseEnumType parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public BaseEnumType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public BaseEnumType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public BaseEnumType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
