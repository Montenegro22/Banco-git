
package banco1;

import javax.swing.JOptionPane;
/**
 * @author Natalia Montenegro Q
 */
public class Cliente {
   
    //Atributos 
    String Nombre;
    String Apellido;
    int Cedula;
   
    //Metodos clase Cliente
    public void IngresarDatos(){
        
        String NombreCliente = JOptionPane.showInputDialog("Digite su nombre:");
        System.out.println("El nombre ingresado es: " + (NombreCliente));
        String ApellidoCliente = JOptionPane.showInputDialog("Digite su Apellido:");
        System.out.println("El nombre Apellido es: " + (ApellidoCliente));
        String CedulaCliente= JOptionPane.showInputDialog("Introduzca su cedula:");
        System.out.println("El doble del número introducido es: " +Integer.valueOf(CedulaCliente));
        
    }
    
}


