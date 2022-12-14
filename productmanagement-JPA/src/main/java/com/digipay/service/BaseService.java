package com.digipay.service;


import java.util.List;

public interface BaseService<T> {
    public void create(T Entity);

    public List<T> listOne(T Entity);

    public List<T> listAll(T Entity);

    public void update(T Entity);

    public void delete(T Entity);

}
