package progra23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class salida1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	double numero1;
	double numero2;
	double resultado;
	String operacion;
	private JTextField txxtPantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
				//	salida1 frame = new salida1();
				//	frame.setVisible(true);
					programa12 frame= new programa12();
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
	public salida1() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txxtPantalla = new JTextField();

		txxtPantalla.setBounds(39, 48, 362, 42);
		contentPane.add(txxtPantalla);
		txxtPantalla.setColumns(10);
		
		
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txxtPantalla.setText("");
			}
		});

		btnLimpiar.setBounds(330, 106, 67, 62);
		contentPane.add(btnLimpiar);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 3
				String IngreseNumero = txxtPantalla.getText() + btn3.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(242, 190, 67, 62);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 2
				
				String IngreseNumero = txxtPantalla.getText() + btn2.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	
		btn2.setBounds(146, 190, 67, 62);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 1
				String IngreseNumero = txxtPantalla.getText() + btn1.getText();
				txxtPantalla.setText(IngreseNumero);
				
			}
		});
	
		btn1.setBounds(49, 190, 67, 62);
		contentPane.add(btn1);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 6
				String IngreseNumero = txxtPantalla.getText() + btn6.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(242, 270, 67, 64);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 5
				String IngreseNumero = txxtPantalla.getText() + btn5.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
//		btn5.setFont(new Font("Arial", Font.BOLD, 18));
	btn5.setBounds(146, 270, 72, 64);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 4
				String IngreseNumero = txxtPantalla.getText() + btn4.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(49, 272, 67, 62);
		contentPane.add(btn4);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 9
				String IngreseNumero = txxtPantalla.getText() + btn9.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(242, 344, 67, 56);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 8
				String IngreseNumero = txxtPantalla.getText() + btn8.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(146, 344, 72, 56);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 7
				String IngreseNumero = txxtPantalla.getText() + btn7.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(49, 344, 67, 56);
		contentPane.add(btn7);
		
		JButton btnCero = new JButton("0");
		btnCero.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CERO
				String IngreseNumero = txxtPantalla.getText() + btnCero.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
//		btnCero.setFont(new Font("Arial", Font.BOLD, 18));
		btnCero.setBounds(146, 422, 72, 62);
		contentPane.add(btnCero);
		
		JButton btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUNTO
				String IngreseNumero = txxtPantalla.getText() + btnPunto.getText();
				txxtPantalla.setText(IngreseNumero);
			}
		});
	//	btnPunto.setForeground(new Color(255, 0, 0));
//		btnPunto.setFont(new Font("Arial", Font.BOLD, 23));
		btnPunto.setBounds(49, 423, 67, 61);
		contentPane.add(btnPunto);
		
		
		
		JButton btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SUMA
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="+";
			}
		});
	//	btnSuma.setForeground(Color.RED);
	//	btnSuma.setFont(new Font("Arial", Font.BOLD, 18));
		btnSuma.setBounds(330, 190, 67, 62);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//RESTA
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="-";
			}
		});
	//	btnResta.setForeground(Color.RED);
//		btnResta.setFont(new Font("Arial", Font.BOLD, 18));
		btnResta.setBounds(330, 270, 67, 64);
		contentPane.add(btnResta);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MULTIPLICACIÓN
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="*";
			}
		});
	//	btnMulti.setForeground(Color.RED);
	//	btnMulti.setFont(new Font("Arial", Font.BOLD, 18));
		btnMulti.setBounds(330, 344, 67, 56);
		contentPane.add(btnMulti);
		
		JButton btnDivi = new JButton("/");
		btnDivi.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DIVICIÓN
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="/";
			}
		});
	//	btnDivi.setForeground(Color.RED);
	//	btnDivi.setFont(new Font("Arial", Font.BOLD, 18));
		btnDivi.setBounds(330, 422, 67, 62);
		contentPane.add(btnDivi);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionar;
				numero2 = Double.parseDouble(txxtPantalla.getText());
				
				if(operacion == "+") {
					resultado = numero1+numero2;
					seleccionar = String.format("%.0f",resultado);
					txxtPantalla.setText(seleccionar);
				}
				
				else if(operacion == "-") {
					resultado = numero1-numero2;
					seleccionar = String.format("%.0f",resultado);
					txxtPantalla.setText(seleccionar);
				}
				
				else if(operacion == "*") {
					resultado = numero1*numero2;
					seleccionar = String.format("%.0f",resultado);
					txxtPantalla.setText(seleccionar);
				}
				
				else if(operacion == "/") {
					resultado = numero1/numero2;
					seleccionar = String.format("%.2f",resultado);
					txxtPantalla.setText(seleccionar);
				}
				else if(operacion == "R") {
					resultado = Math.pow(numero1, 1.0/numero2);
					seleccionar = String.format("%.2f",resultado);
					txxtPantalla.setText(seleccionar);
				}
				else if(operacion == "N") {
					resultado = Math.pow(numero1,numero2);
					seleccionar = String.format("%.2f",resultado);
					txxtPantalla.setText(seleccionar);
				}
				else if(operacion == "%") {
					resultado =  (numero1 / 100) * numero2;
					seleccionar = String.format("%.2f",resultado);
					txxtPantalla.setText(seleccionar);
				}
			}
		});
	
		btnIgual.setBounds(247, 424, 67, 60);
		contentPane.add(btnIgual);
		
		JButton btnRaiz = new JButton("N√");
		btnRaiz.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="R";	
			}
		});
		btnRaiz.setBounds(49, 107, 67, 61);
		contentPane.add(btnRaiz);
		
		JButton btnpot = new JButton("XN");
		btnpot.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnpot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="N";
			}
		});
		btnpot.setBounds(146, 104, 67, 64);
		contentPane.add(btnpot);
		
		JButton btnPot = new JButton("%");
		btnPot.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txxtPantalla.getText());
				txxtPantalla.setText("");;
				operacion ="%";
			}
			
		});
		btnPot.setBounds(242, 104, 67, 64);
		contentPane.add(btnPot);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(165, 10, 179, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(427, 226, 67, 62);
		contentPane.add(btnExit);
		
		
	}
}
