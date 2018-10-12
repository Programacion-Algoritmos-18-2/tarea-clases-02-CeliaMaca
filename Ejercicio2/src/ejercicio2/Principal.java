/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto 1 
        Equipo e1;
        e1= new Equipo();
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n",e1.obtener_nombre(),e1.obtener_numero_jugadores(),e1.obtener_ciudad());
        //Objeto 2
        Equipo e2;
        e2= new Equipo("Liga de Loja");
        e2.agregar_ciudad("Loja");
        e2.agregar_numero_jugadores(21);
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\n Ciudad: %s\n",e2.obtener_nombre(),e2.obtener_numero_jugadores(),e2.obtener_ciudad());
        //Objeto 3
        Equipo e3;
        e3= new Equipo("Barcelona",20);
        e3.agregar_ciudad("Guayaquil");
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n",e3.obtener_nombre(),e3.obtener_numero_jugadores(),e3.obtener_ciudad());
        //Objeto 4
        Equipo e4;
        e4=new Equipo("El nacional", 23,"Quito");
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n",e4.obtener_nombre(),e4.obtener_numero_jugadores(),e4.obtener_ciudad());
        
    }
    
}
