package com.lzp.springboot.exception;

import com.lzp.springboot.util.Code;

public class MyException extends RuntimeException {

    private static final long serialVersionUID = -5875371379845226068L;


    public MyException(){}

    public MyException(String msg){
        this.msg = msg ;
    }

    /**
     * 异常信息
     */
    private String msg ;

    /**
     * 具体异常码
     */
    private int code = Code.FAILED;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
