import java.util.Scanner;
import librerias.geometria.*;

public class OperacionesGeometricas 
{

public static void main (String args[]) 
	{

 String opcion, rectangulo="rectangulo", circulo="circulo";
 double radio, base, altura;

 Scanner sc = new Scanner(System.in);
 Circulo circu = new Circulo();
 Rectangulo recta = new Rectangulo();

 System.out.print("\nElija la figura que quiere analizar: (Rectangulo/Circulo) ");

 opcion = sc.next();

 if(opcion.equalsIgnoreCase(circulo))
 {

  System.out.print("\ningresa el radio del circulo a analizar: ");
 
  System.out.print("\ningresa el radio del circulo a analizar: ");
  radio = sc.nextDouble();
  operaciones.setRadio(radio);

  System.out.println("\nEl area del circulo es: " + circu.Area());
  System.out.println("\nLa circunferencia del circulo es: " + circu.Circu());

 }

 if(opcion.equalsIgnoreCase(rectangulo)) 
 {

  System.out.print("\ningresa la base del rectangulo a analizar: ");
  base = sc.nextDouble();
  operaciones.setBase(base);

  System.out.print("\ningresa la base del rectangulo a analizar: ");
  base = sc.nextDouble();
  operaciones.setAltura(altura);

  System.out.println("\nEl area del rectangulo es: " + recta.Area());
  System.out.println("\nEl Perimetro del rectangulo es: " + recta.Peri());

 }

 else
 {

  System.out.println("\nVa a ser que no has escrito bien...");
  System.out.println("\nPrueba otra vez...");

 }

 System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
