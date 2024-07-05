package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.DropMode;

public class NuevaVenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmontura;
	private JTextField txtcantacces;
	private JTextField txtpreciomont;
	private JTextField txtcantlunas;
	private JTextField txtpreclunas;
	private JTextField txtprecacces;
	private JComboBox cbotlunas;
	private JComboBox cbomatlunas;
	private JComboBox cbotratlunas;
	private JTextField txtpx;
	private JTextArea txtreporte;
	private JComboBox cboaccesorios;
	
	//Variables acumulables
	//Precios de variables
	double  plunas = 0.0, pacces = 0.0, pliquido = 0.0, psujetador = 0.0, ptope = 0.0, ppañito = 0.0;
	//Cantidades
	int		cantlunas = 0, cantacces = 0, cantliquido = 0, cantsujetador = 0, canttope = 0, cantpañito = 0;
	//Acumuladores
	int		alunas = 0, aacces = 0, aliquido = 0, asujetador = 0, atope = 0, apañito = 0;
	
	String LeerNombrePaciente() {
		return txtpx.getText();
	}
	
	String LeerMarcaMontura() {
		return txtmontura.getText();
	}
	
	double LeerCostoMontura() {
		return Double.parseDouble(txtpreciomont.getText());
	}
	
	String SeleccionTipoLuna() {
		return cbotlunas.getSelectedItem().toString();
	}
	
	String SeleccionMaterialLunas() {
		return cbomatlunas.getSelectedItem().toString();
		
	}
	
	String SeleccionarTratamientoLunas() {
		return cbotratlunas.getSelectedItem().toString();
	}
	
	double LeerPrecioLunas() {
		double preciolun =  Double.parseDouble(txtpreclunas.getText());
		double cantidadlun = Double.parseDouble(txtcantlunas.getText());
		return preciolun*cantidadlun;
	}
	
	String LeerAccesorios() {
		return cboaccesorios.getSelectedItem().toString();
	}
	
	double LeerPrecioAccesorios() {
		return Double.parseDouble(txtprecacces.getText());
	}
	
	int LeerCantidadAccesorios() {
		return Integer.parseInt(txtcantacces.getText());
	}
	
	void ObtenerConteo_Acumulado_Accesorios() {
		double 	importe = LeerPrecioAccesorios();
		String accesorio = LeerAccesorios();
		
		if (accesorio == "LÍQUIDO LIMPIADOR") {
			pliquido+=importe; cantliquido+=LeerCantidadAccesorios(); aliquido++;
			}
		else if (accesorio == "SUJETADOR") {
			psujetador+=importe; cantsujetador+=LeerCantidadAccesorios(); asujetador++;
			}
		else if (accesorio == "TOPES") {
			ptope+=importe; canttope+=LeerCantidadAccesorios(); atope++;
			}
		else {
			ppañito+=importe; cantpañito+=LeerCantidadAccesorios(); apañito++;
			}	
		}
	
	double CalcularCostoAccesorios() {
		double accesorios = (pliquido*cantliquido)/aliquido+(psujetador*cantsujetador)/asujetador+(ptope*canttope)/atope+(ppañito*cantpañito)/apañito;
		return accesorios;
	}
	
	double CalcularCostoTotal() {
		return LeerCostoMontura()+LeerPrecioLunas()+CalcularCostoAccesorios();
		
	}
	
	void Reporte() {
		txtreporte.setText("");
		txtreporte.append("\n");
		txtreporte.append("Paciente: "+LeerNombrePaciente()+"\n");
		txtreporte.append("---------------------------------------------------------------------------------------------------------------------------------------\n");
		txtreporte.append("Montura: "+LeerMarcaMontura()+"							"+"s/"+LeerCostoMontura()+"\n");
		txtreporte.append("Lunas: "+SeleccionTipoLuna()+"     |     "+SeleccionMaterialLunas()+"     |     "+SeleccionarTratamientoLunas()+"					"+"s/"+LeerPrecioLunas()+"\n");
		ObtenerConteo_Acumulado_Accesorios();
		txtreporte.append("Líquidos:			"+cantliquido+"					"+"s/"+pliquido+"\n");
		txtreporte.append("Sujetadores:			"+cantsujetador+"					"+"s/"+psujetador+"\n");
		txtreporte.append("Topes:			"+canttope+"					"+"s/"+ptope+"\n");
		txtreporte.append("Pañitos:			"+cantpañito+"					"+"s/"+ppañito+"\n");
		txtreporte.append("---------------------------------------------------------------------------------------------------------------------------------------\n");
		txtreporte.append("Total:								s/"+CalcularCostoTotal());
		
	}
	
	void Limpiar() {
		txtpx.setText("");
		txtmontura.setText("");
		txtreporte.setText("");
		txtpreciomont.setText("");
		txtcantlunas.setText("");
		txtpreclunas.setText("");
		txtcantacces.setText("");
		txtprecacces.setText("");
		txtpx.requestFocus();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaVenta frame = new NuevaVenta();
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
	public NuevaVenta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Ventas - Nueva Venta");
		


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Montura:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(36, 112, 65, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lunas:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(36, 151, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txtmontura = new JTextField();
		txtmontura.setFont(new Font("Arial", Font.PLAIN, 12));
		txtmontura.setBounds(111, 108, 454, 19);
		contentPane.add(txtmontura);
		txtmontura.setColumns(10);
		
		cbotratlunas = new JComboBox();
		cbotratlunas.setBackground(new Color(255, 255, 255));
		cbotratlunas.setModel(new DefaultComboBoxModel(new String[] {"ANTIRREFLEX", "BLUE DEFENSE", "FOTOMATIC AR", "BLUE D. FOTOMATIC", "TRANSITION", "SAPHIR"}));
		cbotratlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		cbotratlunas.setBounds(414, 174, 151, 21);
		contentPane.add(cbotratlunas);
		
		JLabel lbltip = new JLabel("Tipo:");
		lbltip.setFont(new Font("Arial", Font.BOLD, 12));
		lbltip.setBounds(111, 151, 45, 13);
		contentPane.add(lbltip);
		
		JLabel lblmat = new JLabel("Material:");
		lblmat.setFont(new Font("Arial", Font.BOLD, 12));
		lblmat.setBounds(258, 151, 76, 13);
		contentPane.add(lblmat);
		
		JLabel lbltrat = new JLabel("Tratamientos:");
		lbltrat.setFont(new Font("Arial", Font.BOLD, 12));
		lbltrat.setBounds(414, 151, 89, 13);
		contentPane.add(lbltrat);
		
		cbotlunas = new JComboBox();
		cbotlunas.setBackground(new Color(255, 255, 255));
		cbotlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		cbotlunas.setModel(new DefaultComboBoxModel(new String[] {"MONOFOCAL", "BIFOCAL", "MULTIFOCAL"}));
		cbotlunas.setBounds(111, 174, 106, 21);
		contentPane.add(cbotlunas);
		
		cbomatlunas = new JComboBox();
		cbomatlunas.setBackground(new Color(255, 255, 255));
		cbomatlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		cbomatlunas.setModel(new DefaultComboBoxModel(new String[] {"RESINA", "POLICARBONATO", "RESINA AI"}));
		cbomatlunas.setBounds(258, 174, 113, 21);
		contentPane.add(cbomatlunas);
		
		JLabel lbldescrip = new JLabel("Descripción");
		lbldescrip.setFont(new Font("Arial", Font.BOLD, 14));
		lbldescrip.setBounds(345, 283, 94, 19);
		contentPane.add(lbldescrip);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnprocesar.setBounds(710, 521, 86, 21);
		contentPane.add(btnprocesar);
		
		JLabel lblaccesorios = new JLabel("Accesorios:");
		lblaccesorios.setFont(new Font("Arial", Font.PLAIN, 12));
		lblaccesorios.setBounds(36, 247, 88, 13);
		contentPane.add(lblaccesorios);
		
		cboaccesorios = new JComboBox();
		cboaccesorios.setBackground(new Color(255, 255, 255));
		cboaccesorios.setModel(new DefaultComboBoxModel(new String[] {"LÍQUIDO LIMPIADOR", "SUJETADOR", "TOPES", "PAÑITO"}));
		cboaccesorios.setFont(new Font("Arial", Font.PLAIN, 12));
		cboaccesorios.setBounds(111, 243, 136, 21);
		contentPane.add(cboaccesorios);
		
		JLabel lblcantacces = new JLabel("Cantidad:");
		lblcantacces.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcantacces.setBounds(258, 247, 76, 13);
		contentPane.add(lblcantacces);
		
		txtcantacces = new JTextField();
		txtcantacces.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcantacces.setBounds(326, 244, 96, 19);
		contentPane.add(txtcantacces);
		txtcantacces.setColumns(10);
		
		JButton btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Limpiar();
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnlimpiar.setBounds(599, 521, 96, 21);
		contentPane.add(btnlimpiar);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				
				Reporte();
			}
		});
		btnagregar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnagregar.setBounds(710, 283, 86, 21);
		contentPane.add(btnagregar);
		
		JLabel lblprecmont = new JLabel("Precio:");
		lblprecmont.setFont(new Font("Arial", Font.PLAIN, 12));
		lblprecmont.setBounds(650, 112, 45, 13);
		contentPane.add(lblprecmont);
		
		JLabel lblpreclunas = new JLabel("Precio:");
		lblpreclunas.setFont(new Font("Arial", Font.PLAIN, 12));
		lblpreclunas.setBounds(650, 178, 45, 13);
		contentPane.add(lblpreclunas);
		
		JLabel lblprecacces = new JLabel("Precio:");
		lblprecacces.setFont(new Font("Arial", Font.PLAIN, 12));
		lblprecacces.setBounds(650, 247, 45, 13);
		contentPane.add(lblprecacces);
		
		JLabel lblcantlunas = new JLabel("Cantidad:");
		lblcantlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcantlunas.setBounds(650, 151, 58, 13);
		contentPane.add(lblcantlunas);
		
		txtpreciomont = new JTextField();
		txtpreciomont.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpreciomont.setBounds(720, 108, 76, 19);
		contentPane.add(txtpreciomont);
		txtpreciomont.setColumns(10);
		
		txtcantlunas = new JTextField();
		txtcantlunas.setFont(new Font("Arial", Font.PLAIN, 12));
		txtcantlunas.setColumns(10);
		txtcantlunas.setBounds(720, 147, 76, 19);
		contentPane.add(txtcantlunas);
		
		txtpreclunas = new JTextField();
		txtpreclunas.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpreclunas.setColumns(10);
		txtpreclunas.setBounds(720, 174, 76, 19);
		contentPane.add(txtpreclunas);
		
		txtprecacces = new JTextField();
		txtprecacces.setFont(new Font("Arial", Font.PLAIN, 12));
		txtprecacces.setColumns(10);
		txtprecacces.setBounds(720, 243, 76, 19);
		contentPane.add(txtprecacces);
		
		JLabel lblNewLabel_2 = new JLabel("Nueva Venta");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(312, 6, 158, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Paciente:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(36, 66, 65, 13);
		contentPane.add(lblNewLabel_3);
		
		txtpx = new JTextField();
		txtpx.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpx.setBounds(111, 63, 454, 19);
		contentPane.add(txtpx);
		txtpx.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 330, 761, 168);
		contentPane.add(scrollPane);
		
		txtreporte = new JTextArea();
		txtreporte.setEditable(false);
		scrollPane.setViewportView(txtreporte);
		
	}
}
