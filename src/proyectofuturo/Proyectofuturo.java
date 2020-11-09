/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofuturo;

/**
 *
 * @author ATcoils
 */
public class Proyectofuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Estudiante " + args[0] + " " + args[1] + " : ");
        

    }
    
        public static String veredicto(String[] args) {
        String valor1 = args[0];
        String valor2 = args[1];
        if (valor1.equals(valor2)) {
    return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
       }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
       }
    return "Ideal. Trabajas los contenidos en casa.";

}
    
    
}
