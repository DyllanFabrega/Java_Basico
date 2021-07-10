package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int respuesta;
        System.out.println("Bienbenido a su cajero automatico.");

        int saldoInicial=0;

        int saldoActual=0, ingreso, opcion, retiro;

        do
        {

            System.out.println("elija una opcion ingresando el numero correspondiente");
            System.out.println("1. Ingresar dinero a la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.println("Recuerde que solo puede retirar y depositar Pesos Chilenos");

            opcion = Integer.parseInt(lector.readLine());
            System.out.println("Usted eligio la opcion " + opcion);

            switch (opcion)
            {
                case 1:
                    System.out.println("Digite la cantidad que desea depositar");
                    ingreso = Integer.parseInt(lector.readLine());

                    saldoActual = saldoInicial + ingreso;
                    System.out.println("Gracias por depositar, su saldo actual es " + saldoActual);
                    saldoInicial=saldoActual;
                    break;
                case 2:
                    System.out.println("Digite la cantidad que desea retirar");
                    retiro = Integer.parseInt(lector.readLine());

                    if (retiro > saldoInicial) {
                        System.out.println("No cuenta con el saldo suficiente");
                    } else {
                        saldoActual = saldoInicial - retiro;
                        System.out.println("Usted realizo un reiro, su saldo actual es " + saldoActual);
                    }

                    break;
                case 3:
                    System.out.println("Su saldo es de "+saldoActual);

                case 4:
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida");

            }

            System.out.println("Desea Realizar algo mas\n1. Si\n2. No");
            respuesta=Integer.parseInt(lector.readLine());

        }while(respuesta==1);
        System.out.println("Adios, Vuelva Pronto");



    }
}
