/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import javax.swing.JOptionPane;


public class Suma1 {
    double a,b,suma;
    public void Suma(){
           a= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
               b= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
               suma =a+b;
               JOptionPane.showMessageDialog(null, "El resultado de la suma es : "+suma);
    }



    
}
