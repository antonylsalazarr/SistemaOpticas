package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Stock extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock frame = new Stock();
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
	public Stock() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Stock");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(415, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		JButton btnNuevaVenta = new JButton("NUEVA VENTA");
		btnNuevaVenta.setBounds(0, 0, 124, 50);
		contentPane_1.add(btnNuevaVenta);
		
		JButton btnVentaDirecta = new JButton("VENTA DIRECTA");
		btnVentaDirecta.setBounds(123, 0, 124, 50);
		contentPane_1.add(btnVentaDirecta);
		
		JButton btnConsulta = new JButton("CONSULTA");
		btnConsulta.setBounds(247, 0, 124, 50);
		contentPane_1.add(btnConsulta);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBounds(0, 0, 836, 563);
		contentPane.add(contentPane_2);
		
		JButton btnMonturas = new JButton("MONTURAS");
		btnMonturas.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnMonturas.setBounds(0, 0, 124, 55);
		contentPane_2.add(btnMonturas);
		
		JButton btnLunas = new JButton("LUNAS");
		btnLunas.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnLunas.setBounds(123, 0, 124, 55);
		contentPane_2.add(btnLunas);
	}
}
