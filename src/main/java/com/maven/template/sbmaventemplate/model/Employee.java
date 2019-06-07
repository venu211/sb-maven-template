package com.maven.template.sbmaventemplate.model;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;


@Entity
@Table(name = "employees")
@Data      //Lombok annotation for setters and getters
@ToString  //Lombok ToString annotation override and create toString() method for debugging purpose
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    // If Lombok ToString annotation is not used then we can auto create this method in intellij
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", emailId='" + emailId + '\'' +
//                '}';
//    }

}
