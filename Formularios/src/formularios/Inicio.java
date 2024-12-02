package formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Inicio {

	JFrame frmInicio;
	private JPanel panelFondo;
	private JTextField textField_USUARIO;
	private JPasswordField passwordField_CONTRASEÑA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\Icono_Inicio.png"));
		frmInicio.setTitle("INICIO");
		frmInicio.setSize(1440, 756);
		frmInicio.setBounds(100, 100, 1240, 710);
		frmInicio.setLocationRelativeTo(null);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicio.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frmInicio.setMinimumSize(new java.awt.Dimension(800, 550));
		
		 panelFondo = new JPanel(){
			private static final long serialVersionUID = 1L;
			
				private Image imagen = new ImageIcon("imagenes\\\\Imagen_Fondo.jpeg").getImage(); 

	            @Override
	            protected void paintComponent(Graphics graficos) {
	                super.paintComponent(graficos);
	                
	                graficos.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
	            }
	        };
		 panelFondo.setBorder(new CompoundBorder());
	        frmInicio.setContentPane(panelFondo);
	        panelFondo.setLayout(null);
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(340, 110, 600, 437);
	        panel.setBackground(new java.awt.Color(0,0,30,200));
	        panelFondo.add(panel);
	        panel.setLayout(new BorderLayout(0, 0));
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new java.awt.Color(0,0,0,0));
	        panel.add(panel_1, BorderLayout.NORTH);
	        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	        
	        JLabel lblNewLabel_BOUTIQUE_NOMBRE = new JLabel("My Boutique Secrets");
	        lblNewLabel_BOUTIQUE_NOMBRE.setForeground(Color.WHITE);
	        lblNewLabel_BOUTIQUE_NOMBRE.setFont(new Font("Serif", Font.BOLD, 35));
	        panel_1.add(lblNewLabel_BOUTIQUE_NOMBRE);
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBackground(new java.awt.Color(0,0,0,0));
	        panel.add(panel_2, BorderLayout.SOUTH);
	        
	        JButton btnNewButton_ENTRAR = new JButton("ENTRAR");
	        btnNewButton_ENTRAR.setFont(new Font("Serif", Font.BOLD, 20));
	        panel_2.add(btnNewButton_ENTRAR);
	        
	        JPanel panel_3 = new JPanel();
	        panel_3.setBackground(new java.awt.Color(0,0,0,0));
	        panel.add(panel_3, BorderLayout.CENTER);
	        panel_3.setLayout(new BorderLayout(0, 0));
	        
	        JPanel panel_4 = new JPanel();
	        FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
	        flowLayout_1.setVgap(30);
	        flowLayout_1.setHgap(20);
	        panel_4.setBackground(new java.awt.Color(0,0,0,0));
	        panel_3.add(panel_4, BorderLayout.NORTH);
	        
	        JLabel lblNewLabel_LOGO = new JLabel("");
	        panel_4.add(lblNewLabel_LOGO);
	        lblNewLabel_LOGO.setIcon(new ImageIcon("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\Image_boutique.png"));
	        
	        JPanel panel_5 = new JPanel();
	        FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
	        flowLayout.setHgap(80);
	        flowLayout.setVgap(20);
	        panel_5.setBackground(new java.awt.Color(0,0,0,0));
	        panel_3.add(panel_5, BorderLayout.SOUTH);
	        
	        textField_USUARIO = new JTextField();
	        textField_USUARIO.setFont(new Font("Serif", Font.BOLD, 22));
	        textField_USUARIO.setColumns(10);
	        panel_5.add(textField_USUARIO);
	        
	        passwordField_CONTRASEÑA = new JPasswordField();
	        passwordField_CONTRASEÑA.setFont(new Font("Tahoma", Font.BOLD, 22));
	        passwordField_CONTRASEÑA.setColumns(10);
	        panel_5.add(passwordField_CONTRASEÑA);
	        
	        JPanel panel_6 = new JPanel();
	        panel_6.setBackground(new java.awt.Color(0,0,0,0));
	        panel_3.add(panel_6, BorderLayout.CENTER);
	        panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 15));
	        
	        JLabel lblNewLabel_USUARIO = new JLabel("USUARIO:");
	        lblNewLabel_USUARIO.setForeground(Color.WHITE);
	        lblNewLabel_USUARIO.setFont(new Font("Serif", Font.BOLD, 25));
	        panel_6.add(lblNewLabel_USUARIO);
	        
	        JLabel lblNewLabel_3 = new JLabel("                    ");
	        panel_6.add(lblNewLabel_3);
	        
	        JLabel lblNewLabel_CONTRASEÑA = new JLabel("CONTRASEÑA:");
	        lblNewLabel_CONTRASEÑA.setForeground(Color.WHITE);
	        lblNewLabel_CONTRASEÑA.setFont(new Font("Serif", Font.BOLD, 25));
	        panel_6.add(lblNewLabel_CONTRASEÑA);
	        
	        
	        
	        
	        
	        // Evento

	        // Agregar un listener para centrar el panel cuando el tamaño cambie
	        panelFondo.addComponentListener(new java.awt.event.ComponentAdapter() {
	            @Override
	            public void componentResized(java.awt.event.ComponentEvent e) {
	                // Calcular posición para centrar el panel en el panelFondo
	                int x = (panelFondo.getWidth() - panel.getWidth()) / 2;
	                int y = (panelFondo.getHeight() - panel.getHeight()) / 2;
	                panel.setBounds(x, y, panel.getWidth(), panel.getHeight());
	            }
	        });

	        
	        btnNewButton_ENTRAR.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 try {
		                    // Obtener los valores de los campos de texto
		                    String usuario = textField_USUARIO.getText(); // Suponiendo que textFieldUsuario es tu JTextField para el usuario
		                    
		                    char[] contrasenaArray = passwordField_CONTRASEÑA.getPassword();
		                    String contrasena = new String(contrasenaArray);

		                    // Verificar las credenciales
		                    if (usuario.equals("admin") && contrasena.equals("admin")) {
		                        Administrador frameAdmin = new Administrador();
		                        frameAdmin.setLocationRelativeTo(null);
		                        frameAdmin.setVisible(true);
		                        frmInicio.dispose();
		                    } else if (usuario.equals("gerente") && contrasena.equals("gerente")) {
		                        Gerente frameGerente = new Gerente();
		                        frameGerente.setLocationRelativeTo(null);
		                        frameGerente.setVisible(true);
		                        frmInicio.dispose();
		                    } else if (usuario.equals("caja") && contrasena.equals("caja")) {
		                        Caja frameCaja = new Caja();
		                        frameCaja.setLocationRelativeTo(null);
		                        frameCaja.setVisible(true);
		                        frmInicio.dispose();
		                    } else {
		                        // Mostrar un mensaje de error si las credenciales no son válidas
		                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		                    }

		                    

		                } catch (Exception e1) {
		                    e1.printStackTrace();
		                }
	        	}
	        });

	        // Forzar una actualización inicial para centrar el panel
	        panelFondo.revalidate();
	        panelFondo.repaint();
		
	}
}
