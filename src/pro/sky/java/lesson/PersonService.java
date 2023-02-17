package pro.sky.java.lesson;

public class PersonService {
    public boolean isAdult(Person person) {
        return person.getAge() > 18;
    }
}
