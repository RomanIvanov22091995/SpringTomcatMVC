package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private static List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", "Black", 2000));
        carList.add(new Car("BMV", "White", 2001));
        carList.add(new Car("Honda", "Green", 2002));
        carList.add(new Car("Kia", "Yellow", 2003));
        carList.add(new Car("UAZ", "Red", 2010));
    }


    @Override
    public List<Car> carList(Integer count) {

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
