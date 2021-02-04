package GFT;

public class VideoGame extends Produto{

   private String marca;
   private String modelo;
   private boolean isUsando;

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsando) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsando = isUsando;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsando() {
        return isUsando;
    }

    public void setUsando(boolean usando) {
        isUsando = usando;
    }
}
