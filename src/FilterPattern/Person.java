/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilterPattern;

/**
 *
 * @author Akash Bahri
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    private String gender;

    public String getGender() {
        return gender;
    }

    private String maritalStatus;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

}
