package formularios;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Gerente extends JFrame {

    private static final long serialVersionUID = 1L;

    // Inicialización de objetos
    private JPanel panelFondo,  contenedor, panel_1_1;
    private JButton btnMostrarInventario, btn_ESTADO_RESULDADO, btnMostrarInicio;
    private JLabel lblNewLabel;

    public Gerente() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\Imagen_Gerente.png"));
    	setTitle("GERENTE");
        setResizable(false);
        setSize(1649, 780);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1649, 820);
        setLocationRelativeTo(null);
        
        INICIO_GERENTE p1 = new INICIO_GERENTE();
        p1.setSize(1429, 781);
        p1.setLocation(0, 0);

        // Panel de fondo con imagen
        panelFondo = new JPanel();
        panelFondo.setBorder(new CompoundBorder());
        setContentPane(panelFondo); // Aquí se establece como contenido principal
        panelFondo.setLayout(null);

        // Panel lateral izquierdo
        panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(new Color(0, 51, 102));
        panel_1_1.setBounds(0, 0, 217, 791);
        panelFondo.add(panel_1_1);

        // Botón para mostrar el panel GESTOR_INVENTARIO
        btnMostrarInventario = new JButton("Inventario");
        btnMostrarInventario.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnMostrarInventario.setBounds(0, 336, 217, 45);
        panel_1_1.add(btnMostrarInventario);

        btn_ESTADO_RESULDADO = new JButton("<html>Estado de<br>Resultado</html>");
        btn_ESTADO_RESULDADO.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_ESTADO_RESULDADO.setBounds(0, 391, 217, 57);
        panel_1_1.add(btn_ESTADO_RESULDADO);


        btnMostrarInicio = new JButton("INICIO");
        btnMostrarInicio.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnMostrarInicio.setBounds(0, 280, 217, 45);
        panel_1_1.add(btnMostrarInicio);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\joseg\\eclipse-workspace\\vistas\\Formularios\\Imagenes\\Imagen_Gerente.png"));
        lblNewLabel.setBounds(10, 49, 190, 206);
        panel_1_1.add(lblNewLabel);
        
        JButton btn_Balancen_General = new JButton("<html>Balance<br>General</html>");
        btn_Balancen_General.setPreferredSize(new Dimension(150, 60)); // Ajusta el tamaño para permitir más de una línea
        btn_Balancen_General.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_Balancen_General.setBounds(0, 459, 217, 50);
        panel_1_1.add(btn_Balancen_General);

        
        JButton btn_TRANSACIONES = new JButton("Transaciones");
        btn_TRANSACIONES.setFont(new Font("Tahoma", Font.BOLD, 26));
        btn_TRANSACIONES.setBounds(0, 520, 217, 45);
        panel_1_1.add(btn_TRANSACIONES);

        // Panel contenedor
        contenedor = new JPanel();
        contenedor.setBackground(new java.awt.Color(0,0,0,0));
        contenedor.setBounds(211, 0, 1429, 781);
        panelFondo.add(contenedor); // Agregamos al panelFondo
        contenedor.setLayout(null);
        contenedor.add(p1); // Agrega el nuevo panel al contenedor

        // Eventos del botón
        btnMostrarInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelFondo.remove(contenedor); // Elimina el contenedor actual por completo
                
                JPanel contenedor1 = new JPanel(); // Crea un nuevo contenedor
                contenedor1.setBounds(211, 0, 1429, 781);
                contenedor1.setLayout(null);
                panelFondo.add(contenedor); // Añade el nuevo contenedor al fondo
                
                INICIO_GERENTE p1 = new INICIO_GERENTE();
                p1.setSize(1429, 781);
                p1.setLocation(0, 0);
                contenedor.add(p1); // Agrega el nuevo panel al contenedor
                
                contenedor.revalidate();
                contenedor.repaint();
                panelFondo.revalidate();
                panelFondo.repaint();
            }
        });

        btnMostrarInventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelFondo.remove(contenedor); // Elimina el contenedor actual por completo

                JPanel contenedor1 = new JPanel(); // Crea un nuevo contenedor
                contenedor1.setBounds(211, 0, 1429, 781);
                contenedor1.setLayout(null);
                panelFondo.add(contenedor); // Añade el nuevo contenedor al fondo

                GESTOR_INVENTARIO p1 = new GESTOR_INVENTARIO();
                p1.setSize(1429, 781);
                p1.setLocation(0, 0);
                contenedor.add(p1); // Agrega el nuevo panel al contenedor

                contenedor.revalidate();
                contenedor.repaint();
                panelFondo.revalidate();
                panelFondo.repaint();
            }
        });

        btn_ESTADO_RESULDADO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelFondo.remove(contenedor); // Elimina el contenedor actual por completo

                JPanel contenedor1 = new JPanel(); // Crea un nuevo contenedor
                contenedor1.setBounds(211, 0, 1429, 781);
                contenedor1.setLayout(null);
                panelFondo.add(contenedor); // Añade el nuevo contenedor al fondo

                ESTADO_RESULTADO p1 = new ESTADO_RESULTADO();
                p1.setSize(1429, 781);
                p1.setLocation(0, 0);
                contenedor.add(p1); // Agrega el nuevo panel al contenedor

                contenedor.revalidate();
                contenedor.repaint();
                panelFondo.revalidate();
                panelFondo.repaint();
            }
        });
        btn_Balancen_General.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelFondo.remove(contenedor); // Elimina el contenedor actual por completo

                JPanel contenedor1 = new JPanel(); // Crea un nuevo contenedor
                contenedor1.setBounds(211, 0, 1429, 781);
                contenedor1.setLayout(null);
                panelFondo.add(contenedor); // Añade el nuevo contenedor al fondo

                BALANCE_GENERAL p1 = new BALANCE_GENERAL();
                p1.setSize(1429, 781);
                p1.setLocation(0, 0);
                contenedor.add(p1); // Agrega el nuevo panel al contenedor

                contenedor.revalidate();
                contenedor.repaint();
                panelFondo.revalidate();
                panelFondo.repaint();
            }
        });
        btn_TRANSACIONES.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelFondo.remove(contenedor); // Elimina el contenedor actual por completo

                JPanel contenedor1 = new JPanel(); // Crea un nuevo contenedor
                contenedor1.setBounds(211, 0, 1429, 781);
                contenedor1.setLayout(null);
                panelFondo.add(contenedor); // Añade el nuevo contenedor al fondo

                TRANSACIONES p1 = new TRANSACIONES();
                p1.setSize(1429, 781);
                p1.setLocation(0, 0);
                contenedor.add(p1); // Agrega el nuevo panel al contenedor

                contenedor.revalidate();
                contenedor.repaint();
                panelFondo.revalidate();
                panelFondo.repaint();
            }
        });
    }
}

