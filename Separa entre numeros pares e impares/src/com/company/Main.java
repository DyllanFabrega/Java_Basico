package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int[] arreglo = new int[10];
        int contedoPares=0, conteoImpares=0;

        System.out.println("Ingrese los numeros que desea que el programa separe");
        for (int i=0 ; i<10 ; i++)    //arreglo llenado
        {
            System.out.println("ingrese un numero");
            arreglo[i]= Integer.parseInt(lector.readLine());

            if(arreglo[i]%2==0)
            {
                contedoPares++;
            }
            else
            {
                conteoImpares++;
            }
        }

        System.out.println("Los numeros ingresados fueron");
        for (int i=0 ; i<10 ; i++)
        {
            System.out.print(arreglo[i]+", ");
        }

        int par[] = new int[contedoPares];
        int impar[] = new int[conteoImpares];

        contedoPares=0;
        conteoImpares=0;

        //almacenamos los numeros pares e impares en su arreglo
        for (int i=0 ; i<10 ; i++)
        {
            if(arreglo[i]%2==0)
            {
                par[contedoPares]=arreglo[i]; //como no puedo usar el iterador "i" denuevo uso el conteoPares como iterador
                contedoPares++;
            }
            else
            {
                impar[conteoImpares]=arreglo[i];
                conteoImpares++;
            }
        }

        System.out.println("\nLos numeros pares son: ");
        for (int i=0 ; i<contedoPares ; i++)
        {
            System.out.print(par[i]+", ");
        }

        System.out.println("\nLos numeros impares son: ");
        for (int i=0 ; i<conteoImpares ; i++)
        {
            System.out.print(impar[i]+", ");
        }


    }
}