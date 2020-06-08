package com.ccctop.crowd.exception;
/*
* 表示用户没有登录就访问受保护资源时抛出的异常
*
* */
public class AccessForbiddenException extends RuntimeException{
    private static final long serialVersionUID = 8730782733834090098L;

    public AccessForbiddenException() {
        super();
    }

    public AccessForbiddenException(String s) {
        super(s);
    }

    public AccessForbiddenException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AccessForbiddenException(Throwable throwable) {
        super(throwable);
    }

    protected AccessForbiddenException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
