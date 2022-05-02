package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(61, 31, 331, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblElijaUnSistema = new JLabel("Elija un sistema operativo");
		lblElijaUnSistema.setBounds(10, 11, 127, 14);
		panel.add(lblElijaUnSistema);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(143, 7, 70, 23);
		panel.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxMac = new JCheckBox("Mac");
		chckbxMac.setBounds(218, 7, 45, 23);
		panel.add(chckbxMac);
		
		JCheckBox chckbxLinux = new JCheckBox("Linux");
		chckbxLinux.setBounds(267, 7, 70, 23);
		panel.add(chckbxLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(61, 82, 331, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblElijaUnaEspecialidad = new JLabel("Elija una especialidad");
		lblElijaUnaEspecialidad.setBounds(10, 40, 127, 14);
		panel_1.add(lblElijaUnaEspecialidad);
		
		JCheckBox chckbxProgramacin = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacin.setBounds(152, 7, 97, 23);
		panel_1.add(chckbxProgramacin);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setBounds(152, 36, 97, 23);
		panel_1.add(chckbxAdministracin);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxDiseoGrfico.setBounds(152, 62, 97, 23);
		panel_1.add(chckbxDiseoGrfico);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en un computador:");
		lblCantidadDeHoras.setBounds(71, 202, 198, 14);
		contentPane.add(lblCantidadDeHoras);
		
		textField = new JTextField();
		textField.setBounds(279, 199, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(303, 247, 89, 23);
		contentPane.add(btnNewButton);
	}
}
