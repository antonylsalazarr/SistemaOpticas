package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentaDirecta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcantacces;
	private JTextField txtcantcomp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaDirecta frame = new VentaDirecta();
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
	public VentaDirecta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Ventas - Venta Directa");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Venta Directa");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(334, 10, 149, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblaccesorios = new JLabel("Accesorios:");
		lblaccesorios.setFont(new Font("Arial", Font.PLAIN, 12));
		lblaccesorios.setBounds(36, 84, 88, 13);
		contentPane.add(lblaccesorios);
		
		JComboBox cboaccesorios = new JComboBox();
		cboaccesorios.setModel(new DefaultComboBoxModel(new String[] {"LÍQUIDO LIMPIADOR", "SUJETADOR", "TOPES", "PAÑITO"}));
		cboaccesorios.setFont(new Font("Arial", Font.PLAIN, 12));
		cboaccesorios.setBackground(Color.WHITE);
		cboaccesorios.setBounds(128, 80, 136, 21);
		contentPane.add(cboaccesorios);
		
		JLabel lblcantacces = new JLabel("Cantidad:");
		lblcantacces.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcantacces.setBounds(366, 84, 76, 13);
		contentPane.add(lblcantacces);
		
		txtcantacces = new JTextField();
		txtcantacces.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcantacces.setColumns(10);
		txtcantacces.setBounds(452, 80, 96, 19);
		contentPane.add(txtcantacces);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnagregar.setBounds(710, 283, 86, 21);
		contentPane.add(btnagregar);
		
		JLabel lbldescrip = new JLabel("Descripción");
		lbldescrip.setFont(new Font("Arial", Font.BOLD, 14));
		lbldescrip.setBounds(366, 283, 94, 19);
		contentPane.add(lbldescrip);
		
		JButton btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnlimpiar.setBounds(700, 521, 96, 21);
		contentPane.add(btnlimpiar);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnprocesar.setBounds(604, 521, 86, 21);
		contentPane.add(btnprocesar);
		
		JLabel lblComponentes = new JLabel("Componentes:");
		lblComponentes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblComponentes.setBounds(36, 139, 88, 13);
		contentPane.add(lblComponentes);
		
		JComboBox cbocomp = new JComboBox();
		cbocomp.setModel(new DefaultComboBoxModel(new String[] {"TORNILLOS", "PLAQUETAS"}));
		cbocomp.setFont(new Font("Arial", Font.PLAIN, 12));
		cbocomp.setBackground(Color.WHITE);
		cbocomp.setBounds(128, 135, 136, 21);
		contentPane.add(cbocomp);
		
		JLabel lblcantacces_1 = new JLabel("Cantidad:");
		lblcantacces_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcantacces_1.setBounds(366, 139, 76, 13);
		contentPane.add(lblcantacces_1);
		
		txtcantcomp = new JTextField();
		txtcantcomp.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcantcomp.setColumns(10);
		txtcantcomp.setBounds(452, 135, 96, 19);
		contentPane.add(txtcantcomp);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 316, 763, 195);
		contentPane.add(scrollPane);
		
		JList listventadir = new JList();
		listventadir.setFont(new Font("Calibri", Font.PLAIN, 12));
		scrollPane.setViewportView(listventadir);
	}
}
