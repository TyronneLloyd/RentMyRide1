package za.ac.cput.service.car;

import za.ac.cput.entity.Car;
import za.ac.cput.service.IService;
import java.util.Set;

public interface ICarService extends IService<Car, String> {
    Set<Car> getAll();
}
