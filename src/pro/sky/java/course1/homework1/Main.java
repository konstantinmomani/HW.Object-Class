package pro.sky.java.course1.homework1;

import pro.sky.java.lesson.Person;
import pro.sky.java.lesson.PersonService;

public class Main {

    public static void main(String[] args) {

        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        sarah.increaseAge(1);
        Person john = new Person("John", 13);
        Person serg = new Person("Serg", 56);
        /*if (personService.isAdult(serg)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }*/

        Author vPicul = new Author("Валентин", "Пикуль");
        System.out.println(vPicul);

        Author nGogol = new Author("Николай", "Гоголь");
        System.out.println(nGogol);

        Book deadSouls = new Book("Мёртвые души", nGogol, 1994);
        System.out.println(deadSouls);

        Book favorite = new Book("Фаворит", vPicul, 1984);
        System.out.println(favorite);
        favorite.increaseYear(6);
        System.out.println(favorite.getYear());

        System.out.println(deadSouls.equals(favorite));
        System.out.println(vPicul.equals(nGogol));

        Author nGogol2 = new Author("Николай", "Гоголь");
        System.out.println(nGogol.equals(nGogol2));
        System.out.println(nGogol.hashCode());

        /*System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Иванов Иван", "89001236789");
        phoneBook.addContact("Лесюк Алина", "89771881624");
        phoneBook.addContact("Коля", "89124567832");
        phoneBook.addContact("Толик", "89334532343");
        phoneBook.addContact("Заргана Сергей", "89888776543");
        phoneBook.printAllContacts();
        System.out.println("Размер телефонной книги " + phoneBook.getCurrentSize());
        System.out.println();
        phoneBook.findContact("Толик");
        System.out.println();
        phoneBook.removeContact("Толик");
        phoneBook.findContact("Толик");
        System.out.println();
        phoneBook.printAllContacts();
        System.out.println("Размер телефонной книги " + phoneBook.getCurrentSize());
        System.out.println(new Contact("John", "911"));
        Contact c = new Contact("Дима", "89105556677");
        Contact c2 = new Contact("Дима", "89105556688");
        System.out.println(c.equals(c2));*/
    }
}