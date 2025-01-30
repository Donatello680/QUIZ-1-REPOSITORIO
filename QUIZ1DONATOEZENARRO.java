/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg1.donato.ezenarro;

import javax.swing.JOptionPane;

/**
 *
 * @author genes
 */
public class QUIZ1DONATOEZENARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Quiz1
        String NombreTrabajador="";
        Double SalarioMensual=0.0;
        Double SeguroEnfermedadMaternidad=0.0;
        Double SeguroInvalidezVejez=0.0;
        Double TotalCaja=0.0;
        String VariableNumerica="";
        
        NombreTrabajador=JOptionPane.showInputDialog("Hola buenas, digite su nombre");
        VariableNumerica=JOptionPane.showInputDialog("Digite su salario mensual");
        
        SalarioMensual=Double.parseDouble(VariableNumerica);
        
        SeguroEnfermedadMaternidad=SalarioMensual*0.0925;
        SeguroInvalidezVejez=SalarioMensual*0.058;
        TotalCaja=SeguroEnfermedadMaternidad+SeguroInvalidezVejez;
        
       JOptionPane.showMessageDialog(null, "Bueno "+ NombreTrabajador + "\n" +
               "Su salario Mnesual es "+ SalarioMensual + "\n" + "El monto total a pagar por el fondo de Invalidez Vejez y muerte es " 
       + SeguroInvalidezVejez+ "\n" + "El monto total a pagar por el fondo de Maternidad es " +
               SeguroEnfermedadMaternidad + "\n" + "Y a la caja se le abona un total de " + TotalCaja + "\n");
        
        
       
      
       
               
       
        
        
        
        
        
        
        
    }
    
}
