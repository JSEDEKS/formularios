package formularios;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;


public class GESTOR_INVENTARIO extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_nombre;
	private JTable table;
	private JTextField textField_descripcion;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public GESTOR_INVENTARIO() {
		setSize(1429, 781);
		setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0, 0));
		panel.setBounds(0, 0, 1429, 781);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(21, 26, 893, 740);
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setColumns(10);
		textField.setBounds(174, 30, 559, 45);
		panel_1.add(textField);
		
		
		JButton btnCaja_1 = new JButton("Buscar");
		btnCaja_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnCaja_1.setBounds(743, 30, 135, 45);
		panel_1.add(btnCaja_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 870, 629);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setForeground(Color.WHITE);
		lblBuscarPor.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBuscarPor.setBackground(new Color(0, 153, 204));
		lblBuscarPor.setBounds(10, 18, 154, 71);
		panel_1.add(lblBuscarPor);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(933, 26, 474, 740);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel = new JLabel("AGREGAR  ARTICULO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 0, 556, 71);
		panel_1_1.add(lblNewLabel);
		
		textField_nombre = new JTextField();
		textField_nombre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_nombre.setColumns(10);
		textField_nombre.setBounds(132, 82, 320, 37);
		panel_1_1.add(textField_nombre);
		
		JButton btn_agregar = new JButton("AGREGAR");
		btn_agregar.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_agregar.setBounds(45, 684, 181, 45);
		panel_1_1.add(btn_agregar);
		
		JButton btn_editar = new JButton("EDITAR");
		btn_editar.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_editar.setBounds(277, 684, 175, 45);
		panel_1_1.add(btn_editar);
		
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setForeground(Color.WHITE);
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_nombre.setBackground(Color.WHITE);
		lbl_nombre.setBounds(10, 82, 133, 45);
		panel_1_1.add(lbl_nombre);
		
		JLabel lbl_marca = new JLabel("Marca:");
		lbl_marca.setForeground(Color.WHITE);
		lbl_marca.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_marca.setBackground(Color.WHITE);
		lbl_marca.setBounds(10, 198, 124, 45);
		panel_1_1.add(lbl_marca);
		
		JLabel lbl_precio = new JLabel("Precio:");
		lbl_precio.setForeground(Color.WHITE);
		lbl_precio.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_precio.setBackground(Color.WHITE);
		lbl_precio.setBounds(9, 611, 104, 45);
		panel_1_1.add(lbl_precio);
		
		JLabel lbl_categoria = new JLabel("Categoria:");
		lbl_categoria.setForeground(Color.WHITE);
		lbl_categoria.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_categoria.setBackground(Color.WHITE);
		lbl_categoria.setBounds(10, 254, 138, 45);
		panel_1_1.add(lbl_categoria);
		
		JLabel lbl_descripcion = new JLabel("Descripcion:");
		lbl_descripcion.setForeground(Color.WHITE);
		lbl_descripcion.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_descripcion.setBackground(Color.WHITE);
		lbl_descripcion.setBounds(10, 142, 156, 45);
		panel_1_1.add(lbl_descripcion);
		
		JLabel lbl_suplidor = new JLabel("Suplidor:");
		lbl_suplidor.setForeground(Color.WHITE);
		lbl_suplidor.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_suplidor.setBackground(Color.WHITE);
		lbl_suplidor.setBounds(10, 540, 133, 45);
		panel_1_1.add(lbl_suplidor);
		
		JLabel lbl_original = new JLabel("Originalidad:");
		lbl_original.setForeground(Color.WHITE);
		lbl_original.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_original.setBackground(Color.WHITE);
		lbl_original.setBounds(10, 394, 175, 45);
		panel_1_1.add(lbl_original);
		
		JLabel lbl_talla = new JLabel("Talla:");
		lbl_talla.setForeground(Color.WHITE);
		lbl_talla.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_talla.setBackground(Color.WHITE);
		lbl_talla.setBounds(10, 328, 79, 45);
		panel_1_1.add(lbl_talla);
		
		JLabel lbl_Material = new JLabel("Material:");
		lbl_Material.setForeground(Color.WHITE);
		lbl_Material.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_Material.setBackground(Color.WHITE);
		lbl_Material.setBounds(214, 328, 124, 45);
		panel_1_1.add(lbl_Material);
		
		JLabel lbl_Cantidad = new JLabel("Cantidad:");
		lbl_Cantidad.setForeground(Color.WHITE);
		lbl_Cantidad.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_Cantidad.setBackground(Color.WHITE);
		lbl_Cantidad.setBounds(213, 611, 124, 45);
		panel_1_1.add(lbl_Cantidad);
		
		JLabel lbl_tipo = new JLabel("Tipo:");
		lbl_tipo.setForeground(Color.WHITE);
		lbl_tipo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_tipo.setBackground(Color.WHITE);
		lbl_tipo.setBounds(10, 468, 79, 45);
		panel_1_1.add(lbl_tipo);
		
		textField_descripcion = new JTextField();
		textField_descripcion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_descripcion.setColumns(10);
		textField_descripcion.setBounds(174, 137, 278, 37);
		panel_1_1.add(textField_descripcion);
		
		JSpinner spinner_precio = new JSpinner();
		spinner_precio.setBounds(99, 611, 108, 37);
		panel_1_1.add(spinner_precio);
		
		JSpinner spinner_cantidad = new JSpinner();
		spinner_cantidad.setBounds(347, 611, 116, 37);
		panel_1_1.add(spinner_cantidad);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(99, 202, 278, 37);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(148, 254, 278, 37);
		panel_1_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(82, 328, 124, 37);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(328, 328, 124, 37);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(181, 394, 271, 37);
		panel_1_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(76, 468, 278, 37);
		panel_1_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(132, 540, 278, 37);
		panel_1_1.add(textField_7);
	}
}
