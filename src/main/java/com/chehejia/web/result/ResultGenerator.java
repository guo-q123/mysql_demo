package com.chehejia.web.result;

import org.springframework.stereotype.Component;

/**
 * @author guoqiang3@lixiang.com
 * @version 1.0
 * @Date 2022/04/06
 */
@Component
public class ResultGenerator {

    /**
     * 默认成功,无数据
     *
     * @return
     */
    public static ResponseBody getSuccessResult() {
        return new ResponseBody(ResultCode.SUCCESS);
    }

    /**
     * 默认成功,有数据
     *
     * @param data
     * @return
     */
    public static ResponseBody getSuccessResult(Object data) {
        return new ResponseBody(ResultCode.SUCCESS, data);
    }

    /**
     * 默认失败,无数据
     *
     * @return
     */
    public static ResponseBody getFailResult() {
        return new ResponseBody(ResultCode.FAIL);
    }

    /**
     * 默认失败
     *
     * @param message 自定义失败信息
     * @return
     */
    public static ResponseBody getFailResult(String message) {
        return new ResponseBody(ResultCode.FAIL, message);
    }

    /**
     * 采用枚举中的状态无数据返回
     *
     * @param resultCode 响应码枚举
     * @return
     */
    public static ResponseBody getFreeResult(ResultCode resultCode) {
        return new ResponseBody(resultCode);
    }

    /**
     * 采用枚举中的状态带数据返回
     *
     * @param resultCode 响应码枚举
     * @param data
     * @return
     */
    public static ResponseBody getFreeResult(ResultCode resultCode, Object data) {
        return new ResponseBody(resultCode, data);
    }

    /**
     * 自定义返回信息
     *
     * @param code    响应码
     * @param message 自定义失败信息
     * @param data
     * @return
     */
    public static ResponseBody getFreeResult(String code, String message, Object data) {
        return new ResponseBody(code, message, data);
    }

}
