package com.digipay.service;

import com.digipay.model.entity.DigitalDevice;
import com.digipay.model.entity.ElectricalDevice;
import com.digipay.repository.BaseRepository;
import com.digipay.repository.DigitalRepository;
import com.digipay.repository.ElectricalRepository;

import java.util.List;

public class ElectricalService extends BaseServiceImpl<ElectricalDevice> {
    ElectricalRepository electricalRepository = new ElectricalRepository();

    public ElectricalService(BaseRepository<ElectricalDevice> repo) {
        super(repo);
    }

    @Override
    public List<ElectricalDevice> listAll(ElectricalDevice electricalDevice) {
            List<ElectricalDevice> digitalList = electricalRepository.listEntity(electricalDevice);
        return digitalList;
    }

    @Override
    public void update(ElectricalDevice digitalDevice) {
        electricalRepository.updateEntity(digitalDevice);
    }

    @Override
    public void delete(ElectricalDevice digitalDevice) {
        electricalRepository.deleteEntity(digitalDevice);
    }
}