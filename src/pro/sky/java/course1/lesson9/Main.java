package pro.sky.java.course1.lesson9;

public class Main {
    public static void main(String[] args) {
        Author Gogol = new Author("Николай", "Гоголь");
        Book Portrait = new Book("Портрет", Gogol, 1833);

        Author Tolstoy = new Author("Лев", "Толстой");
        Book AnnaKarenina = new Book("Анна Каренина", Tolstoy, 1873);

        System.out.println("Год издания книги " + Portrait.getName() + " - " + Portrait.getPublishingYear() + "; Автор книги - " + Portrait.getAuthor().getFirstName() + " " + Portrait.getAuthor().getSurName());
        System.out.println("Год издания книги " + AnnaKarenina.getName() + " - " + AnnaKarenina.getPublishingYear() + "; Автор книги - " + AnnaKarenina.getAuthor().getFirstName() + " " + AnnaKarenina.getAuthor().getSurName());

        Portrait.setPublishingYear(1844);

        System.out.println("Год издания книги " + Portrait.getName() + " - " + Portrait.getPublishingYear() + "; Автор книги - " + Portrait.getAuthor().getFirstName() + " " + Portrait.getAuthor().getSurName());

        // Задание 1.10
        System.out.println(Portrait);
        System.out.println(AnnaKarenina);
        System.out.println(Portrait.hashCode());
        System.out.println(AnnaKarenina.hashCode());
        System.out.println(Gogol.equals(Tolstoy));
        System.out.println(Portrait.equals(Portrait));
    }

}
