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
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name = "Default";
    private String email;
    private String phone;
    private String adress;
    private Fonction fonction;



}
