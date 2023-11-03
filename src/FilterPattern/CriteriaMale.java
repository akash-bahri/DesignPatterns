/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akash Bahri
 */
public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person>persons){
        List<Person> malePersons = new ArrayList<Person>();
        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
