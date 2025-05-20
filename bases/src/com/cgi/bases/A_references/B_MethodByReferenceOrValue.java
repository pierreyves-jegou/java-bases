package com.cgi.bases.A_references;

import com.cgi.bases.Person;

public class B_MethodByReferenceOrValue {


    public static void main(String[] args) {

        Person person = new Person("john", 21);

        // Cas modification de l'objet dans la méthode
        // Quel sera la valeur affichée et surtout pq ?
        updatePersonAge(person, 10);
        System.out.println(person.getAge());

        // Quel sera la valeur affichée et surtout pq ?
        randomPersonCreator(person);
        System.out.println(person.getName());

        // Est-ce que mon objet initial aura un email ici ?
        addEmail(person);

        int test = 10;

        // Que vaut test après l'execution de cette méthode et pq ?
        squareIt(test);


    }

    public static void updatePersonAge(Person person, int nbAnnee) {
        person.setAge(person.getAge() + nbAnnee);
    }


    public static void randomPersonCreator(Person person) {
        person = new Person("toto", 10);
    }


    public static void addEmail(Person person){
        person.setEmail("john@gmail.com");
    }

    public static void squareIt(int a){
        a = a * a;
    }

}
