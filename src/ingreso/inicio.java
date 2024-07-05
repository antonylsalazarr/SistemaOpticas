package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Inicio");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVentas = new JButton("VENTAS");
		btnVentas.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ventas newframe = new Ventas();
				newframe.setVisible(true);
				
			}
		});
		btnVentas.setBounds(0, 0, 124, 55);
		contentPane.add(btnVentas);
		
		JButton btnStock = new JButton("STOCK");
		btnStock.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Stock newframe = new Stock();
				newframe.setVisible(true);
			}
		});
		btnStock.setBounds(123, 0, 124, 55);
		contentPane.add(btnStock);
		
		JButton btnPacientes = new JButton("PACIENTES");
		btnPacientes.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pacientes newframe = new Pacientes();
				newframe.setVisible(true);
				
			}
		});
		btnPacientes.setBounds(246, 0, 124, 55);
		contentPane.add(btnPacientes);
	}
}
