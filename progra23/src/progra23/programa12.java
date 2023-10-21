package progra23;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class programa12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JLabel lblLogin;
	private JButton btnClose;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					programa12 frame = new programa12();
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
	public programa12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 155, 126, 19);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(134, 86, 126, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] clave=passwordField.getPassword();
				String claveF= new String(clave);
				
				if(textField.getText().equals("Pedro")&& claveF.equals("L$24S/*a")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido","Calculadora 091-23-6618",
							JOptionPane.INFORMATION_MESSAGE);
					salida1 p = new salida1 ();
					p.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null,"Incorrecto,USuario y/o Caracteres Invalidos","ERROR",JOptionPane.ERROR_MESSAGE);	
				}
			}
			
		});
		btnNewButton.setBounds(36, 235, 134, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(38, 86, 86, 19);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblPassword.setBounds(38, 158, 86, 19);
		contentPane.add(lblPassword);
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblLogin.setBounds(136, 28, 86, 19);
		contentPane.add(lblLogin);
		
		btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(308, 101, 103, 55);
		contentPane.add(btnClose);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
					passwordField.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(217, 235, 134, 21);
		contentPane.add(btnLimpiar);
	}
}
