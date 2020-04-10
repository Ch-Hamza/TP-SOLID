package com.directi.training.srp.exercice_refactored;

public class CarDAO {

    private List<Car> _carsDb = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));

    public Car[] getCars() {
        return _carsDb;
    }

    public Car getCarById(string _id) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

}