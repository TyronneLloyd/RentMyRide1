/* ICarRepository.java
   Repository interface for Car
   Author: Rick Allen Herbert (219014337)
   Date: 24 July 2021
*/
package za.ac.cput.repository.car;

import za.ac.cput.entity.Car;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface ICarRepository extends IRepository<Car, String> {
    public Set<Car> getAll();
}
