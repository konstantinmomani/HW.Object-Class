package pro.sky.java.course1.homework1;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    public void increaseYear(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Инкремент не может быть отрицательным");
        }
        this.year = year + increment;
    }

    public String toString() {
        return "Название " + this.name + " Автор " + this.author + " Год издания " + this.year;
    }
}
