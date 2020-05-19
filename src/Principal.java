
import java.util.Scanner;


public class Principal {
   
public static void main(String[]args)   { 
  
Scanner leer =new Scanner (System.in);
Vuelo x[] = new Vuelo[2];

 String nombre, destino, origen, salida, silla, cedula;
 
  for(int i=0;i<x.length;i++)
 {   
  System.out.print("ingresa el nombre del pasajero\n");
  nombre =leer.next();
  System.out.print("ingrese destino del pasajero\n"); 
  destino =leer.next();
  System.out.print("ingrese pais de inicio de ruta\n");
  origen =leer.next();
  System.out.print("ingrese silla\n"); 
  silla =leer.next();
  System.out.print("ingrese ceduladel pasajero\n"); 
  cedula =leer.next();
  System.out.print("ingrese hora de salida\n"); 
  salida =leer.next();
  leer.nextLine();
  x[i] = new Vuelo(nombre, destino, origen, salida, silla, cedula);
  }
  
  for(int i=0;i<x.length;i++){  
  
 System.out.println(
         "\nNombre de pasajero  "+x[i].getNombre()+""+
         "\nDestino  "+x[i].getDestino()+""+
         "\nOrigen  "+x[i].getOrigen()+""+
         "\nSilla  "+x[i].getSilla()+
         "\nCedula  "+x[i].getCedula()+"\n");
      
  }
}}
