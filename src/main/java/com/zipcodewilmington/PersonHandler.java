package com.zipcodewilmington;

import java.security.SecureRandom;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
            int counter = 0;
            while (counter < personArray.length) {

                Person currentPerson = personArray[counter];
                String stringRepresentation = currentPerson.toString();
                result += stringRepresentation;
                counter++;
            }


        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i <personArray.length ; i++) {

            String stringRepresentation =  personArray[i].toString();
            result += stringRepresentation;
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";

        for (Person person: personArray) {
           String stringRepresentation = person.toString();
           result += stringRepresentation;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
