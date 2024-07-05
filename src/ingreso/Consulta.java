package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JScrollPane;

public class Consulta extends JFrame {
	
	String LecturaTipoConsulta() {
		return cbotconsulta.getSelectedItem().toString();
	}
	
	String LecturaNombrePaciente() {
		return txtpx.getText();
	}
	
	int LecturaEdadPaciente() {
		return Integer.parseInt(txtedad.getText());
	}
	
	double CostoConsulta() {
		String tconsulta = LecturaTipoConsulta();
		double costo = 0.0;
		
			if (tconsulta == "NORMAL")
				costo = 70.00;
			if (tconsulta == "CON CERTIFICADO")
				costo = 150.00;
			if (tconsulta == "POR CONVENIO")
				costo = 140.00;
			return costo;
	}
	
	void MostrarCostoConsulta() {
		double costo = CostoConsulta();
		txtcostoconsulta.setText("");
		txtcostoconsulta.append("s/"+costo);
		
	}
	
	void ImprimirRecibo() {
		double pago = CostoConsulta();
		String paciente = LecturaNombrePaciente();
		
		txtrecibo.setText("");
		txtrecibo.append("\n");
		txtrecibo.append("Paciente: "+paciente+"\n");
		txtrecibo.append("Consulta oftalmológica:				"+pago+"\n");
		
	}
	
	void Borrar() {
		txtpx.setText("");
		txtedad.setText("");
		txtcostoconsulta.setText("");
		txtrecibo.setText("");
		cbotconsulta.requestFocus();
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtpx;
	private JTextField txtedad;
	private JTextArea txtcostoconsulta;
	private JTextArea txtrecibo;
	private JComboBox cbotconsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Ventas - Consulta");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(334, 10, 143, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Paciente:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(121, 143, 61, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de consulta:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(77, 106, 105, 13);
		contentPane.add(lblNewLabel_2);
		
		cbotconsulta = new JComboBox();
		cbotconsulta.setBackground(new Color(255, 255, 255));
		cbotconsulta.setFont(new Font("Arial", Font.PLAIN, 12));
		cbotconsulta.setModel(new DefaultComboBoxModel(new String[] {"NORMAL", "CON CERTIFICADO", "POR CONVENIO"}));
		cbotconsulta.setBounds(185, 102, 153, 21);
		contentPane.add(cbotconsulta);
		
		txtpx = new JTextField();
		txtpx.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpx.setBounds(185, 139, 271, 19);
		contentPane.add(txtpx);
		txtpx.setColumns(10);
		
		txtcostoconsulta = new JTextArea();
		txtcostoconsulta.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtcostoconsulta.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtcostoconsulta.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtcostoconsulta.setEditable(false);
		txtcostoconsulta.setFont(new Font("Arial", Font.PLAIN, 14));
		txtcostoconsulta.setBounds(653, 102, 89, 19);
		contentPane.add(txtcostoconsulta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 332, 525, 146);
		contentPane.add(scrollPane);
		
		txtrecibo = new JTextArea();
		scrollPane.setViewportView(txtrecibo);
		txtrecibo.setEditable(false);
		txtrecibo.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("Edad:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(142, 183, 33, 13);
		contentPane.add(lblNewLabel_4);
		
		txtedad = new JTextField();
		txtedad.setFont(new Font("Arial", Font.PLAIN, 12));
		txtedad.setBounds(185, 179, 96, 19);
		contentPane.add(txtedad);
		txtedad.setColumns(10);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImprimirRecibo();
			}
		});
		btnprocesar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnprocesar.setBounds(641, 334, 85, 21);
		contentPane.add(btnprocesar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		btncancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btncancelar.setBounds(641, 388, 85, 21);
		contentPane.add(btncancelar);
		
		JButton btnimprimir = new JButton("Imprimir");
		btnimprimir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnimprimir.setBounds(641, 449, 85, 21);
		contentPane.add(btnimprimir);
		
		JButton btncosto = new JButton("Costo:");
		btncosto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCostoConsulta();
			}
		});
		btncosto.setFont(new Font("Arial", Font.PLAIN, 12));
		btncosto.setBounds(575, 101, 68, 22);
		contentPane.add(btncosto);
	}
}
