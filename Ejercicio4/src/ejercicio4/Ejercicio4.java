/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float montopag, montocom, montodes, precio;
        int docenas, obsequio;
        
        docenas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las docenas: "));
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio: "));
        
            montocom = docenas*precio;
            
        if( docenas > 3 )
        {
            montodes = (float) (0.15*montocom);
            obsequio = docenas-3;
        }else 
        {
            montodes = (float) (0.10*montocom);
            obsequio = 0;
        }
        
        montopag = montocom - montodes;
        JOptionPane.showMessageDialog(null, "Monto de compra es: $" + montocom 
                + "\n" + "Monto de descuento es: $"+ montodes 
                + "\n" + "Monto de pago es: $" + montopag
                + "\n" + "Obsequios: "+ obsequio);

    }
}
    
    

