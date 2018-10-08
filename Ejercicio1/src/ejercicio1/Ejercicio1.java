package ejercicio1;
    import javax.swing.JOptionPane;
        public class Ejercicio1 {

            public static void main(String[] args) {
                float a, b, c, menor, medio, mayor;
                String primerNumero, segundoNumero, tercerNumero;
            
                    primerNumero = JOptionPane.showInputDialog("Digite el primer número: " );
                    segundoNumero = JOptionPane.showInputDialog("Digite el segundo número: " );
                    tercerNumero = JOptionPane.showInputDialog("Digite el tercer número: " );

                        a = Float.parseFloat(primerNumero);
                        b = Float.parseFloat(segundoNumero);
                        c = Float.parseFloat(tercerNumero);
                        
                    if (a >= b && a > c){
                        mayor = a;
                            if (b >= c){
                                medio = b;
                                menor = c;
                            }else{
                                medio = c;
                                menor = b;                                  
                            }
                    }else if (b >= a && b > c){
                        mayor = b;
                            if (a >= c){
                                medio = a;
                                menor = c;
                            }else{
                                medio = c;
                                menor = a;                                  
                            }
                    }else {
                        mayor = c;
                            if (a >= b){
                                medio = a;
                                menor = b;
                            }else{
                                medio = b;
                                menor = a;                                  
                            }
                        }
                JOptionPane.showMessageDialog(null, mayor+" , "+ medio + " , " + menor);
                System.out.println(mayor+"\t"+ medio + "\t" + menor);    
            }
        }
