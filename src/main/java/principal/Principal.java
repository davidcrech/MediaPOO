/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import model.Media;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Media med1 = new Media();
        med1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("nota1: ")));
        med1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("nota2: ")));
        med1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("nota3: ")));
        
        JOptionPane.showMessageDialog(null, med1.getMedia());
    }
}
