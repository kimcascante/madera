package Semana10;
/**
 * Nombre del programa: 
 * Descripcion: Una empresa que fabrica juegos de niños desea calcular cuánta madera necesita para
    construir juegos de piezas de armar que contengan cubos, esferas y cilindros. Haga un programa que
    a partir del número de piezas de cada tipo y las dimensiones de cada tipo de pieza (todos los cubos
    tienen la misma dimensión, todas las esferas son iguales, etc.), calcule el volumen total de la madera
    que se necesita. Recuerde que:
    Pi=3.1415
•   Volumen de esfera = pi*radio3
•   Volumen de cubo = base*altura*ancho
•   Volumen de cilindro = pi*altura*radio3
    Para esto defina funciones que calculen los volúmenes de las figuras y úselas en un main.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej8w10 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 
        double volumenMadera;
       
        double volumenCubo = calcularVolumenCubo();
        double volumenEsfera = calcularVolumenEsfera();
        double volumenCilindro = calcularVolumenCilindro();

        volumenMadera = volumenCilindro + volumenCubo + volumenEsfera;

        out.println("El volumen total de Madera es: " +volumenMadera);
    }

    public static Double calcularVolumenCubo() throws IOException{
        int cantCubos;
        double base, altura, ancho, volumenCubo;

        out.println("Digite la cantidad de Cubos:");
        cantCubos = Integer.parseInt(in.readLine());

        out.println("Digite la medida de la base:");
        base = Double.parseDouble(in.readLine());

        out.println("Digite la medida de la altura:");
        altura = Double.parseDouble(in.readLine());

        out.println("Digite la medida del ancho:");
        ancho = Double.parseDouble(in.readLine());

        volumenCubo = (base * altura * ancho) * cantCubos;

        return volumenCubo;
    }

    public static Double calcularVolumenEsfera() throws IOException{
        int cantEsferas;
        double radio, volumenEsfera, pi = 3.1415;

        out.println("Digite la cantidad de Esferas:");
        cantEsferas = Integer.parseInt(in.readLine());

        out.println("Digite la medida del radio:");
        radio = Double.parseDouble(in.readLine());

        volumenEsfera = (pi * Math.pow(radio, 3)) * cantEsferas;

        return volumenEsfera;
    }
    
    public static Double calcularVolumenCilindro() throws IOException{
        int cantCilindros;
        double radio, altura, volumenCilindro, pi = 3.1415;

        out.println("Digite la cantidad de Cilindros:");
        cantCilindros = Integer.parseInt(in.readLine());

        out.println("Digite la medida del radio:");
        radio = Double.parseDouble(in.readLine());

        out.println("Digite la medida de la altura:");
        altura = Double.parseDouble(in.readLine());

        volumenCilindro = (pi * altura *  Math.pow(radio, 3)) * cantCilindros;

        return volumenCilindro;
    }

}