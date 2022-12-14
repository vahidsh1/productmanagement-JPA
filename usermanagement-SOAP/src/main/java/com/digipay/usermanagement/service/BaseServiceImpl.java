package com.digipay.usermanagement.service;
import com.digipay.usermanagement.repository.BaseRepository;
import java.util.List;
public class BaseServiceImpl<T> implements BaseService<T> {
    T repository;
    BaseRepository<T> repo;
    //
    public BaseServiceImpl(BaseRepository<T> repo) {

        this.repo = repo;
    }
    @Override
    public void create(T Entity) {
        repo.insertEntity(Entity);
    }
    //
    @Override
    public List<T> listAll(T Entity) {
        return repo.listEntity(Entity);
    }
    //
    public T listAUser(T Entity) {
        return repo.listAnEntity(Entity);
    }

    @Override
    public void update(T Entity) {

    }
    //
    @Override
    public void delete(T Entity) {
    }
    //

}