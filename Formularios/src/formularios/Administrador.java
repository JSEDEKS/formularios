package formularios;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class Administrador extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	public Administrador() {
		setTitle("ADMINISTRADOR");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\Admin.png"));
		setResizable(false);
		setSize(1100, 610);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 610);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	
		JPanel panelFondo = new JPanel(){
            private static final long serialVersionUID = 1L;
            
            private Image imagen = new ImageIcon("imagenes\\\\Imagen_Fondo.jpeg").getImage();

            @Override
            protected void paintComponent(Graphics graficos) {
                super.paintComponent(graficos);
                // Dibuja la imagen de fondo
                graficos.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
	        panelFondo.setBorder(new CompoundBorder());
	        setContentPane(panelFondo);
	        panelFondo.setLayout(null);
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(10, 24, 761, 536);
	        panel.setBackground(new Color(0, 153, 175, 150));
	        panelFondo.add(panel);
	        panel.setLayout(null);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(0, 102, 153));
	        panel_1.setBounds(22, 11, 716, 82);
	        panel.add(panel_1);
	        
	        JLabel lblNewLabel = new JLabel("Administrar Usuarios");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\Admin.png"));
	        lblNewLabel.setForeground(Color.BLACK);
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
	        panel_1.add(lblNewLabel);
	        
	        JPanel panel_1_1 = new JPanel();
	        panel_1_1.setBackground(new Color(0, 102, 153));
	        panel_1_1.setBounds(22, 123, 716, 402);
	        panel.add(panel_1_1);
	        panel_1_1.setLayout(null);
	        
	        JLabel lblNewLabel_1 = new JLabel("Usuarios:");
	        lblNewLabel_1.setForeground(Color.BLACK);
	        lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 40));
	        lblNewLabel_1.setBounds(10, -7, 169, 52);
	        panel_1_1.add(lblNewLabel_1);
	        
	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(10, 56, 696, 282);
	        panel_1_1.add(scrollPane);
	        
	        table = new JTable();
	        table.setModel(new DefaultTableModel(
	        	new Object[][] {
	        	},
	        	new String[] {
	        		"New column", "New column", "New column", "New column", "New column"
	        	}
	        ));
	        scrollPane.setViewportView(table);
	        
	        JButton btnNewButton = new JButton("ELIMINAR");
	        btnNewButton.setEnabled(false);
	        btnNewButton.setForeground(Color.RED);
	        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	        btnNewButton.setBounds(303, 349, 112, 42);
	        panel_1_1.add(btnNewButton);
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBounds(781, 24, 293, 536);
	        panel_2.setBackground(new Color(0, 153, 175, 150));
	        panelFondo.add(panel_2);
	        panel_2.setLayout(null);
	        
	        JPanel panel_3 = new JPanel();
	        panel_3.setBackground(new Color(0, 102, 153));
	        panel_3.setBounds(10, 11, 273, 511);
	        panel_2.add(panel_3);
	        panel_3.setLayout(null);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("Crear Usuarios");
	        lblNewLabel_1_1.setForeground(Color.BLACK);
	        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	        lblNewLabel_1_1.setBounds(10, 11, 253, 52);
	        panel_3.add(lblNewLabel_1_1);
	        
	        textField = new JTextField();
	        textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        textField.setColumns(10);
	        textField.setBounds(109, 99, 144, 29);
	        panel_3.add(textField);
	        
	        JLabel lblCodigo = new JLabel("Nombre:");
	        lblCodigo.setForeground(Color.BLACK);
	        lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 20));
	        lblCodigo.setBackground(Color.WHITE);
	        lblCodigo.setBounds(10, 92, 98, 45);
	        panel_3.add(lblCodigo);
	        
	        JLabel lblProducto = new JLabel("Usuario:");
	        lblProducto.setForeground(Color.BLACK);
	        lblProducto.setFont(new Font("Tahoma", Font.BOLD, 20));
	        lblProducto.setBackground(Color.WHITE);
	        lblProducto.setBounds(10, 204, 89, 45);
	        panel_3.add(lblProducto);
	        
	        JLabel lblCantidad = new JLabel("Nivel acceso:");
	        lblCantidad.setForeground(Color.BLACK);
	        lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 20));
	        lblCantidad.setBackground(Color.WHITE);
	        lblCantidad.setBounds(10, 148, 133, 45);
	        panel_3.add(lblCantidad);
	        
	        JLabel lblCodigo_1_1 = new JLabel("Contraseña:");
	        lblCodigo_1_1.setForeground(Color.BLACK);
	        lblCodigo_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	        lblCodigo_1_1.setBackground(Color.WHITE);
	        lblCodigo_1_1.setBounds(10, 260, 133, 45);
	        panel_3.add(lblCodigo_1_1);
	        
	        textField_2 = new JTextField();
	        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        textField_2.setColumns(10);
	        textField_2.setBounds(135, 265, 118, 29);
	        panel_3.add(textField_2);
	        
	        textField_3 = new JTextField();
	        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        textField_3.setColumns(10);
	        textField_3.setBounds(109, 209, 144, 29);
	        panel_3.add(textField_3);
	        
	        JButton btnAgregar = new JButton("AGREGAR");
	        btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 30));
	        btnAgregar.setBounds(35, 326, 207, 79);
	        panel_3.add(btnAgregar);
	        
	        JButton btnEditar = new JButton("EDITAR");
	        btnEditar.setFont(new Font("Tahoma", Font.BOLD, 30));
	        btnEditar.setEnabled(false);
	        btnEditar.setBounds(35, 421, 207, 79);
	        panel_3.add(btnEditar);
	        
	        JComboBox<?> comboBox = new JComboBox<Object>();
	        comboBox.setBounds(146, 152, 107, 29);
	        panel_3.add(comboBox);
	}
}
