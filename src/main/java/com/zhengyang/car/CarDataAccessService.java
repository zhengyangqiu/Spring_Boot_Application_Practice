package com.zhengyang.car;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDataAccessService implements CarDao{
    @Override
    public Car selectCarByID(Integer id) {
        return null;
    }

    @Override
    public List<Car> selectAllCars() {
        return null;
    }

    @Override
    public int insertCar(Car car) {
        return 0;
    }

    @Override
    public int deleteCar(Car car) {
        return 0;
    }

    @Override
    public int updateCar(Integer Car, Car update) {
        return 0;
    }
}
