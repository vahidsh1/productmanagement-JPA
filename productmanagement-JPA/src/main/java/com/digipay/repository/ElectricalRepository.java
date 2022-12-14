package com.digipay.repository;

import com.digipay.model.entity.ElectricalDevice;
import jakarta.persistence.Query;

import java.util.List;

public class ElectricalRepository extends BaseRepositoryImpl<ElectricalDevice> {

    public List<ElectricalDevice> listEntity(ElectricalDevice electricalDevice) {
        List<ElectricalDevice> entityList = (List<ElectricalDevice>) entityManager.createQuery("SELECT a FROM ElectricalDevice a", ElectricalDevice.class).getResultList();
        entityManager.close();
        return entityList;

    }

    @Override
    public void updateEntity(ElectricalDevice electricalDevice) {
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("update ElectricalDevice e set e.powerUsage= :powerusage," +
                "e.energyRate= :energyrate, e.brand= :brand, e.price= : price where electricalDeviceID= :id");
        query.setParameter("powerusage",electricalDevice.getPowerUsage());
        query.setParameter("energyrate",electricalDevice.getEnergyRate());
        query.setParameter("brand",electricalDevice.getBrand());
        query.setParameter("price",electricalDevice.getPrice());
        query.setParameter("id",electricalDevice.getElectricalDeviceID());


        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteEntity(ElectricalDevice electricalDevice) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from ElectricalDevice where  electricalDeviceID=" + electricalDevice.getElectricalDeviceID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
