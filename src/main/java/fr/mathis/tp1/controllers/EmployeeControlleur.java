package fr.mathis.tp1.controllers;

import fr.mathis.tp1.beans.Employee;
import fr.mathis.tp1.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControlleur {

    @Autowired
    private final IEmployeeDAO employeeDAO;

    @Autowired
    public EmployeeControlleur(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/")
    public String home(Model model){
        return findAllEmployee(model);
    }
    @RequestMapping("/employees")
    public String findAllEmployee(Model model){
        model.addAttribute("name","employees");
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees",employeeDAO.findAll());
        return "view_employees";
    }
}
