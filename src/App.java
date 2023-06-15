import java.util.ArrayList;
import java.util.List;

import dominio.Filter;

import dominio.Person;

public class App {
    public static void main(String[] args) throws Exception {
    List<Person> people = new ArrayList<>();


    Person p1 = new Person("Diogo",22,"masc");
    Person p2 = new Person("Mariany",20,"famin");
    Person p3 = new Person("Cleitin",19,"masc");
    Person p4 = new Person("Camila",23,"famin");
    Person p5 = new Person("Joao",30,"masc");

       people.add(p1);
       people.add(p2);
       people.add(p3);
       people.add(p4);
       people.add(p5);



       List<Person> hehe  = Filter.FilterAll(people, personn -> personn.getAge()<20);

    System.out.println(hehe);
   





  
}
}