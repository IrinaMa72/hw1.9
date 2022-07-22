package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    // Задание 1.10
    @Override
        public String toString() {
        return firstName + " " + surName;
    }

    @Override
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) return true;

        if (this.firstName == ob.firstName && this.surName == ob.surName && this.hashCode() == ob.hashCode())
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName);
    }
}