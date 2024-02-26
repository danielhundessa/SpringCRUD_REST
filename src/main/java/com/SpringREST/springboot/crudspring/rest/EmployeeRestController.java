package com.SpringREST.springboot.crudspring.rest;
import com.SpringREST.springboot.crudspring.dao.EmployeeDAO;
import com.SpringREST.springboot.crudspring.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // inject employee dao
    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    // expose "/employees" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }


}
