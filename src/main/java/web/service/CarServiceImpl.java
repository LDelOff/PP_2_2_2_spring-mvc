package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    public List<Car> listCar(int count) {
        List<Car> cars = new ArrayList<>(); // список машин, лежащий в сервисе
        cars.add(new Car(1, "Toyota", 12345));
        cars.add(new Car(2, "Honda", 23451));
        cars.add(new Car(3, "Telega", 34512));
        cars.add(new Car(4, "УАЗ", 45123));
        cars.add(new Car(5, "Chevrolet", 51324));

        if ((count >= 5) || (count <= 0)) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }
}
