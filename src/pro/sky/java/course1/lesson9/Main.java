package pro.sky.java.course1.lesson9;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гоголь");
        Book book1 = new Book("Портрет", author1, 1833);

        Author author2 = new Author("Лев", "Толстой");
        Book book2 = new Book("Анна Каренина", author2, 1873);

        System.out.println("Год издания книги " + book1.getName() + " - " + book1.getPublishingYear() + "; Автор книги - " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getSurName());
        System.out.println("Год издания книги " + book2.getName() + " - " + book2.getPublishingYear() + "; Автор книги - " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getSurName());

        book1.setPublishingYear(1844);

        System.out.println("Год издания книги " + book1.getName() + " - " + book1.getPublishingYear() + "; Автор книги - " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getSurName());


    }
}
