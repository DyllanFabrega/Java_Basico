package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int numero;

        System.out.println("Digite un numero multiplo de 10");
        numero= Integer.parseInt(lector.readLine());

        if(numero%10 == 0)
        {
            System.out.println("¡Si es multiplo de 10!");
        }else {
            System.out.println("¡No es multiplo de 10!");
        }


















    }
}