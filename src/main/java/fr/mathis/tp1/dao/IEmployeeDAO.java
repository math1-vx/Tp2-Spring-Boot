package fr.mathis.tp1.dao;

import fr.mathis.tp1.beans.Employee;

import java.util.List;

public interface IEmployeeDAO {

    List<Employee> findAll();

    void add(Employee employee);
}
