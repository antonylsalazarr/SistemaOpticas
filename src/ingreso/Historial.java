package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Historial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombrepx;
	private JTextField txtcel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historial frame = new Historial();
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
	public Historial() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Historial");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Historial");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(338, 10, 128, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblpx = new JLabel("Paciente:");
		lblpx.setFont(new Font("Arial", Font.PLAIN, 12));
		lblpx.setBounds(78, 71, 67, 13);
		contentPane.add(lblpx);
		
		txtnombrepx = new JTextField();
		txtnombrepx.setFont(new Font("Arial", Font.PLAIN, 12));
		txtnombrepx.setBounds(138, 68, 394, 19);
		contentPane.add(txtnombrepx);
		txtnombrepx.setColumns(10);
		
		JLabel lblcelular = new JLabel("Celular:");
		lblcelular.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcelular.setBounds(78, 111, 45, 13);
		contentPane.add(lblcelular);
		
		txtcel = new JTextField();
		txtcel.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcel.setColumns(10);
		txtcel.setBounds(138, 108, 96, 19);
		contentPane.add(txtcel);
		
		JLabel lblNewLabel_3 = new JLabel("Optometría");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(78, 167, 89, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Esfera");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(128, 201, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cilindro");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(214, 201, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Eje");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(305, 201, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DIP");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(474, 201, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DNP");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(383, 201, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Add");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(570, 201, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JTextArea txtesfod = new JTextArea();
		txtesfod.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtesfod.setBounds(128, 224, 45, 13);
		contentPane.add(txtesfod);
		
		JTextArea txtesfoi = new JTextArea();
		txtesfoi.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtesfoi.setBounds(128, 247, 45, 13);
		contentPane.add(txtesfoi);
		
		JLabel lblNewLabel_10 = new JLabel("OD:");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(100, 224, 45, 13);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("OI:");
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_10_1.setBounds(100, 247, 45, 13);
		contentPane.add(lblNewLabel_10_1);
		
		JTextArea txtcilod = new JTextArea();
		txtcilod.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtcilod.setBounds(214, 224, 45, 13);
		contentPane.add(txtcilod);
		
		JTextArea txtciloi = new JTextArea();
		txtciloi.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtciloi.setBounds(214, 247, 45, 13);
		contentPane.add(txtciloi);
		
		JTextArea txtejeod = new JTextArea();
		txtejeod.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtejeod.setBounds(294, 224, 45, 13);
		contentPane.add(txtejeod);
		
		JTextArea txtejeoi = new JTextArea();
		txtejeoi.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtejeoi.setBounds(294, 247, 45, 13);
		contentPane.add(txtejeoi);
		
		JTextArea txtdnpod = new JTextArea();
		txtdnpod.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtdnpod.setBounds(372, 224, 45, 13);
		contentPane.add(txtdnpod);
		
		JTextArea txtdnpoi = new JTextArea();
		txtdnpoi.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtdnpoi.setBounds(372, 247, 45, 13);
		contentPane.add(txtdnpoi);
		
		JTextArea txtdip = new JTextArea();
		txtdip.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtdip.setBounds(462, 224, 45, 36);
		contentPane.add(txtdip);
		
		JTextArea txtaddod = new JTextArea();
		txtaddod.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtaddod.setBounds(560, 224, 45, 13);
		contentPane.add(txtaddod);
		
		JTextArea txtaddoi = new JTextArea();
		txtaddoi.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtaddoi.setBounds(560, 247, 45, 13);
		contentPane.add(txtaddoi);
		
		JLabel lblNewLabel_11 = new JLabel("Oftalmología");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_11.setBounds(78, 375, 107, 13);
		contentPane.add(lblNewLabel_11);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(100, 298, 509, 56);
		contentPane.add(scrollPane_2);
		
		JTextArea txtobs = new JTextArea();
		scrollPane_2.setViewportView(txtobs);
		txtobs.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JLabel lblNewLabel_12 = new JLabel("Observaciones");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(78, 270, 128, 13);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Diagnóstico");
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(84, 398, 89, 13);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Tratamiento");
		lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(425, 398, 107, 13);
		contentPane.add(lblNewLabel_14);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 421, 312, 121);
		contentPane.add(scrollPane);
		
		JTextArea txtdiagn = new JTextArea();
		scrollPane.setViewportView(txtdiagn);
		txtdiagn.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(422, 421, 312, 121);
		contentPane.add(scrollPane_1);
		
		JTextArea txttrat = new JTextArea();
		scrollPane_1.setViewportView(txttrat);
		txttrat.setFont(new Font("Calibri", Font.PLAIN, 12));
	}

}
