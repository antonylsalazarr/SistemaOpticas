package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingreso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField txtcontraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingreso frame = new Ingreso();
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
	public Ingreso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(253, 220, 54, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(232, 254, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		txtusuario = new JTextField();
		txtusuario.setFont(new Font("Arial", Font.PLAIN, 12));
		txtusuario.setBounds(310, 216, 224, 19);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcontraseña.setBounds(310, 250, 224, 19);
		contentPane.add(txtcontraseña);
		
		JButton btnentrar = new JButton("Entrar");
		btnentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (String.valueOf(txtusuario.getText()).compareTo("user") == 0 && String.valueOf(txtcontraseña.getPassword()).compareTo("0000") == 0) {
					inicio newframe = new inicio();
					newframe.setVisible(true);
					dispose();
					}
				else{
					}
				
			}
		});
		btnentrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnentrar.setBounds(325, 293, 85, 21);
		contentPane.add(btnentrar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtusuario.setText("");
				txtcontraseña.setText("");
				txtusuario.requestFocus();
			}
		});
		btncancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btncancelar.setBounds(435, 293, 85, 21);
		contentPane.add(btncancelar);
	}

}
