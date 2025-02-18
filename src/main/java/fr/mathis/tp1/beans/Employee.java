package fr.mathis.tp1.beans;

import fr.mathis.tp1.utils.Fonction;
import lombok.Data;

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
