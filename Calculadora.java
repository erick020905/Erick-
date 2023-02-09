/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
	


	String Peso=JOptionPane.showInputDialog("Informe Peso");
    float peso=Float.parseFloat(Peso); //Passa PESO (String) para peso (float)
 
     
    String Altura= JOptionPane.showInputDialog("Informe Altura");
    float altura=Float.parseFloat(Altura); //Passa Altura (String) para altura (float)

 float imc= peso /(altura*altura);

  

   JOptionPane.showMessageDialog(null,"Imc ="+imc);
   [b] if (imc <17) {
    	
    	JOptionPane.showMessageDialog(null,"Muito abaixo do Peso!");
    	if (imc >=17&&imc<=18.49){
    		
    	  	JOptionPane.showMessageDialog(null,"Abaixo do Peso");}
    	  	if (imc>=18.5&&imc<=24.99){
    	  		
    	  	  	JOptionPane.showMessageDialog(null,"Peso Normal!");}
    	  	  	if (imc>=25&&imc<=29.99) {
    	  	    	JOptionPane.showMessageDialog(null,"Acima do Peso!");}
    	  	    	
    	  	    	if (imc>=30&&imc<=34.99) {
	    	  	    	JOptionPane.showMessageDialog(null,"Obesidade I!");}
    	  	    	
	    	  	    	if (imc>=35&imc<=39.99) {
		    	  	    	JOptionPane.showMessageDialog(null,"Obesidade II(Severa)!");}
	    	  	    	
		    	  	    	if (imc>40) {
			    	  	    	JOptionPane.showMessageDialog(null,"Obesidade III(Morbida)!");} 
		    	  	    	
    	  	    	
    	  	  	}
    	  	
    	  	}
    	
        }
    }
    
}
