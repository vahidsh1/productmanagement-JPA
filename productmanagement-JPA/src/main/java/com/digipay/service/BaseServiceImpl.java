package com.digipay.service;

import com.digipay.repository.BaseRepository;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    BaseRepository<T> repo;
    public BaseServiceImpl(BaseRepository<T> repo) {

        this.repo = repo;
    }

    @Override
    public void create(T Entity) {
        repo.insertEntity(Entity);
    }

    public List<T> listOne(T Entity){return repo.listAnEntity(Entity);}

    @Override
    public List<T> listAll(T Entity) {
        return repo.listEntity(Entity);
    }

    @Override
    public void update(T Entity) {

    }

    @Override
    public void delete(T Entity) {

    }
}
