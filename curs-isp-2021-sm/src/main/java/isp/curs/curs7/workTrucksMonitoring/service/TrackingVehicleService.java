/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs7.workTrucksMonitoring.service;

import isp.curs.curs7.workTrucksMonitoring.model.Truck;
import java.util.List;
import static java.util.stream.Collectors.toList;
import isp.curs.curs7.workTrucksMonitoring.repository.ITruckRepository;

/**
 *
 * @author mihai.hulea
 */
public class TrackingVehicleService implements ITracking {
    ITruckRepository trucksRepository;

    public TrackingVehicleService(ITruckRepository trucksRepository) {
        this.trucksRepository = trucksRepository;
    }
    
    @Override
    public void addNewTruckRecord(double latitude, double longitude, String plateNumber){
        Truck t = new Truck(latitude, longitude, plateNumber);
        trucksRepository.save(t);
    }
    
    @Override
    public List<Truck> getAllTruckRecords(){
        return trucksRepository.readAll();
    }
    
    @Override
    public List<Truck> getAllUnique(){
        return trucksRepository.readAll().stream().distinct().collect(toList());
    }
    
    @Override
    public List<Truck> getALlRecordsByTruck(String plateNumber){
        return trucksRepository.readAll().stream().filter(t -> t.getPlateNumber().equals(plateNumber)).collect(toList());
    }
    
}
