package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejercicio1 extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	private JButton Mostrar = new JButton();
	private JTextField txtNombre = new JTextField();
	private JTextField txtApellido = new JTextField();
	private JTextField txtTelefono = new JTextField();
	private JTextField txtFechaDeNac = new JTextField();
	private JLabel lblNombre = new JLabel();
	private JLabel lblApellido = new JLabel();
	private JLabel lblTelefono = new JLabel();
	private JLabel lblFecDeNac = new JLabel();
	
	
	
	public Ejercicio1()
	{
		setBounds(400,150,400,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejercicio1");
		getContentPane().setLayout(null);
			
		lblNombre = new JLabel();
		lblNombre.setBounds(30, 33, 60, 19);
		lblNombre.setText("Nombre : ");
		txtNombre = new JTextField();
		txtNombre.setColumns(12);
		txtNombre.setBounds(110, 33,200 ,19);
		
		lblApellido = new JLabel();
		lblApellido.setBounds(30, 66, 60, 19);
		lblApellido.setText("Apellido :");		
		txtApellido = new JTextField();
		txtApellido.setColumns(12);
		txtApellido.setBounds(110, 66,200 ,19);
	
		lblTelefono = new JLabel();
		lblTelefono.setBounds(30, 99, 60, 19);
		lblTelefono.setText("Telefono : ");
		txtTelefono = new JTextField();
		txtTelefono.setColumns(12);
		txtTelefono.setBounds(110, 99,200 ,19);		
		
		lblFecDeNac = new JLabel();
		lblFecDeNac.setBounds(30, 129, 90, 19);
		lblFecDeNac.setText("F.nacimiento : ");
		txtFechaDeNac = new JTextField();
		txtFechaDeNac.setColumns(12);
		txtFechaDeNac.setBounds(135, 129,100 ,19);
		
		Mostrar = new JButton();//creo boton
		Mostrar.setText("Mostrar");
		Mostrar.setBounds(280, 150, 90, 25);
		ListenerBttnMostrar btnmostrar = new ListenerBttnMostrar();
		btnmostrar.setTxtNombre(txtNombre);
		btnmostrar.setTxtApellido(txtApellido);
		btnmostrar.setTxtTelefono(txtTelefono);
		btnmostrar.setTxtFechaDeNac(txtFechaDeNac);
		
		Mostrar.addActionListener(btnmostrar);
		
		getContentPane().add(Mostrar);//agrego el control a la ventana
		getContentPane().add(lblNombre);
		getContentPane().add(txtNombre);
		getContentPane().add(lblApellido);
		getContentPane().add(txtApellido);
		getContentPane().add(lblTelefono);
		getContentPane().add(txtTelefono);
		getContentPane().add(lblFecDeNac);
		getContentPane().add(txtFechaDeNac);
	}
	
	public void CambiarVisibilidad(boolean Estado)
	{
		setVisible(true);
	}
	
	class ListenerBttnMostrar implements ActionListener
	{
		private JTextField txtNombre;
		private JTextField txtApellido;
		private JTextField txtTelefono;
		private JTextField txtFechaDeNac;
		
		
		public ListenerBttnMostrar() {}
					
		public JTextField getTxtNombre() {
			return txtNombre;
		}

		public void setTxtNombre(JTextField txtNombre) {
			this.txtNombre = txtNombre;
		}

		public JTextField getTxtApellido() {
			return txtApellido;
		}

		public void setTxtApellido(JTextField txtApellido) {
			this.txtApellido = txtApellido;
		}

		public JTextField getTxtTelefono() {
			return txtTelefono;
		}

		public void setTxtTelefono(JTextField txtTelefono) {
			this.txtTelefono = txtTelefono;
		}

		public JTextField getTxtFechaDeNac() {
			return txtFechaDeNac;
		}

		public void setTxtFechaDeNac(JTextField txtFechaDeNac) {
			this.txtFechaDeNac = txtFechaDeNac;
		}

		

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("------Datos Ingresasdos\nNombre : "+txtNombre.getText()+"\nApellido :"+txtApellido.getText()+"\nTelefono : "+txtTelefono.getText()+"\nFecha de nacimiento : "+txtFechaDeNac.getText());
		}
  }

}
