package com.company;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        int [ ] trimestre1 = new int[5];
        int [ ] trimestre2 = new int[5];
        int [ ] trimestre3 = new int[5];
        double sumatoria1=0, sumatoria2=0, sumatoria3=0, sumatoriaAlumno=0;
        double primedio1, promedio2, promedio3;
        int posicionAlumno;


        System.out.println("Digite notas del primer trimestre");

        for (int i=0; i<trimestre1.length; i++)
        {
            System.out.print("Alumno "+(i+1)+": ");
            trimestre1[i]= Integer.parseInt(lector.readLine());
            sumatoria1=trimestre1[i]+sumatoria1;

        }

        System.out.println("Digite notas del segundo trimestre");

        for (int i=0; i<trimestre2.length; i++)
        {
            System.out.print("Alumno "+(i+1)+": ");
            trimestre2[i]= Integer.parseInt(lector.readLine());
            sumatoria2=trimestre2[i]+sumatoria2;
        }

        System.out.println("Digite notas del tercer trimestre");

        for (int i=0; i<trimestre3.length; i++)
        {
            System.out.print("Alumno "+(i+1)+": ");
            trimestre3[i]= Integer.parseInt(lector.readLine());
            sumatoria3=trimestre3[i]+sumatoria3;
        }

        primedio1=(sumatoria1/trimestre1.length);
        promedio2=(sumatoria2/trimestre2.length);
        promedio3=(sumatoria3/trimestre3.length);

        System.out.println("Promedio primer trimestre: "+primedio1);
        System.out.println("Promedio segundo trimestre: "+promedio2);
        System.out.println("Promedio tercer trimestre: "+promedio3);

        System.out.println("Introdusca posicion del alumno partiendo desde 0");
        posicionAlumno=Integer.parseInt(lector.readLine());

        sumatoriaAlumno= (double) ((trimestre1[posicionAlumno]+trimestre2[posicionAlumno]+trimestre3[posicionAlumno])/3);

        System.out.println("El promedio del alumno es: "+sumatoriaAlumno);


    }
}
