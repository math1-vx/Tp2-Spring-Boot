package fr.mathis.tp1.repository;

import fr.mathis.tp1.dao.IEmployeeDAO;
import fr.mathis.tp1.beans.Employee;
import fr.mathis.tp1.utils.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
class InitDataRepository implements CommandLineRunner {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void run(String... strings) throws Exception {


        // A compléter avec le remplissage de la base de données


    }
}
