/*Realizar secuencia fibonacci con ciclos for, while y do-while*/
import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de secuencias: ");
        int value = 0;
        value = in.nextInt() - 1;

        System.out.println("Fibonacci con el ciclo for: ");
        withFor(value);
        System.out.println("");
        System.out.println("Fibonacci con el ciclo while: ");
        withWhile(value);
        System.out.println("");
        System.out.println("Fibonacci con el ciclo do-while: ");
        withDoWhile(value);
    }

    //Método for
    private static void withFor(int reps){
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i <= reps; i++){
            if(i < reps){
                System.out.print( a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
        }
    }

    //Método while
    private static void withWhile(int reps){
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 0;
        while(n < reps){
                System.out.print( a + ",");
                c = a + b;
                a = b;
                b = c;
                n++;
            if(n == reps){
                System.out.print(a);
            }
            
        }

    }

    //Método do-while
    private static void withDoWhile(int reps){
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 0;
        do{
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
            n++;
            if(n == reps){
                System.out.print(a);
            }

        }while(n < reps);
    }
}