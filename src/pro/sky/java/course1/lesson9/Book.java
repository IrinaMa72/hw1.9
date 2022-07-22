package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear){
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

//    @Override
//    public String toString() {
//        return name + author.toString()+ publishingYear;
//    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    // Задание 1.10
    @Override
    public String toString() {
        return "Книга " + getName() + ", год издания " + getPublishingYear() + ", автор книги " +  " - " + author.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        if (this == obj) return true;

        if (this.name == book.name && this.author == book.author && this.hashCode() == book.hashCode())
            return true;
        else return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishingYear);
    }
}
