package fr.mathis.tp1.controllers;

import fr.mathis.tp1.beans.Employee;
import fr.mathis.tp1.dao.IEmployeeDAO;
import fr.mathis.tp1.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yaml.snakeyaml.events.Event;

@Controller
public class EmployeeControlleur {

    @Autowired
    private IEmployeeRepository employeeRepository;

    public EmployeeControlleur(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/addemployee")
    public String addEmployee(Employee employee){
        employeeRepository.save(employee);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String home(Model model){
        return findAllEmployee(model);
    }

    @RequestMapping("/employees")
    public String findAllEmployee(Model model){
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "view_employees";
    }
}
