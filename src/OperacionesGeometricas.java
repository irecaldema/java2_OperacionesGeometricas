import java.util.Scanner;
//CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH
import com.zubiri.geometria.*;
public class OperacionesGeometricas 
{
public static void main (String args[]) 
	{
 char opcion;
 double radio, base, altura;
 Scanner sc = new Scanner(System.in);
 
 System.out.print("\nElija la figura que quiere analizar: Rectangulo (R)  Circulo (C) Terminar (T)  "); 
 System.out.print("\n");
 opcion = sc.next().charAt(0);

 while (opcion!='T'&&opcion!='t')
			{
 if(opcion=='C'||opcion=='c')
 {

  System.out.print("\ningresa el radio del circulo a analizar: ");
  radio = sc.nextDouble();
 
  Circulo circu = new Circulo(radio);

  System.out.println("\nEl area del circulo es: " + circu.area());
  System.out.println("\nLa circunferencia del circulo es: " + circu.circu());

 }
 else  if(opcion=='R'||opcion=='r')
 { 
   System.out.print("\ningresa la base del rectangulo a analizar: ");
   base = sc.nextDouble();

   System.out.print("\ningresa la altura del rectangulo a analizar: ");
   altura = sc.nextDouble();
   
   Rectangulo recta = new Rectangulo(base,altura);

   System.out.println("\nEl area del rectangulo es: " + recta.area());
   System.out.println("\nEl Perimetro del rectangulo es: " + recta.peri());

 }
 else
 {
   System.out.println("\nVa a ser que no has escrito bien...");
   System.out.println("\nPrueba otra vez...");
 }
 
 System.out.print("\nElija la figura que quiere analizar: Rectangulo (R)  Circulo (C) Terminar (T)"); 
 System.out.print("\n");
 opcion = sc.next().charAt(0);
			}
 System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
