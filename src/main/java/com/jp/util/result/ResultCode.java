package com.jp.util.result;

/**
 * @ProjectName: blog
 * @Package: com.jp.util.codeandmessage
 * @ClassName: ResultCode
 * @Description: 在这里定义各种错误类型
 * @Author: jp
 * @CreateDate: 2020/5/2 15:42
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 15:42
 * @UpdateRemark:
 * @Version: 1.0
 */
public enum ResultCode {
    SUCCESS(0,"成功"),
    PARAM_IS_INVALID(1001,"参数无效");
    private Integer code;
    private String message;
    ResultCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
