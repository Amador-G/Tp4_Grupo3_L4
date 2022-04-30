package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Ejercicio1 extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	private JButton Mostrar = new JButton();
	private JTextField txtNombre = new JTextField();
	private JTextField txtApellido = new JTextField();
	private JTextField txtTelefono = new JTextField();
	private JTextField txtFechaDeNac = new JTextField();
	
	
	public Ejercicio1()
	{
		setBounds(400,150,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejercicio1");
		getContentPane().setLayout(null);
			
		
		txtNombre = new JTextField();
		txtNombre.setColumns(12);
		txtNombre.setBounds(63, 33,200 ,19);
				
		txtApellido = new JTextField();
		txtApellido.setColumns(12);
		txtApellido.setBounds(63, 66,200 ,19);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(12);
		txtTelefono.setBounds(63, 99,200 ,19);		
		
		txtFechaDeNac = new JTextField();
		txtFechaDeNac.setColumns(12);
		txtFechaDeNac.setBounds(63, 129,200 ,19);
		
		Mostrar = new JButton();//creo boton
		Mostrar.setText("Mostrar");
		Mostrar.setBounds(230, 300, 120, 30);
		Mostrar.addActionListener(new BttnMostrar(txtNombre,txtApellido,txtTelefono,txtFechaDeNac));
		
		getContentPane().add(Mostrar);//agrego el control a la ventana
		getContentPane().add(txtNombre);
		getContentPane().add(txtApellido);
		getContentPane().add(txtTelefono);
		getContentPane().add(txtFechaDeNac);
	}
	
	public void CambiarVisibilidad(boolean Estado)
	{
		setVisible(true);
	}
	
	class BttnMostrar implements ActionListener
	{
		private JTextField txtNombre;
		private JTextField txtApellido;
		private JTextField txtTelefono;
		private JTextField txtFechaDeNac;
		
		public BttnMostrar(JTextField txtn,JTextField txta,JTextField txtt,JTextField  txtf) 
		{
			txtNombre = txtn;
			txtApellido = txta;
			txtTelefono = txtt;
			txtFechaDeNac = txtf;
		}
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("------Datos Ingresasdos\nNombre : "+txtNombre.getText()+"\nApellido :"+txtApellido.getText()+"\nTelefono : "+txtTelefono.getText()+"Fecha de nacimiento : "+txtFechaDeNac.getText());
		}
  }
}
