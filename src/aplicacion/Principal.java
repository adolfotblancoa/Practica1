package src.aplicacion;
import src.mates.Matematicas;
import java.util.Scanner;

public class Principal {
    public static long puntosTotales;

    public static void main(String[] args){
        System.out.println("Introduce el número de puntos a generar: ");
        Scanner sc = new Scanner(System.in);
        puntosTotales = sc.nextLong();
        sc.close();
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(puntosTotales));
        }
}
