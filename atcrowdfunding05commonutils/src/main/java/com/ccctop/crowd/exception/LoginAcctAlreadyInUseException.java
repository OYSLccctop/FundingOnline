package com.ccctop.crowd.exception;
/*
* 保存或更新admin时如果检测到账号重复抛出这个异常
* */
public class LoginAcctAlreadyInUseException extends RuntimeException {

    private static final long serialVersionUID = 7713129202396392027L;

    public LoginAcctAlreadyInUseException() {
        super();
    }

    public LoginAcctAlreadyInUseException(String s) {
        super(s);
    }

    public LoginAcctAlreadyInUseException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public LoginAcctAlreadyInUseException(Throwable throwable) {
        super(throwable);
    }

    protected LoginAcctAlreadyInUseException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
