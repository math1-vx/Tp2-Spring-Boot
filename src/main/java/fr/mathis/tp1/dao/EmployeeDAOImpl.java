package fr.mathis.tp1.dao;

import fr.mathis.tp1.beans.Employee;
import fr.mathis.tp1.utils.Fonction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    private List<Employee> employees;

    public EmployeeDAOImpl() {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB));
        list.add(new Employee("Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS));
        list.add(new Employee("Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET));
        list.add(new Employee("Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI));
        list.add (new Employee("Ahmed Omar", "amhedoomar@gmail.com", "0096650413948", "KSA", Fonction.SOFTWARE_ARCHITECT));
        list.add(new Employee("Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI));
        list.add(new Employee("Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB));
        list.add(new Employee("Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS));


        this.employees = list;
    }
    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void add(Employee employee) {

    }
}
