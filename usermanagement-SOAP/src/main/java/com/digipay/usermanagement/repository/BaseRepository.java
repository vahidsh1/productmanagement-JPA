package com.digipay.usermanagement.repository;

import java.util.List;

public interface BaseRepository <T>{
    public void insertEntity(T t);
    public List<T> listEntity(T t);
    public T listAnEntity(T t);

    public void updateEntity(T t);
    public void deleteEntity(T t);


}
