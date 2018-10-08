package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Ejercicio6 {

    static Elemento tmp;
    static Elemento tmp_ant;
    public static void main(String[] args) {
        ArrayList<Elemento> elementos = new ArrayList(); 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elementos que dese agregar: ");
               
        int n = scan.nextInt(); 
        System.out.println(" ");
        
        for( int i = 0; i<n; i++){
            Elemento e = new Elemento();
            System.out.println("Ingrese el nombre:  ");
            e.nombre = scan.next();
            System.out.println("Ingrese la conductividad termica: ");
            e.conductividad_termica = scan.nextFloat();
            System.out.println("Ingrese la conductividad electrica: ");
            e.conductividad_electrica = scan.nextFloat();
            elementos.add(e);
        }
        tmp = elementos.get(0);
        tmp_ant = tmp;
        int mayor = 0;
        
        
            elementos.forEach ( (Elemento item) ->{
            if(item.conductividad_electrica > tmp.conductividad_electrica && item.conductividad_termica>tmp.conductividad_termica){
           tmp_ant = tmp;
           tmp = item;
            }         
    });
            System.out.println("conductividad electrica mayor: "+tmp.nombre + " " +tmp.conductividad_electrica);
            System.out.println("conductividad termica mayor: "+tmp.nombre + " "+tmp.conductividad_termica);
            
            elementos.forEach ( (Elemento item) ->{
            if(item.conductividad_electrica < tmp.conductividad_electrica && item.conductividad_termica < tmp.conductividad_termica){
           tmp_ant = tmp;
           tmp = item;
            }         
    });
            System.out.println("conductividad electrica menor: "+tmp.nombre+ " " +tmp.conductividad_electrica);
            System.out.println("conductividad termica menor: "+tmp.nombre+ " " +tmp.conductividad_termica);
            
        
    }
    
}
