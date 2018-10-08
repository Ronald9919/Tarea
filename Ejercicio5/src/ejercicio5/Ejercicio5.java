package ejercicio5;
    
    import javax.swing.JOptionPane;

        public class Ejercicio5 {

    
    public static void main(String[] args) {
        int distancia_recorrida;
        float monto_a_pagar, tarifa_fija;
        
            distancia_recorrida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de distancia recorrida"));
            tarifa_fija=30;
            monto_a_pagar=0;
            
                if(distancia_recorrida<300)
            monto_a_pagar=tarifa_fija;
                if(distancia_recorrida>=300&&distancia_recorrida<1000)
            monto_a_pagar=(float) (tarifa_fija+(distancia_recorrida-300)*0.15);
                if(distancia_recorrida>=1000)
            monto_a_pagar=(float) (tarifa_fija+700*0.10+(distancia_recorrida-1000)*0.10);
            
                JOptionPane.showMessageDialog(null, "Valor de monto a pagar: " + monto_a_pagar + "\n" +
            "Valor de tarifa fija: " + tarifa_fija);
    }
    
}
