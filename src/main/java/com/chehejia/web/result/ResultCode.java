package com.chehejia.web.result;

/**
 * @author guoqiang3@lixiang.com
 * @version 1.0
 * @Date 2022/04/06
 */
public enum ResultCode {
    // 成功
    SUCCESS("200", "Success!"),
    // 失败
    FAIL("400", "Failure!"),
    // 没有权限
    NO_PERMISSION("403", "Need Authorities!"),
    // 未登录
    LOGIN_NO("402", "Need Login!"),
    // 登录失败
    LOGIN_FAIL("401", "Login Failure!"),
    // 登录成功
    LOGIN_SUCCESS("200", "Login Success!"),
    // 退出登录
    LOGOUT_SUCCESS("200", "Logout Success!"),
    // 会话到期
    SESSION_EXPIRES("101", "Session Expires!"),
    // 会话到期,其他用户登录
    SESSION_EXPIRES_OTHER_LOGIN("101", "Session Expires!Other users login！");


    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param code
     * @param message
     */
    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}