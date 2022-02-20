//package com.zhengyang.car;
//
//public class CarService {
//    private CarDao carDao;
//
//    public CarService(CarDao carDao){
//        this.carDao = carDao;
//    }
//
//    public void registerNewCar(Car car){
//        //business logic, check if reg number is valid and not take
//        if (car.getPrice() <=0){
//            throw new IllegalStateException("Car price cannot be 0 or less");
//        }
//        int result =CarDao.insertCar(car);
//        if (result !=1){
//            throw new IllegalStateException("could not save car..");
//        }
//    }
//}

