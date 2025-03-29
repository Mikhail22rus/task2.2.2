package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "3") Integer count,Model model) {
        List<Car> carList = carService.getListCar(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}