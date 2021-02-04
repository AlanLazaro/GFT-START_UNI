package GFT;

public class Main {

    public static void main(String[] args) {

        Livro l = new Livro("Livro1", 10.50, 5, "Desconhecido", "Todos", 200);
        VideoGame v = new VideoGame("Videogame", 3000, 10,"XBOX", "X", false);

        System.out.println(l.getClass().getName());
        System.out.println(v.getClass().getName());

    }

}
