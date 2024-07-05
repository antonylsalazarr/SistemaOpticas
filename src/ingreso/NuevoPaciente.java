package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NuevoPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombrepx;
	private JTextField txtapepx;
	private JTextField txtedad;
	private JTextField txtcel;
	private JButton btnSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoPaciente frame = new NuevoPaciente();
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
	public NuevoPaciente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Nuevo Paciente");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnuevopx = new JLabel("Nuevo Paciente");
		lblnuevopx.setFont(new Font("Arial", Font.BOLD, 20));
		lblnuevopx.setHorizontalAlignment(SwingConstants.CENTER);
		lblnuevopx.setBounds(329, 10, 150, 36);
		contentPane.add(lblnuevopx);
		
		JLabel lblNewLabel = new JLabel("Nombres:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(232, 212, 69, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(232, 252, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(232, 298, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		txtnombrepx = new JTextField();
		txtnombrepx.setFont(new Font("Arial", Font.PLAIN, 12));
		txtnombrepx.setBounds(296, 208, 335, 19);
		contentPane.add(txtnombrepx);
		txtnombrepx.setColumns(10);
		
		txtapepx = new JTextField();
		txtapepx.setFont(new Font("Arial", Font.PLAIN, 12));
		txtapepx.setBounds(296, 248, 335, 19);
		contentPane.add(txtapepx);
		txtapepx.setColumns(10);
		
		txtedad = new JTextField();
		txtedad.setFont(new Font("Arial", Font.PLAIN, 12));
		txtedad.setBounds(296, 294, 50, 19);
		contentPane.add(txtedad);
		txtedad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Celular:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(395, 298, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		txtcel = new JTextField();
		txtcel.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcel.setBounds(463, 294, 96, 19);
		contentPane.add(txtcel);
		txtcel.setColumns(10);
		
		btnSalida = new JButton("EXIT");
		btnSalida.setBounds(771, 0, 55, 55);
		contentPane.add(btnSalida);
	}

}
