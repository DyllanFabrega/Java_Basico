package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int cantidadDeSueldos, sueldo, sueldoMaximo=0;

        System.out.println("Cuantos sueldos quiere comparar ");
        cantidadDeSueldos= Integer.parseInt(lector.readLine());

        for (int i=1; i<=cantidadDeSueldos; i++)
        {
            System.out.println("Ingrese el monto de un sueldo ");
            sueldo= Integer.parseInt(lector.readLine());


            if(sueldo>sueldoMaximo)
            {
                sueldoMaximo=sueldo;
            }

        }
        System.out.println("El sueldo maximo es "+sueldoMaximo);
    }
}
