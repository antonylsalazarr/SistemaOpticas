package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ventas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
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
	public Ventas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Ventas");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevaVenta = new JButton(" NUEVA VENTA");
		btnNuevaVenta.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnNuevaVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NuevaVenta newframe = new NuevaVenta();
				newframe.setVisible(true);
				
			}
		});
		btnNuevaVenta.setBounds(0, 0, 124, 55);
		contentPane.add(btnNuevaVenta);
		
		JButton btnVentaDirecta = new JButton("VENTA DIRECTA");
		btnVentaDirecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentaDirecta newframe = new VentaDirecta();
				newframe.setVisible(true);
				
			}
		});
		btnVentaDirecta.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnVentaDirecta.setBounds(123, 0, 124, 55);
		contentPane.add(btnVentaDirecta);
		
		JButton btnConsulta = new JButton("CONSULTA");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Consulta newframe = new Consulta();
				newframe.setVisible(true);
				
			}
		});
		btnConsulta.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnConsulta.setBounds(247, 0, 124, 55);
		contentPane.add(btnConsulta);
	}
}
