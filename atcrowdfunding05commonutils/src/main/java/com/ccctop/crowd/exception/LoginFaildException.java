package com.ccctop.crowd.exception;
/*
* 登录失败后抛出异常
* */
public class LoginFaildException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public LoginFaildException() {
    }

    public LoginFaildException(String s) {
        super(s);
    }

    public LoginFaildException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public LoginFaildException(Throwable throwable) {
        super(throwable);
    }

    public LoginFaildException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
