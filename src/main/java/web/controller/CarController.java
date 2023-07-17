package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl myService;

    @Autowired
    public CarController(CarServiceImpl myService) {
        this.myService = myService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue="5") int count, Model model) {
        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> allCars = carsServiceImpl.carList(count);
        model.addAttribute("cars", allCars);
        return "cars";
    }
}