package formularios;

import java.awt.Color;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import com.toedter.calendar.JCalendar;
import javax.swing.JButton;



public class INICIO_GERENTE extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public INICIO_GERENTE() {
		setSize(1429, 781);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1429, 781);
		add(panel);
		panel.setLayout(null);
		
	
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(250, 81, 184, 153);
		panel.add(calendar_1);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(31, 81, 184, 153);
		panel.add(calendar);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 204));
		panel_1.setBounds(606, 21, 813, 162);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setBackground(Color.GREEN);
		panel_2_1_1_2.setBounds(72, 11, 156, 88);
		panel_1.add(panel_2_1_1_2);
		panel_2_1_1_2.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 11, 136, 66);
		panel_2_1_1_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2_1_1_2_1 = new JPanel();
		panel_2_1_1_2_1.setLayout(null);
		panel_2_1_1_2_1.setBackground(Color.RED);
		panel_2_1_1_2_1.setBounds(337, 11, 156, 88);
		panel_1.add(panel_2_1_1_2_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 11, 136, 66);
		panel_2_1_1_2_1.add(textField_1);
		
		JPanel panel_2_1_1_2_2 = new JPanel();
		panel_2_1_1_2_2.setLayout(null);
		panel_2_1_1_2_2.setBackground(Color.DARK_GRAY);
		panel_2_1_1_2_2.setBounds(604, 11, 156, 88);
		panel_1.add(panel_2_1_1_2_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 11, 136, 66);
		panel_2_1_1_2_2.add(textField_2);
		
		JLabel lblIngresosGenerados = new JLabel("Ingresos Generados");
		lblIngresosGenerados.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngresosGenerados.setBounds(48, 116, 213, 46);
		panel_1.add(lblIngresosGenerados);
		
		JLabel lblIngresosGenerados_1 = new JLabel("Ingresos Generados");
		lblIngresosGenerados_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngresosGenerados_1.setBounds(309, 116, 213, 46);
		panel_1.add(lblIngresosGenerados_1);
		
		JLabel lblCantidadDeVentas = new JLabel("Cantidad De Ventas");
		lblCantidadDeVentas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCantidadDeVentas.setBounds(578, 116, 213, 46);
		panel_1.add(lblCantidadDeVentas);
		
		JLabel lblNewLabel = new JLabel("Desde:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(31, 11, 155, 46);
		panel.add(lblNewLabel);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHasta.setBounds(250, 11, 155, 46);
		panel.add(lblHasta);
		
		JLabel lblAccionesRecientes = new JLabel("Acciones Recientes");
		lblAccionesRecientes.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAccionesRecientes.setBounds(874, 207, 320, 46);
		panel.add(lblAccionesRecientes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(606, 265, 813, 479);
		panel.add(scrollPane);
		
		JTable table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(Color.GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		
		JPanel GRAFICA = new JPanel();
		GRAFICA.setBounds(10, 265, 586, 479);
		panel.add(GRAFICA);
		agregarGrafico(GRAFICA);
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(449, 168, 147, 66);
		panel.add(btnNewButton);
	

	}
	
	
	private void agregarGrafico(JPanel panelGrafica) {
	    // Crear el dataset con los datos (ventas de productos)
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	    // Agregar los valores de ventas para cada día de la semana (escala de 1 a 10)
	    dataset.addValue(7, "Ventas", "Lunes");
	    dataset.addValue(5, "Ventas", "Martes");
	    dataset.addValue(9, "Ventas", "Miércoles");
	    dataset.addValue(4, "Ventas", "Jueves");
	    dataset.addValue(8, "Ventas", "Viernes");
	    dataset.addValue(6, "Ventas", "Sábado");
	    dataset.addValue(3, "Ventas", "Domingo");

	    // Crear el gráfico de barras
	    JFreeChart chart = ChartFactory.createBarChart(
	            "Ventas de Productos en la Semana", // Título del gráfico
	            "Días de la Semana",               // Etiqueta del eje X (días)
	            "Cantidad de Productos Vendidos",  // Etiqueta del eje Y (ventas)
	            dataset                            // Dataset
	    );

	    // Ajustar el gráfico de acuerdo con el estilo deseado
	    chart.setBackgroundPaint(new Color(0, 153, 204));

	    // Crear el panel del gráfico y añadirlo al panel principal
	    ChartPanel chartPanel = new ChartPanel(chart);
	    chartPanel.setPreferredSize(new java.awt.Dimension(454, 400));
	    panelGrafica.setLayout(new java.awt.BorderLayout());
	    panelGrafica.add(chartPanel, java.awt.BorderLayout.CENTER);
	    panelGrafica.validate();
	}

}
