package list.empl.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import list.empl.backend.model.employee;
import list.empl.backend.repository.employeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class employeeController {
    @Autowired
    private employeeRepository employeeRepository;

    //get all employees

    @GetMapping("/employees")
    public List<employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
