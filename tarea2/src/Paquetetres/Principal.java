/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetetres;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Precio P;
        P = new Precio();

        Precio n = new Precio(25.9);

        //P.euros=10.1;
        System.out.print(P.obtener());
        System.out.print(n.obtener());
        
    }
}
