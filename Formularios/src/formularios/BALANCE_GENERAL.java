package formularios;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BALANCE_GENERAL extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public BALANCE_GENERAL() {
		setSize(1429, 781);
		setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0, 0));
		panel.setBounds(0, 0, 1429, 781);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(15);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 1429, 112);
		panel.add(panel_1);
		
		JLabel lblBalanceGeneral = new JLabel("Balance General");
		lblBalanceGeneral.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalanceGeneral.setVerticalAlignment(SwingConstants.TOP);
		lblBalanceGeneral.setForeground(Color.WHITE);
		lblBalanceGeneral.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_1.add(lblBalanceGeneral);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 423, 698, 347);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Monto", "Prestamista", "Fechas"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(718, 423, 698, 347);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activos", "Pasivos", "Capital"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(0, 325, 1429, 87);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblDeudasPorPagar = new JLabel("Deudas por pagar");
		lblDeudasPorPagar.setVerticalAlignment(SwingConstants.TOP);
		lblDeudasPorPagar.setHorizontalAlignment(SwingConstants.LEFT);
		lblDeudasPorPagar.setForeground(Color.WHITE);
		lblDeudasPorPagar.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblDeudasPorPagar.setBounds(10, 14, 490, 73);
		panel_1_1.add(lblDeudasPorPagar);
		
		JLabel lblResumen = new JLabel("Resumen");
		lblResumen.setVerticalAlignment(SwingConstants.TOP);
		lblResumen.setHorizontalAlignment(SwingConstants.LEFT);
		lblResumen.setForeground(Color.WHITE);
		lblResumen.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblResumen.setBounds(719, 14, 262, 73);
		panel_1_1.add(lblResumen);
		
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
	}
}
