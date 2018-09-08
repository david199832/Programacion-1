package vista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Interfaz {

	private String monto;
	private String lector;
	private int montoNumero;
	
	
	
	public void mostrar(String y) {
		
		
		JOptionPane.showMessageDialog(null, y);
		
		
	}
	public int pedirDato() throws IOException {
		
	
		lector = JOptionPane.showInputDialog(null, "ingrese el monto textual que desea: ");
		
		montoNumero = Integer.parseInt(lector);
		
		return montoNumero;
	}
	
}
