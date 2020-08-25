
package banco1;

import javax.swing.JOptionPane;
/**
 * @author Natalia Montenegro Q
 */
public class Cuenta {
    
      //Atributos 
    int Numero_cuenta;
    String Tipo_cuenta;
   
    
   
    //Metodos clase Cliente
    public void IngresarDatos(){
        
        
        String Tipo_cuenta = JOptionPane.showInputDialog("Digite el tipo de cuenta:");
        System.out.println("El tipo de cuenta es: " + (Tipo_cuenta));   
        String Numero_cuenta = JOptionPane.showInputDialog("Digite el numero de cuenta:");
        System.out.println("El numero de cuenta es: " + (Numero_cuenta)); 
       
        
    }
}
