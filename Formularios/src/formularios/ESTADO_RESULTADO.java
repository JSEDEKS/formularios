package formularios;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import com.toedter.calendar.JCalendar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ESTADO_RESULTADO extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ESTADO_RESULTADO() {
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
		
		JLabel lblNewLabel = new JLabel("Estado De Resultado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desde:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 123, 87, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hasta:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(218, 123, 87, 25);
		panel.add(lblNewLabel_1_1);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 159, 184, 153);
		panel.add(calendar);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(218, 159, 184, 153);
		panel.add(calendar_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 334, 1409, 436);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fecha", "Ingresos", "Costos", "Utilidad Operativa"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(446, 259, 192, 53);
		panel.add(btnNewButton);
	}
}
