/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instrucciones;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Metodo extends Instruccion{

    private String nombre;
    private String tipo;
    private ArrayList<Variable> parametros = new ArrayList<>();

    public Metodo(String nombre, String tipo, String params) {
        this.nombre = nombre;
        this.tipo = tipo;
        //agregar las variables
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Variable> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Variable> parametros) {
        this.parametros = parametros;
    }
        
    @Override
    public void constructor(String datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    

}
