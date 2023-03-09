import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Refactor {

    public static void main(String[] args) {
        //1. Encontrar las personas menores a 18.
        //2. mostrar  los 5 primeros.
        List<Person> people = getData();
        List<Person> filterList = new ArrayList<>();
        int limit = 5;
        int counter = 0;
        for (Person person: people) {
            if(person.getAge() <= 18) {
                filterList.add(person);
                counter++;
                if(counter == limit){
                    break;
                }
            }
        }
        //filterList.forEach(x -> System.out.println(x));

        //REFACTOR
       List<Person> newPeople =  people.stream()
                .filter( x -> x.getAge() <= 18)
                .limit(5)
                .collect(Collectors.toList());

       newPeople.forEach( x -> System.out.println(x));

    }

    public static List<Person> getData() {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("mateo", 20);
        Person person2 = new Person("juan", 10);
        Person person3 = new Person("catalina", 9);
        Person person4 = new Person("ana", 3);
        Person person5 = new Person("adriana", 17);
        Person person6 = new Person("lucas", 15);
        Person person7 = new Person("pepe", 14);
        Person person8 = new Person("maria", 13);
        Person person9 = new Person("juan", 14);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        return people;

    }
}
