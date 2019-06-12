/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ets_tayri;

import javax.swing.JOptionPane;

/**
 *
 * @author AlumGS
 */
public class Examen_ets_tayri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int opcion;
        int decidir = JOptionPane.showConfirmDialog(null, "Â¿Quieres calcular algo?");
         if (decidir == JOptionPane.YES_OPTION){
         opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion para resolver: \n 1: areaCuadrado \n 2: areaRectangulo \n 3: areaCirculo \n 4: areaTriangulo"));
        if (opcion == 1){
        	area_cuadrado();
        }
        if (opcion == 2){
        	areaRectangulo();
        }
        if (opcion == 3){
        	areaCirculo();
        }
        if (opcion == 4){
        	areaTriangulo();
        }
     }
     if (decidir == JOptionPane.NO_OPTION){
         JOptionPane.showMessageDialog(null, "Pues na sigue con tu vida guapi");
     }
     if (decidir == JOptionPane.CANCEL_OPTION){
         System.exit(0);
     
    }
     
        
    }
        public static void area_cuadrado() {
		double lado1, lado2, result;
		lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: " ));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        result = lado1 * lado2;
        JOptionPane.showMessageDialog(null, result);
	}
	public static void areaRectangulo() {
        //b=base
        //h=altura
		double b, h, resultado;
		 b = Integer.parseInt(JOptionPane.showInputDialog(null, "Indica la base del rectángulo: " ));
         h = Integer.parseInt(JOptionPane.showInputDialog(null, "Indica la altura del rectángulo "));
         resultado = b * h;
         JOptionPane.showMessageDialog(null, resultado);
	}
	public static void areaCirculo() {
		double pi, radio, resultado;
		 pi = 3.14;
         radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Indica el radio: "));
         resultado = pi * Math.pow(radio, 2);
         JOptionPane.showMessageDialog(null, resultado);
	}
	public static void areaTriangulo() {
        //b=base
        //h=altura
		double b, h, result;
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Indica la base del triangulo: " ));
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Indica la altura del triangulo: "));
        result = (b * h) / 2;
        JOptionPane.showMessageDialog(null, result);
	}
    
    
}
