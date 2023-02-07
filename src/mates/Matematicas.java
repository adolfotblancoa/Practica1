package src.mates;
import java.util.Random;
import src.aplicacion.Principal;

public class Matematicas{ 
/**
* Genera una aproximación al número pi mediante el método de
* Montecarlo. El parámetro ‘pasos‘ indica el número de puntos
* generado.
*/
static double aciertos = 0;
static double areaCuadrado = 4.0;
static long pasos = Principal.puntosTotales;
    
public static double generarNumeroPi(long pasos){
    

    for (int i = 0; i < pasos; i++){
        Random r = new Random();
        double x = r.nextDouble();
        double y = r.nextDouble();
        if (x*x + y*y <= 1){
            aciertos++;
        }
    }

return areaCuadrado * (aciertos / pasos);
    }
}

