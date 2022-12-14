package com.digipay.service;

import com.digipay.model.entity.DigitalDevice;
import com.digipay.repository.BaseRepository;
import com.digipay.repository.DigitalRepository;

import java.util.List;

public class DigitalService extends BaseServiceImpl<DigitalDevice> {
    DigitalRepository digitalRepository = new DigitalRepository();

    public DigitalService(BaseRepository<DigitalDevice> repo) {
        super(repo);
    }

    @Override
    public List<DigitalDevice> listAll(DigitalDevice digitalDevice) {
        List<DigitalDevice> digitalList = digitalRepository.listEntity(digitalDevice);
        return digitalList;
    }
    @Override
    public void update(DigitalDevice digitalDevice) {
        digitalRepository.updateEntity(digitalDevice);
    }
    @Override
    public void delete(DigitalDevice digitalDevice) {
        digitalRepository.deleteEntity(digitalDevice);
    }

}
