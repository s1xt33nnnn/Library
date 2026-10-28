public class TestBook {
    public static void main(String[] args) {
        Book books[] = new Book[6];
        Author kiko = new Author( "Kiko Rivera", "kikoelperiko@email.com", 'm' );
        Author kerry = new Author("Kerry caberga", "Kerrycaberg1000@gmail.com", 'm');
        Author alma = new Author("Alma marcela gozo", "almamarce99@gmail.com", 'f');
        Author susana = new Author("Susana oria", "susanaoria67@gmail.com", 'f');
        Author aithor = new Author("Aithor tillas", "Ahitotillas-44@gmail.com", 'f');

        books[0] = new Book("Orgullo", kerry, 12.95, 500);
        books[1] = new Book("Gorrococada", alma, 9.95, 223);
        books[2] = new Book("Tuberculos", susana, 10.99, 120);
        books[3] = new Book("La sexualidad y sus precedentes", kerry, 7.50, 653);
        books[4] = new Book("Como no ser dj", kiko, 19.99, 32);
        books[5] = new Book("Todo sobre huevos", aithor, 7.50, 653);

        for (int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }


    }
}
