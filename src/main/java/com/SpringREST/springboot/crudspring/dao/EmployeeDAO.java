package com.SpringREST.springboot.crudspring.dao;
import com.SpringREST.springboot.crudspring.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

}
