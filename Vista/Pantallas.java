package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantallas {

public String IngresarValor(String Titulo){
	JFrame frame = new JFrame();
	String ValorIngresado = JOptionPane.showInputDialog(frame , Titulo );
	return ValorIngresado;
}	

 public void MostrarMensaje(String Mensaje){
	 JFrame frame = new JFrame();
	 JOptionPane.showMessageDialog(frame , Mensaje);
}
	
}
