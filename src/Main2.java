import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        Person person = new Person("Max", "Okorokov");
        personSet.add(person);
//        personSet.remove(person);
        person.setName("sasa");
        System.out.println(personSet.contains(person));
    }


}

class Person {

    private String name;
    private String secondName;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}