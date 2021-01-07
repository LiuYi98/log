package com.example.to;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2021/1/7 20:30
 */
public class ResultDto {
    private Integer code;

    private String message;

    private Object result;


    public static ResultDto fail(Integer code, String message, Object result) {
        return new ResultDto(code, message, result);
    }

    public static ResultDto fail(String message) {
        return new ResultDto(400, message, null);
    }
    public ResultDto() {
    }

    public ResultDto(Integer code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public ResultDto(Object obj) {
        this(200, "success", obj);
    }

}
