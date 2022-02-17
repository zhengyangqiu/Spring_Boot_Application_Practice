package com.zhengyang.car;

import java.util.List;

public interface CarDao {
    Car selectCarByID(Integer id);
    List<Car> selectAllCars ();
    int insertCar(Car car);
    int deleteCar(Car car);
    int updateCar(Integer Car, Car update);
    




}
