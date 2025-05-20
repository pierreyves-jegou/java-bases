package com.cgi.bases.A_references;

import com.cgi.bases.Person;

import java.util.ArrayList;
import java.util.List;

public class C_FindSameObjects {

    public static void main(String[] args) {

        // Given
        Person john = new Person("john", 21);
        Person aline = new Person("aline", 45);
        Person jean = new Person("jean", 75);

        final List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(aline);
        people.add(jean);
        people.add(john);
        people.add(john);
        people.add(jean);

        // Comment savoir combien d'instance de "Person" existent réellement dans cette liste
        //TODO

    }

}
