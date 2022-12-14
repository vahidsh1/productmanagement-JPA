package com.digipay.repository;

import com.digipay.model.entity.DigitalDevice;
import com.digipay.service.BaseServiceImpl;
import jakarta.persistence.Query;

import java.util.List;

public class DigitalRepository extends BaseRepositoryImpl<DigitalDevice> {

    public List<DigitalDevice> listEntity(DigitalDevice digitalDevice) {
        List<DigitalDevice> entityList = (List<DigitalDevice>) entityManager.createQuery("SELECT a FROM DigitalDevice a", DigitalDevice.class).getResultList();
        entityManager.close();
        return entityList;

    }

    @Override
    public void updateEntity(DigitalDevice digitalDevice) {
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("update DigitalDevice e set e.cpuModel= :cpuname,e.ram= :ramsize," +
                " e.brand= :brand, e.price= :price where digitalDeviceID= :id");
        query.setParameter("cpuname",digitalDevice.getCpuModel());
        query.setParameter("ramsize",digitalDevice.getRam());
        query.setParameter("brand",digitalDevice.getBrand());
        query.setParameter("price",digitalDevice.getPrice());
        query.setParameter("id",digitalDevice.getDigitalDeviceID());

        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteEntity(DigitalDevice digitalDevice) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from DigitalDevice where  digitalDeviceID=" + digitalDevice.getDigitalDeviceID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
