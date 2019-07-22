package com.lou.mybatis;

import org.apache.ibatis.logging.Log;

public class MyLog implements Log {

    private String temp;

    public MyLog(String temp) {
        this.temp = temp;
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void error(String s, Throwable e) {
        System.out.println(s);
    }

    @Override
    public void error(String s) {
        System.out.println(s);
    }

    @Override
    public void debug(String s) {
        System.out.println(s);
    }

    @Override
    public void trace(String s) {
        System.out.println(s);
    }

    @Override
    public void warn(String s) {
        System.out.println(s);
    }
}
