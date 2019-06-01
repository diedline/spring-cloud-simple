package com.cihon.changan.common.exception;

/**
 * 业务异常编码
 *
 * @author zouyutang
 * @date 2018/8/27
 * @package com.cihon.admin.exception
 */
public enum BuzCode {
    /**
     * 0 成功
     */
    SUCCEED(200, "success"),

    /**
     * 9999 失败
     */
    FAILED(9999, "fail"),

    /**
     * 1*** 用户相关业务异常
     */
    USER_NOT_FOUND(1001, "用户不存在"),
    USER_PWD_ERROR(1002, "密码不正确"),
    USER_IS_BLOCKED(1003, "用户被锁定"),
    USER_NOT_JURISDICTION(1004,"用户没有权限"),
    USER_VERIFICATION_CODE_ERROR(1005,"用户验证码错误");
    /**
     * 业务异常编码
     */
    private int code;

    /**
     * 异常信息
     */
    private String message;

    BuzCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
