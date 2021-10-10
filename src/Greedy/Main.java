//#########################
//Ejercicio Greedy
//#########################
package Greedy;

import java.util.ArrayList;

public class Main {

    public static boolean cabe(long tonBuqueRes, long tonConte) {
        //Este metodo permite saber si el barco tiene espacio para el proximo container
        boolean respuesta = false;
        if (tonBuqueRes >= tonConte) {
            respuesta = true;
        }
        return respuesta;
    }

    public static long maxConte(long tonBuque, long conte[]) {
        //Este metodo permite saber el maximo container le caben al buque segun el peso
        long contContainer = 0;
        for (long conActual : conte) {
            if (cabe(tonBuque, conActual)) {
                contContainer++;
                tonBuque = tonBuque - conActual;

            } else {
                break;
            }
        }
        return contContainer;

    }

    public static ArrayList<Long> maxTon(long conte[], long tonBuque) {
        long buqueAux=tonBuque;
        ArrayList<Long> sum1 = new ArrayList<Long>();
        ArrayList<Long> sum2 = new ArrayList<Long>();
        long suma1=0;
        long suma2=0;
        for (long conActual : conte) {
            if (cabe(tonBuque, conActual)) {
                sum1.add(conActual);
                tonBuque = tonBuque - conActual;
                suma1= suma1 +conActual;
            } else {
                break;
            }
        }

        for (int i = conte.length ; i >= 0; i--) {
            long conActual = conte[i-1];
            if (cabe(buqueAux, conActual)) {
                sum2.add(conActual);
                buqueAux = buqueAux - conActual;
                suma2= suma2 +conActual;
            } else {
                break;
            }
        }
        if (suma1>suma2) {
            return sum1;
        }else {
            return sum2;
        }


    }

    public static void main(String[] args) {
        long buque = 100;
        long containers[] = { 13, 13, 25, 25, 26, 28, 29, 32, 35, 38, 42, 46, 50};

        System.out.println(maxConte(buque, containers));
        for (long l : maxTon(containers, buque)) {
            System.out.println(l);
        }

    }
}
//Desarrollado por Estefany Rueda ID:000402237,Sergio Baron ID:000400032, Pedro Gomez ID:000396221