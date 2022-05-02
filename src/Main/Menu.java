package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame {//ahora la clase ventana es hija de JFrame y tiene acceso a su biblioteca
	
	private static final long serialVersionUID = 1L;
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();	
	
	public Menu()
	{		
		setBounds(400,150,350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MENU");
		setLayout(null);
		
		btn1 = new JButton(); /*creo boton*/
		btn1.setText("Ejercicio 1");
		btn1.setBounds(100, 50, 140, 30);
		btn1.addActionListener(new BttnEjercicio1());		
		
		btn2 = new JButton();//creo boton
		btn2.setText("Ejercicio 2");
		btn2.setBounds(100, 150, 140, 30);		
		
		btn3 = new JButton();//creo boton
		btn3.setText("Ejercicio 3");
		btn3.setBounds(100, 250, 140, 30);
		getContentPane().add(btn1);//agrego el control a la ventana
		getContentPane().add(btn2);
		getContentPane().add(btn3);		
	}
	
	public void CambiarVisibilidad(boolean Estado)
	{
		setVisible(true);
	}
	
class BttnEjercicio1 implements ActionListener
{
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se esta aprentando Ejercicio 1");
		
	}
	
}


	
	
}
