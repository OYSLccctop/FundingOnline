package com.ccctop.crowd.util;


import java.io.Serializable;

/*
* 统一项目中AJAX请求返回的结果，也可以用于分布式架构中各个模块间调用时返回统一类型
* */
public class ResultEntity<T> implements Serializable {
    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //用来封装当前请求处理的结果是成功还是失败
    private String result;
    //请求处理失败时，返回的错误消息
    private String message;
    //要返回的数据
    private T data;
    //请求处理成功且不需要返回数据时使用的工具方法
    public static <Type> ResultEntity<Type> successWithoutData() {
        return new ResultEntity<Type>(SUCCESS, null, null);
    }
    //请求处理成功且需要数据时使用的工具方法  要返回的数据
    public static <Type> ResultEntity<Type> successWithData(Type data) {
        return new ResultEntity<Type>(SUCCESS, null, data);
    }
    //请求处理失败后使用的工具方法   失败的错误消息
    public static <Type> ResultEntity<Type> failed(String message) {
        return new ResultEntity<Type>(FAILED, message, null);
    }

    public ResultEntity() {
    }

    public ResultEntity(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "result='" + result + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
