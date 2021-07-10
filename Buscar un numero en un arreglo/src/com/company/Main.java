package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int[] arreglo = new int[10];
        int numeroBuscar, contador=0;
        boolean haynumero = false;

        boolean creciente=true;   // se inicia en true ya que esta ordenado a no ser que se demuestre lo contrario

        System.out.println("Ingrese numeros en forma creciente");

        do
        {
            for (int i=0 ; i< arreglo.length; i++)  //arreglo llenado
            {
                System.out.println("Ingrese un numero");
                arreglo[i] = Integer.parseInt(lector.readLine());
            }
            for (int i=0; i< arreglo.length-1; i++)  //ver si esta ordenado o no, debe llegar hasta el bloque 3 por que ahi lo compara con el 4, debe ser menor que 4 ya que no puedo llegar a 4 y compararlo con el 5
            {
                if(arreglo[i] < arreglo[i+1])
                {
                    creciente=true;
                }
                if(arreglo[i] > arreglo[i+1])
                {
                    creciente=false;
                    break;         //asi sale del bucle inmediatamente
                }
            }

            if(creciente == false)
            {
                System.out.println("El arreglo no esta ordenado crecientemente, vuelva a digitar\n");
            }
        }while (creciente==false); // ahora ya estamos seguros de que el arreglo esta ordenado

        System.out.println("\n");
        System.out.println("El arreglo es: ");
        for (int i=0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i]+", ");
        }

        System.out.println("Que numero quiere buscar?");
        numeroBuscar= Integer.parseInt(lector.readLine());

        for (int i=0 ; i<arreglo.length; i++)
        {
            if(numeroBuscar==arreglo[i])
            {
                System.out.println("El numero fue econtrado en la posicion "+contador);
                haynumero = true;
            }

            contador++;
        }

        if(haynumero==false)
        {
            System.out.println("No esta");
        }


        //Queremos desarrolar una aplicacion que nos ayude a gestionar la snotas de un centro deucativo cada grupo

    }
}
