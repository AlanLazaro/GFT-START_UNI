import java.util.Scanner;

class Baskara{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);

       double a = s.nextFloat();
       double b = s.nextFloat();
       double c = s.nextFloat();
       double x;
       double x2;


       double delta = (b*b) - (4 * a * c);

        if ( a == 0.0 || delta < 0.0){
            System.out.println("Impossível");
        }

        else{

            if(delta == 0.0){

                x = (-b) / (2*a);
                System.out.println("X = " + x );
            }

            else if(delta > 0.0){
                x = ( (-b) - Math.sqrt(delta) ) / (2 * a);
                x2 = ( (-b) + Math.sqrt(delta) ) / (2*a);

                System.out.println("X1 = " + x);
                System.out.println("X2 = " + x2);
            }
        }





    }
}