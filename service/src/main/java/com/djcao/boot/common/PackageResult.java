package com.djcao.boot.common;

import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-07-03
 */
public class PackageResult<T> {


    private boolean success;

    private String message;

    private T single;

    private List<T> many;

    private int pageNo = 0;

    private int pageSize = 30;

    private static PackageResult create(boolean success){
        return create(success, StringUtils.EMPTY);
    }

    private static PackageResult create(boolean success, String message){
        return new PackageResult().setSuccess(success).setMessage(message);
    }

    public static PackageResult success(){
        return create(Boolean.TRUE);
    }

    public static PackageResult error(String message){
        return create(Boolean.FALSE,message);
    }

    public boolean isSuccess() {
        return success;
    }

    public PackageResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public PackageResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getSingle() {
        return single;
    }

    public PackageResult setSingle(T single) {
        this.single = single;
        return this;
    }

    public List<T> getMany() {
        return many;
    }

    public PackageResult setMany(List<T> many) {
        this.many = many;
        return this;
    }

    public int getPageNo() {
        return pageNo;
    }

    public PackageResult setPageNo(int pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public PackageResult setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
