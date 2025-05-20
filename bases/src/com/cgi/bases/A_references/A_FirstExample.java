package com.cgi.bases.A_references;

import java.util.ArrayList;
import java.util.List;
import com.cgi.bases.Person;

public class A_FirstExample {

    public static void main(String[] args) {

        Person person = new Person("john", 21);

        List<Person> people = new ArrayList<>();
        people.add(person);

        // Est-ce que l'objet contenu dans la liste "people" est le même objet ou une copie de l'objet "person" ?
        // Comment le vérifier ?

        person = new Person("janne", 21);
        // Quel nom sera affiché ici :
        System.out.println(people.getFirst().getName());
    }

}
