
package boletin7.pkg3;

import javax.swing.JOptionPane;


public class Signos {
 double numero1;
   
public Signos(){}
public Signos(double numero1){
    this.numero1=numero1;
}
public void pedirNumero(){
    String respuesta= JOptionPane.showInputDialog("introduzca numero ");
    numero1= Short.parseShort(respuesta);
}
public void operacion(){
    if (numero1>=0){
        JOptionPane.showMessageDialog(null,"+");
    }else if (numero1<0){
JOptionPane.showMessageDialog(null, "-");
      

}
}
}