package GFT;

public interface Imposto{

   public default void calcularImposto(){
      if(this.getClass().getName() == "GFT.Livro"){

         if(this.getTema() == "educativo"){
            System.out.println("0");
         }
         else{
            System.out.println("Imposto de: " + this.getPreco() * 0.1);
         }
      }

      else{
         if(this.isUsando()){
            System.out.println("Imposto de: " + this.getPreco() * 0.25);
         }

         else{
            System.out.println("Imposto de:" + this.getPreco() * 0.25);
         }
      }

   }
}


