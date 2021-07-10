package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int numero, aletorio ,contador = 0;

        aletorio= (int)(Math.random()*100);   //genera un numeor aleatorio entre 0 y 100

        System.out.println("Estoy pensando en un numero del 0 al 100 ");

        do
        {
            System.out.println("¿Cual numero cree que es?");
            numero= Integer.parseInt(lector.readLine());

            if(aletorio>numero)
            {
                System.out.println("el numeor es mas grande!");
            }else
            {
              if(aletorio<numero)
                {
                System.out.println("el numeor es mas pequeño!");
                }
            }
            contador++;


        }while (numero!= aletorio);
        System.out.println("Adivinaste el numero en "+contador+ " intentos, felicitaciones");


    }
}