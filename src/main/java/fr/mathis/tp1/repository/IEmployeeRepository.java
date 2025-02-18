package fr.mathis.tp1.repository;

import fr.mathis.tp1.beans.Employee;
import lombok.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
