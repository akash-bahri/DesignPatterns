/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilterPattern;

import java.util.List;

/**
 *
 * @author Akash Bahri
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
