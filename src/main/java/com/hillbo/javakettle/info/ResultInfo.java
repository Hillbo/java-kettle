package com.hillbo.javakettle.info;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author williams
 * @Description 结果返回
 * @date 2017年4月13日 上午10:27:30
 */
public class ResultInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status; // 状态码

    /**
     * 比如成功，失败的信息等
     */
    private String message; // 消息

    /**
     * 有返回结果的，添加到此信息中
     */
    private Object result; // 结果

    public ResultInfo() {
        super();
    }

    /**
     * Creates a new instance of ReturnInfo. Description
     *
     * @param status  状态
     * @param message 执行结果信息
     * @param result  返回信息
     */
    public ResultInfo(Integer status, String message, Object result) {
        this.message = message;
        this.status = status;
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }


    public String toString() {
        return JSON.toJSONString(this);
    }

}
