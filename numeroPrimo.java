/*Exribir programa que sepa identificar entre un numero primo o no*/
import java.util.Scanner;
public class Primo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = 0;
        System.out.print("Escribe un número:  ");
        value = in.nextInt();
        System.out.println("");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("El número " + value + " es primo?");
        primaryNumber(value);
        System.out.println("");
        System.out.println("");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        System.out.println("");


    }
    //Método para la lógica
    public static void primaryNumber(int number){
        int aux = 2;
        if(number == aux){
            System.out.print(true);
        }else{
            if(number % aux != 0){
                System.out.print(true);
            }else{
                System.out.print(false);
            }
        }
    }
}