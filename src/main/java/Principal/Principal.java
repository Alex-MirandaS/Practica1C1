/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Archivos.LectorArchivos;
import GUI.PrincipalGUI1;
import GUI.TablaResultados;
import Instrucciones.Clase;
import Instrucciones.Comentario;
import Instrucciones.Metodo;
import Instrucciones.Variable;
import JFLEX_Y_CUP.AnalizadorLexicoJava;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author alex
 */
public class Principal {

    private ArrayList<String> doc1;
    private ArrayList<String> doc2;
    private LectorArchivos lector;
    private PrincipalGUI1 principalGUI = new PrincipalGUI1(this);
    private TablaResultados tabla = new TablaResultados();

    public void iniciar() {
        principalGUI.setVisible(true);
    }

    public String seleccionarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showOpenDialog(principalGUI);

        return fileChooser.getSelectedFile().getAbsolutePath();
//        pathCarpeta1.setText(fileChooser.getSelectedFile().getAbsolutePath());
//        rutaCarpeta1 = pathCarpeta1.getText();
    }

    public void cargarCarpeta(boolean doccument1) {
        lector = new LectorArchivos(seleccionarArchivo());
        ArrayList<String> tempArray;
        JTextArea temp;
        lector.run();
        if (doccument1) {
            doc1 = lector.getArchivosJava();
            tempArray = doc1;
            temp = principalGUI.getjTextArea1();
        } else {
            doc2 = lector.getArchivosJava();
            tempArray = doc2;
            temp = principalGUI.getjTextArea2();
        }
        imprimirDatos(temp, tempArray);
    }

    private void imprimirDatos(JTextArea areaTexto, ArrayList<String> datos) {
        for (int i = 0; i < datos.size(); i++) {
            areaTexto.setText(areaTexto.getText() + datos.get(i));
        }
    }

    public void analizar() {
        Controlador controlador1 = new Controlador(this);
        Controlador controlador2 = new Controlador(this);

        if (principalGUI.getjTextArea1().getText() != "" && principalGUI.getjTextArea2().getText() != "") {

            controlador1.analizar(principalGUI.getjTextArea1().getText());
            controlador2.analizar(principalGUI.getjTextArea1().getText());
        }

        //verificarDatos(controlador1, controlador2);
    }

    private void verificarDatos(Controlador controlador1, Controlador controlador2) {
        double score = 0;
        score += verificarComentarios(controlador1.getA().getComentarios(), controlador2.getA().getComentarios());
        score += verificarVariables(controlador1.getS().getVariables(), controlador2.getS().getVariables());
        score += verificarMetodos(controlador1.getS().getMetodos(), controlador2.getS().getMetodos());
        score += verificarClases(controlador1.getS().getClases(), controlador2.getS().getClases());

        JOptionPane.showMessageDialog(principalGUI, "EL SCORE TOTAL ES: "+score);
    }

    private double verificarClases(ArrayList<Clase> clases1, ArrayList<Clase> clases2) {
        Clase metTemp;
        double temp = 0;
        for (int i = 0; i < clases1.size(); i++) {
            int coincidencias = 0;
            metTemp = clases1.get(i);
            for (int j = 0; j < clases2.size(); j++) {
                if (metTemp.getId().equals(clases2.get(j).getId())
                        && metTemp.getMetodos().equals(clases2.get(j).getMetodos())
                        && metTemp.getVariables().equals(clases2.get(j).getVariables())) {
                    coincidencias++;
                }
            }
            if (coincidencias != 0) {
                temp += (coincidencias / (clases1.size() + clases2.size())) * 0.25;
            }
        }
        return temp;
    }

    private double verificarMetodos(ArrayList<Metodo> metodos1, ArrayList<Metodo> metodos2) {
        Metodo metTemp;
        double temp = 0;
        for (int i = 0; i < metodos1.size(); i++) {
            int coincidencias = 0;
            metTemp = metodos1.get(i);
            for (int j = 0; j < metodos2.size(); j++) {
                if (metTemp.getNombre().equals(metodos2.get(j).getNombre())
                        && metTemp.getParametros().equals(metodos2.get(j).getParametros())
                        && metTemp.getTipo().equals(metodos2.get(j).getTipo())) {
                    coincidencias++;
                }
            }
            if (coincidencias != 0) {
                temp += (coincidencias / (metodos1.size() + metodos2.size())) * 0.25;
            }
        }
        return temp;
    }

    private double verificarComentarios(ArrayList<Comentario> comentarios1, ArrayList<Comentario> comentarios2) {
        Comentario comTemp;
        double temp = 0;
        for (int i = 0; i < comentarios1.size(); i++) {
            int coincidencias = 0;
            comTemp = comentarios1.get(i);
            for (int j = 0; j < comentarios2.size(); j++) {
                if (comTemp.getComentario().equals(comentarios2.get(j).getComentario())) {
                    coincidencias++;
                }
            }
            if (coincidencias != 0) {
                temp += (coincidencias / (comentarios1.size() + comentarios2.size())) * 0.25;
            }
        }
        return temp;
    }

    private double verificarVariables(ArrayList<Variable> variables1, ArrayList<Variable> variables2) {
        Variable varTemp;
        double temp = 0;
        for (int i = 0; i < variables1.size(); i++) {
            int coincidencias = 0;
            varTemp = variables1.get(i);
            for (int j = 0; j < variables2.size(); j++) {
                if (varTemp.getTipo().equals(variables2.get(j).getTipo()) && varTemp.getIdentificador().equals(variables2.get(j).getIdentificador())) {
                    coincidencias++;
                }
            }
            if (coincidencias != 0) {
                temp += (coincidencias / (variables1.size() + variables2.size())) * 0.25;
            }
        }
        return temp;
    }

}
