/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrillo.Registro.Model;

/**
 *
 * @author T107
 */
public class Perro implements Mascota {

    private static String nombre;
    
    public Perro() {
    }
    @Override
    public String obtenerRegistro() {
        return "El Perro que registraste es: " + nombre;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

}
