package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars = new ArrayList<Car>();

    public CarServiceImp() {
        cars.add(new Car("Toyota Camry", "Silver", 2022));
        cars.add(new Car("Honda Civic", "Blue", 2023));
        cars.add(new Car("Ford Mustang", "Red", 2021));
        cars.add(new Car("BMW X5", "Black", 2024));
        cars.add(new Car("Mercedes C-Class", "White", 2023));
    }

    @Override
    public List<Car> getListCar(Integer countCars) {

        if (cars == null || cars.isEmpty()) {
            return List.of();
        }

        if (countCars == null) {
            return cars;
        }

        if (countCars <= 0) {
            return List.of();
        }

        if (countCars > cars.size()) {
            return cars;
        }

        return cars.subList(0, countCars);
    }
}
