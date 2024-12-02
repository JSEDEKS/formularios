package formularios;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Caja extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	protected Caja() {
		setTitle("CAJA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\pngegg (2).png"));
		setResizable(false);
		setSize(1493, 812);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1640, 910);
		setLocationRelativeTo(null);
	
		JPanel panelFondo = new JPanel(){
			private static final long serialVersionUID = 1L;
			
			private Image imagen = new ImageIcon("imagenes\\\\Imagen_Fondo.jpeg").getImage();
	
	            @Override
	            protected void paintComponent(Graphics graficos) {
	                super.paintComponent(graficos);
	                
	                graficos.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
	            }
	        };
	        panelFondo.setBorder(new CompoundBorder());
	        setContentPane(panelFondo);
	        panelFondo.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0, 153, 175, 150));
        panel.setBounds(252, 81, 1140, 767);

        panelFondo.add(panel);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        textField.setColumns(10);
        textField.setBounds(173, 29, 582, 45);
        panel.add(textField);
        
        JComboBox<Object> comboBox = new JComboBox<Object>();
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
        comboBox.setBounds(10, 29, 153, 45);
        panel.add(comboBox);
        
        JButton btnCaja_1 = new JButton("BUSCAR");
        btnCaja_1.setFont(new Font("Tahoma", Font.BOLD, 28));
        btnCaja_1.setBounds(765, 29, 154, 45);
        panel.add(btnCaja_1);
        
        
        
        JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 99, 909, 555);
		panel.add(scrollPane);
		
		JTable table_buscar = new JTable();
		table_buscar.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Codigo","Producto","Cantidad","Precio"
				}
			));
		scrollPane.setViewportView(table_buscar);
		
        
        JButton btnCaja_1_1 = new JButton("PAGAR");
        btnCaja_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnCaja_1_1.setBounds(948, 664, 153, 72);
        panel.add(btnCaja_1_1);
        
        JLabel lblNewLabel = new JLabel("Codigo de ");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
        lblNewLabel.setBounds(929, 117, 201, 45);
        panel.add(lblNewLabel);
        
        JLabel lblSudTotal = new JLabel("Sud Total:");
        lblSudTotal.setForeground(Color.WHITE);
        lblSudTotal.setFont(new Font("Verdana", Font.BOLD, 30));
        lblSudTotal.setBounds(929, 273, 201, 45);
        panel.add(lblSudTotal);
        
        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setForeground(Color.WHITE);
        lblTotal.setFont(new Font("Verdana", Font.BOLD, 30));
        lblTotal.setBounds(929, 415, 201, 45);
        panel.add(lblTotal);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        textField_1.setColumns(10);
        textField_1.setBounds(929, 217, 201, 45);
        panel.add(textField_1);
        
        JButton btnCaja_1_1_1 = new JButton("EFECTIVO");
        btnCaja_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnCaja_1_1_1.setBounds(572, 691, 202, 45);
        panel.add(btnCaja_1_1_1);
        
        JButton btnCaja_1_1_2 = new JButton("TARJETA");
        btnCaja_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnCaja_1_1_2.setBounds(173, 691, 193, 45);
        panel.add(btnCaja_1_1_2);
        
        JLabel lblDescuento = new JLabel("descuento:");
        lblDescuento.setForeground(Color.WHITE);
        lblDescuento.setFont(new Font("Verdana", Font.BOLD, 30));
        lblDescuento.setBounds(929, 162, 201, 45);
        panel.add(lblDescuento);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        textField_2.setColumns(10);
        textField_2.setBounds(929, 341, 201, 45);
        panel.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        textField_3.setColumns(10);
        textField_3.setBounds(929, 471, 201, 45);
        panel.add(textField_3);
        
	}
}
