package com.ds.webServiceDemo;

import java.io.Serializable;

/**
 * 执行结果
 */
public class Result implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7313298599505062016L;
	/**
     * 状态码
     */
    private int flag;
    /**
     * 结果或者错误提示
     */
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
