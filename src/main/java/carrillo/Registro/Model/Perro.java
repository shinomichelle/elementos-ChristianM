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
public class Perro {
    
    private static String nombre;

    public static String getNombre() {
        return nombre;
    }

       
    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

    public String obtenerRegistro(){
        return "El Registro que registrste es: " + nombre;
        
        
    }
       
    
}
