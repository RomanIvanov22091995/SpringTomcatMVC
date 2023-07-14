package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue="5") int count, Model model) {
        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> allCars = carsServiceImpl.carList(count);
        model.addAttribute("cars", allCars);
        return "cars";
    }
}