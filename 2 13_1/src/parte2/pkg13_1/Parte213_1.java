package parte2.pkg13_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Parte213_1 {
    
    public static void main(String[] args) {
        
        Arbol ar = new Arbol(null);
        Nodo nuevo = new Nodo(14);
        ar.agregar(nuevo, ar.getRaiz());
        
        int NumSS;
        String Nom;
        String Dir;
        
        NumSS = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Numero de Seguridad Social: "));
        Nom = JOptionPane.showInputDialog("Ingresa el Nombre: ");
        Dir = JOptionPane.showInputDialog("Ingresa la Direccion; ");
        
        System.out.println("Los Datos ingresados son:" + "\n Nombre: " + Nom + "\n Numero de seguro social: " + NumSS + "\n Direccion: " + Dir);
        
    }
    
}
