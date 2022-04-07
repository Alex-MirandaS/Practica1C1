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
public class BORRAR {

    ArrayList<Clase> clases = new ArrayList<>();
    ArrayList<Variable> variables = new ArrayList<>();
    ArrayList<Metodo> metodos = new ArrayList<>();
    ArrayList<Comentario> comentarios = new ArrayList<>();

    private void evaluarVariables(String t, String var) {
        String[] variables = var.split(",");
        for (int i = 0; i < variables.length; i++) {
            añadirVariable(t, variables[i]);
        }
    }

    private void guardarClase(String t) {

//            if (claseTemp == t) {
//                clases.add(new Clase(t, metodos, variables));
//            }
        metodos = new ArrayList<>();
        variables = new ArrayList<>();
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public void añadirComentario(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    private void añadirMetodo(String tipo, String nombre, String params) {
        metodos.add(new Metodo(nombre, tipo, params));
    }

    private void añadirComentario(String comentario) {
        comentarios.add(new Comentario(comentario));
    }

    private void añadirVariable(String tipo, String id) {
        variables.add(new Variable(tipo, id));
    }

//    private void añadirString(String dato) {
//        temp.add(dato);
//    }
//
//    private void reiniciarTemp() {
//        if (temp.size() != 0) {
//            instrucciones.add(temp);
//        }
//        temp = new ArrayList<>();
//    }
}
