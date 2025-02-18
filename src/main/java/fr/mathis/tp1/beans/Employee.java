package fr.mathis.tp1.beans;

import fr.mathis.tp1.utils.Fonction;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "employee")
@Data
public class Employee {

    private String name = "Default";
    private String adress;
    private String email;
    private String phone;
    private Fonction fonction;

    public Employee() {
    }

    public Employee(String name, String adress, String email, String phone, Fonction fonction) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.fonction = fonction;
    }


}
