/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Equipo {

    //Declaracion de variables
    private String nombre, ciudad;
    private int numero_jugadores;

    //Declarion del OBTENER Y AGREGAR
    public String obtener_nombre() {
        return nombre;
    }

    public String obtener_ciudad() {
        return ciudad;
    }

    public int obtener_numero_jugadores() {
        return numero_jugadores;
    }

    public void agregar_nombre(String a) {
        nombre = a;
    }

    public void agregar_ciudad(String b) {
        ciudad = b;
    }

    public void agregar_numero_jugadores(int x) {
        numero_jugadores = x;
    }

    //Declaracion de los constructores
    public Equipo() {//sin atributos de entrada
        agregar_nombre("Sin nombre");
        agregar_ciudad("Ciudad no ingresada");
        agregar_numero_jugadores(000);
    }

    public Equipo(String a) {//un atributo de entrada
        agregar_nombre(a);
    }

    public Equipo(String a, int x) {//dos atributos de entrada
        agregar_numero_jugadores(x);
    }

    public Equipo(String a, int x, String b) {//tres atributos de entrada
        agregar_nombre(a);
        agregar_ciudad(b);
        agregar_numero_jugadores(x);
    }
}
