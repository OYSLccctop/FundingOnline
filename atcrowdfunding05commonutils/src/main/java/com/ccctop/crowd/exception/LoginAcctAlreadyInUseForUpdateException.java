package com.ccctop.crowd.exception;
/*
* 保存或更新admin时如果检测到账号重复抛出这个异常
* */
public class LoginAcctAlreadyInUseForUpdateException extends RuntimeException {

    private static final long serialVersionUID = 7713129202396392027L;

    public LoginAcctAlreadyInUseForUpdateException() {
        super();
    }

    public LoginAcctAlreadyInUseForUpdateException(String s) {
        super(s);
    }

    public LoginAcctAlreadyInUseForUpdateException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public LoginAcctAlreadyInUseForUpdateException(Throwable throwable) {
        super(throwable);
    }

    protected LoginAcctAlreadyInUseForUpdateException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
