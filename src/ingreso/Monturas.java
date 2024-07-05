package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;

public class Monturas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmont;
	private JTextField txtcod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monturas frame = new Monturas();
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
	public Monturas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Monturas");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalida = new JButton("EXIT");
		btnSalida.setBounds(771, 0, 55, 55);
		contentPane.add(btnSalida);
		
		JLabel lblNewLabel = new JLabel("Monturas");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(356, 21, 101, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblmarcamont = new JLabel("Marca:");
		lblmarcamont.setFont(new Font("Arial", Font.PLAIN, 12));
		lblmarcamont.setBounds(57, 79, 45, 13);
		contentPane.add(lblmarcamont);
		
		JLabel lblcodmont = new JLabel("Código:");
		lblcodmont.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcodmont.setBounds(361, 79, 45, 13);
		contentPane.add(lblcodmont);
		
		txtmont = new JTextField();
		txtmont.setFont(new Font("Arial", Font.PLAIN, 12));
		txtmont.setBounds(112, 76, 239, 19);
		contentPane.add(txtmont);
		txtmont.setColumns(10);
		
		txtcod = new JTextField();
		txtcod.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcod.setBounds(416, 76, 367, 19);
		contentPane.add(txtcod);
		txtcod.setColumns(10);
		
		JList listmont = new JList();
		listmont.setFont(new Font("Calibri", Font.PLAIN, 12));
		listmont.setBounds(57, 123, 726, 361);
		contentPane.add(listmont);
		
		JButton btnelimmontura = new JButton("Eliminar");
		btnelimmontura.setFont(new Font("Arial", Font.PLAIN, 12));
		btnelimmontura.setBounds(698, 514, 85, 21);
		contentPane.add(btnelimmontura);
		
		JButton btnaggmont = new JButton("Agregar");
		btnaggmont.setFont(new Font("Arial", Font.PLAIN, 12));
		btnaggmont.setBounds(603, 514, 85, 21);
		contentPane.add(btnaggmont);
	}
}
