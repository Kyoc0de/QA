package com.kyo.questionweb.vo;

import lombok.Data;

@Data
public class ResponseVO<T> {

    private String msg;

    private Integer code;

    private T data;

    public ResponseVO(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public static <T> ResponseVO<T> success(){
        return new ResponseVO<T> ("操作成功",200);
    }

    public static <T> ResponseVO<T> error(String msg){
        return new ResponseVO<T> (msg,200);
    }
}
