package com.digipay.usermanagement.service;

import java.util.List;

public interface BaseService<T> {
    public void create(T Entity);
    public List<T> listAll(T Entity);
    public T listAUser(T Entity);

    public void update(T Entity);
    public void delete(T Entity);

}
