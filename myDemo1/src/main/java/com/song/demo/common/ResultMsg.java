package com.song.demo.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultMsg<T> {

    public static final ResultMsg SUCCESS=new ResultMsg(10000,"SUCCESS");
    public static final ResultMsg FAIL=new ResultMsg(20000,"FAIL");

    private Integer code;
    private String msg;
    static {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        currentDate=sdf.format(new Date());
    }
    private static String currentDate;
    private T data;


    public static ResultMsg successResult(Object data){
        ResultMsg success = new ResultMsg(10000, "SUCCESS",currentDate);
        success.setData(data);
        return success;
    }

    public ResultMsg() {
    }

    public ResultMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultMsg(Integer code, String msg, String currentDate) {
        this.code = code;
        this.msg = msg;
        this.currentDate=currentDate;
    }

    public ResultMsg(Integer code, String msg,String currentDate, T data) {
        this.code = code;
        this.msg = msg;
        this.currentDate=currentDate;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
