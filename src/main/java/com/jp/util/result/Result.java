package com.jp.util.result;

import lombok.Data;

/**
 * @ProjectName: blog
 * @Package: com.jp.util.codeandmessage
 * @ClassName: Result 返回码
 * @Description:
 * @Author: jp
 * @CreateDate: 2020/5/2 15:37
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 15:37
 * @UpdateRemark:
 * @Version: 1.0
 */
@Data
public class Result {
    private Integer code;
    private String message;
    private Object data;

    public Result (ResultCode resultCode,Object data){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }
    public Result (Integer code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result success(){
        return new Result(ResultCode.SUCCESS,null);
    }

    public static Result success(Object data){
        return new Result(ResultCode.SUCCESS,data);
    }

    public static Result failure(ResultCode resultCode){
        return new Result(resultCode.getCode(),resultCode.getMessage(),null);
    }

    public static Result failure(ResultCode resultCode,Object data){
        return new Result(resultCode.getCode(),resultCode.getMessage(),data);
    }

    public static Result failure(Integer code,String message){
        return new Result(code,message,null);
    }
}
