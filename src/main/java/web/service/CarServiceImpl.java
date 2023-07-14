package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Lada", "Black", 2000));
            carList.add(new Car("BMV", "White", 2001));
            carList.add(new Car("Honda", "Green", 2002));
            carList.add(new Car("Kia", "Yellow", 2003));
            carList.add(new Car("UAZ", "Red", 2010));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
