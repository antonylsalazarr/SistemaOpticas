package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Color;

public class Lunas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablunas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lunas frame = new Lunas();
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
	public Lunas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Stock-Lunas");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lunas");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(357, 10, 94, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnSalida = new JButton("EXIT");
		btnSalida.setBounds(771, 0, 55, 55);
		contentPane.add(btnSalida);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(30, 56, 77, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Material:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(30, 96, 77, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tratamiento:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(30, 134, 77, 13);
		contentPane.add(lblNewLabel_3);
		
		JComboBox cbotratlunas = new JComboBox();
		cbotratlunas.setBackground(new Color(255, 255, 255));
		cbotratlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		cbotratlunas.setModel(new DefaultComboBoxModel(new String[] {"ANTIRREFLEX", "BLUE DEFENSE", "FOTOMATIC AR", "BLUE D. FOTOMATIC", "TRANSITION", "SAPHIR"}));
		cbotratlunas.setBounds(105, 130, 129, 21);
		contentPane.add(cbotratlunas);
		
		JComboBox cbomatlunas = new JComboBox();
		cbomatlunas.setBackground(new Color(255, 255, 255));
		cbomatlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		cbomatlunas.setModel(new DefaultComboBoxModel(new String[] {"RESINA", "POLICARBONATO", "RESINA AI"}));
		cbomatlunas.setBounds(105, 92, 129, 21);
		contentPane.add(cbomatlunas);
		
		JComboBox cbotiplunas = new JComboBox();
		cbotiplunas.setBackground(new Color(255, 255, 255));
		cbotiplunas.setFont(new Font("Arial", Font.PLAIN, 12));
		cbotiplunas.setModel(new DefaultComboBoxModel(new String[] {"MONOFOCAL", "BIFOCAL", "MULTIFOCAL"}));
		cbotiplunas.setBounds(105, 52, 129, 21);
		contentPane.add(cbotiplunas);
		
		tablunas = new JTable();
		tablunas.setBounds(244, 55, 526, 487);
		contentPane.add(tablunas);
	}
}
