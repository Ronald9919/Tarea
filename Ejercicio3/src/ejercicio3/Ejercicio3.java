package ejercicio3;


import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        int n;
        float peso, altura, promedioP, promedioA, sumaP = 0, sumaA = 0;
        String Peso, Altura, N;
        
        N = JOptionPane.showInputDialog("Igrese el numero de personas a evaluar: ");
        n = Integer.parseInt(N);

                for (int i = 1; i <= n; i ++ ){
                    Peso = JOptionPane.showInputDialog("Digite el peso en LB: " );
                    Altura = JOptionPane.showInputDialog("Digite la altura en CM: " );
                    peso = Float.parseFloat(Peso);
                    altura = Float.parseFloat(Altura);
                    
                sumaP = sumaP + peso;
                sumaA = sumaA + altura;
                
                }
                promedioP = sumaP / n;
                promedioA = sumaA / n;
                JOptionPane.showMessageDialog(null, "Promedio del peso es : " + promedioP +"\n" 
                +"Promedio de la altura es : " + promedioA);
                
           
            }    
        }
 
    
