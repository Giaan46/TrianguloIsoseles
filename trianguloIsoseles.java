import java.util.Scanner;

class Triangulo {
    public static <Strings> void main(Strings args[]) {
     Scanner entrada = new Scanner(System.in);
     float Base;
     float Altura;
     float Area;

     System.out.println("Introduzca el la Base del trianlgulo.  ");
     Base  = entrada.nextFloat();
     System.out.println("Introduzca la Altura del triangulo.  ");
     Altura = entrada.nextFloat();

     Area = (Base * Altura ) / 2;

     System.out.println("El area del triangulo es : " + Area );


    }
}











