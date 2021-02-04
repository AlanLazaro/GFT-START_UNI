package GFT;
import java.util.List;
import java.util.ArrayList;

public class Loja {

    private String nome;
    private String cnpj;
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<VideoGame> videoGames = new ArrayList<VideoGame>();

    public Loja(String nome, String cnpj, ArrayList<Livro> livros, ArrayList<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<VideoGame> getVideoGames(){
        return videoGames;
    }

    public void setVideoGames(ArrayList<VideoGame> videoGames) {
        videoGames = videoGames;
    }
    
    public void listaLivros(){
        for (Livro l: livros){
             System.out.println(l);
        }
        if(livros.isEmpty()){
            System.out.println("A loja não tem livros no seu estoque");
        }
        
    }
    public void listaVideoGames(){

        for (VideoGame v: videoGames){
            System.out.println(v);
        }
        if(videoGames.isEmpty()){
            System.out.println("A loja não tem Videogames no seu estoque");
        }
    }
    public void calculaPatrimonio(){
        
    }
}
