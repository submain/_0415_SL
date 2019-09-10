package com.sy.model.resp;

import java.io.Serializable;

public class BaseResp<T> implements Serializable {
    private int success;
    private String errorMsg;
    private T data;
    private int page;
    private int count;

    public BaseResp() {
    }

    public BaseResp(int success, String errorMsg, T data, int page, int count) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.data = data;
        this.page = page;
        this.count = count;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BaseResp{" +
                "success=" + success +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                ", page=" + page +
                ", count=" + count +
                '}';
    }
}
