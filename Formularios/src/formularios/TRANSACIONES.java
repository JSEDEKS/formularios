package formularios;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TRANSACIONES extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public TRANSACIONES() {
		setSize(1429, 781);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0, 0));
		panel.setBounds(0, 0, 1429, 781);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 1429, 112);
		panel.add(panel_1);
		
		JLabel lblTransacciones = new JLabel("Transacciones");
		lblTransacciones.setVerticalAlignment(SwingConstants.TOP);
		lblTransacciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransacciones.setForeground(Color.WHITE);
		lblTransacciones.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_1.add(lblTransacciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 423, 698, 347);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Monto", "Descripcion", "Concepto", "Origen", "Destinatario"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(0, 325, 1429, 87);
		panel.add(panel_1_1);
		
		JLabel lblIngresos = new JLabel("Ingresos");
		lblIngresos.setVerticalAlignment(SwingConstants.TOP);
		lblIngresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngresos.setForeground(Color.WHITE);
		lblIngresos.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblIngresos.setBounds(10, 14, 490, 73);
		panel_1_1.add(lblIngresos);
		
		JLabel lblCostos = new JLabel("Costos");
		lblCostos.setVerticalAlignment(SwingConstants.TOP);
		lblCostos.setHorizontalAlignment(SwingConstants.LEFT);
		lblCostos.setForeground(Color.WHITE);
		lblCostos.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblCostos.setBounds(719, 14, 262, 73);
		panel_1_1.add(lblCostos);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(72, 161, 184, 153);
		panel.add(calendar);
		
		JLabel lblNewLabel_1 = new JLabel("Desde:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(117, 123, 87, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hasta:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(509, 123, 87, 25);
		panel.add(lblNewLabel_1_1);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(459, 161, 184, 153);
		panel.add(calendar_1);
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(729, 208, 192, 53);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(718, 423, 698, 347);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Monto", "Descripcion", "Concepto", "Origen", "Destinatario"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}
}
