package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int[] arreglo = new int[10];
        int numero, sitioDelNumero=0, j=0;
        boolean creciente=true;   // se inicia en true ya que esta ordenado a no ser que se demuestre lo contrario

        System.out.println("Ingrese numeros en forma creciente");

        do
        {
            for (int i=0 ; i<5; i++)  //arreglo llenado
            {
                System.out.println("Ingrese un numero");
                arreglo[i] = Integer.parseInt(lector.readLine());
            }
            for (int i=0; i<4; i++)  //ver si esta ordenado o no, debe llegar hasta el bloque 3 por que ahi lo compara con el 4, debe ser menor que 4 ya que no puedo llegar a 4 y compararlo con el 5
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

        System.out.println("\n[> Ingrese el numero que desea insertar <]");     //pedimos un numero
        numero= Integer.parseInt(lector.readLine());

        while (arreglo[j]<numero && j<5)          //saber la pociscion del numero
        {
            sitioDelNumero++;
            j++;
        }

        // trasladar hacia la derecha del arreglo a los elementso despues del numero
        for(int i=4; i>=sitioDelNumero; i--)
        {
            arreglo[i+1] = arreglo[i];
        }

        arreglo[sitioDelNumero]=numero; //insertamos el numeoro que el usuario puso

        System.out.println("Al insertar el numero la serie queda ordenada de menor a mayor asi: ");
        for(int i=0; i<6; i++)
        {
            System.out.print(arreglo[i]+", ");
        }














    }
}
