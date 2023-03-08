
package ejercicio0802;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio0802 {


    public static int numeroAlumnos()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                System.out.print("Número de alumnos: ");
                return sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Valor incorrecto");
                sc.nextLine();
            }
        }
    }
    
    public static void leerAlturas(ArrayList<Double> l, int n)
    {
        Scanner sc = new Scanner(System.in);
        while (l.size()<n)
        {
            try
            {
                System.out.print("Altura "+(l.size()+1)+":");
                l.add(sc.nextDouble());
            }
            catch (Exception e)
            {
                System.out.println("Valor incorrecto");
                sc.nextLine();
            }
        }
    }
    
    public static double calcularMedias(ArrayList<Double> l)
    {
        double suma = 0;
        for (int i = 0; i < l.size(); i++)
            suma+=l.get(i);
        return suma/l.size();
    }
    
    public static void mostrarResultados(ArrayList<Double> l, double m)
    {
        int inf=0, sup=0,igual=0;
        for (int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i));
            if (l.get(i)> m)
                sup++;
            else if (l.get(i)<m)
                inf++;
            else
                igual++;
        }
        System.out.println("Superior: "+sup+
                            "\nInferior: "+inf+
                            "\nIgual: "+igual);
    }
    
    public static void main(String[] args) {
        
        ArrayList<Double> alturas = new ArrayList<Double>();
        
        int n = numeroAlumnos();
        
        leerAlturas(alturas, n);
        
        mostrarResultados(alturas, calcularMedias(alturas));
        
    }
    
}
