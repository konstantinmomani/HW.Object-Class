package pro.sky.java.course1.homework1;

public class Main {

    public static void main(String[] args) {

        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());

        Author vPicul = new Author("Valentin", "Picul");
        System.out.println("valentinPicul = " + vPicul);

        Author nGogol = new Author("Nikolay", "Gogol");
        System.out.println("nGogol = " + nGogol);

        Book deadSouls = new Book("Dead souls", nGogol, 1994);
        System.out.println("deadSouls = " + deadSouls);

        Book favorite = new Book("Favorite", vPicul, 1984);
        System.out.println("favorite = " + favorite);
        favorite.setYear(2010);
        System.out.println(favorite.getYear());

    }
}