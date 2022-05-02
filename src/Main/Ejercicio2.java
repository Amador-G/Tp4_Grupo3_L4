package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setResizable(false);
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("");
		panel.setBounds(45, 43, 248, 147);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setBounds(26, 23, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota 2");
		lblNota.setBounds(26, 48, 46, 14);
		panel.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setBounds(26, 73, 46, 14);
		panel.add(lblNota_1);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(26, 98, 46, 14);
		panel.add(lblTps);
		
		textField = new JTextField();
		textField.setBounds(102, 20, 125, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 45, 125, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 70, 125, 20);
		panel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(102, 95, 125, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(45, 232, 248, 75);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(26, 24, 46, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicin = new JLabel("Condici\u00F3n");
		lblCondicin.setBounds(26, 49, 46, 14);
		panel_1.add(lblCondicin);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 21, 125, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 46, 125, 20);
		panel_1.add(textField_4);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(330, 128, 137, 37);
		contentPane.add(btnNuevo);
		
		JButton btnCalcular = new JButton("CALCULAR");
		
		btnCalcular.setBounds(330, 84, 137, 37);
		contentPane.add(btnCalcular);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(330, 169, 137, 37);
		contentPane.add(btnSalir);
	}
}
