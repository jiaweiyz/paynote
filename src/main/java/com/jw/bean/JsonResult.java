package com.jw.bean;

public class JsonResult {
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;
    public static final int FAIL = 2;

    // 交易处理状态码，1：成功，0：失败（程序错误），2：失败（逻辑错误）
    private int  status;
    // 中文处理描述
    private String message;
    // 返回数据
    private Object data;
    // 交易流水号，可根据交易流水查询操作日志表定位交易
    //private String

}
