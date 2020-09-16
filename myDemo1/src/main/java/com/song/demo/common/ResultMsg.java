package com.song.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class ResultMsg<T> {


    private Integer code;
    private String msg;
//    static {
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String s = LocalDate.now().toString();
//        try {
//            currentDate=sdf.parse(s);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
    private static Date currentDate;
    private T data;


    public static ResultMsg successResult(Object data){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = LocalDateTime.now().toString();
        try {
            currentDate=sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ResultMsg success = new ResultMsg(10000, "SUCCESS",currentDate);
        success.setData(data);
        return success;
    }

    public ResultMsg() {
    }

    public ResultMsg(Integer code, String msg,Date currentDate) {
        this.code = code;
        this.msg = msg;
        this.currentDate=currentDate;
    }

    public ResultMsg(Integer code, String msg,Date currentDate, T data) {
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

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
