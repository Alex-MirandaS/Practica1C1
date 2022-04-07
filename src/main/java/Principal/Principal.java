/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Archivos.LectorArchivos;
import GUI.PrincipalGUI1;
import java.util.ArrayList;
import javax.swing.JFileChooser;
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
    private Controlador controlador = new Controlador();

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
        imprimirDatos(temp,tempArray);
    }

    private void imprimirDatos(JTextArea areaTexto, ArrayList<String> datos) {
        for (int i = 0; i < datos.size(); i++) {
            areaTexto.setText(areaTexto.getText() + datos.get(i));
        }
    }

    public void analizar() {
        controlador.analizar(principalGUI.getjTextArea1().getText());
    }

}
