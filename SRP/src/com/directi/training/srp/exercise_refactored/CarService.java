package com.directi.training.srp.exercice_refactored;

public class CarService {

    private CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCars() {
        return this.carDAO.getCars();
    }

    public Car getCarById(String _id) {
        return this.carDAO.getCar(_id);
    }
}