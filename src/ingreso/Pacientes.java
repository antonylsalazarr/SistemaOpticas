package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Pacientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacientes frame = new Pacientes();
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
	public Pacientes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Pacientes");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevoPaciente = new JButton("NUEVO PACIENTE");
		btnNuevoPaciente.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnNuevoPaciente.setBounds(0, 0, 124, 55);
		contentPane.add(btnNuevoPaciente);
		
		JButton btnHistorial = new JButton("HISTORIAL");
		btnHistorial.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnHistorial.setBounds(123, 0, 124, 55);
		contentPane.add(btnHistorial);
	}

}
