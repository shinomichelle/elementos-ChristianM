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
public class Gato implements Mascota{
    private String nombre;

    @Override
    public String obtenerRegistro() {
        return "El Gato que registraste es: " + nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
