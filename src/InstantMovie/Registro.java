package InstantMovie;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Registro extends JFrame {

    public Registro() {
        this.setSize(500, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("T-REX REGISTRO DE USUARIO NUEVO ");
        setMinimumSize(new Dimension(500, 700));

        COMPONENTES();

    }
    

    private void COMPONENTES() {
        PANEL();
        BOTONES();
        CAJAS();
        OPCIONES();
        LETRAS();
        IMAGEN();
        ETIQUETAS();

    }
    public JPanel panel;

    public void PANEL() {
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void ETIQUETAS() {
        //Fondo VERDE
        JLabel fond1 = new JLabel();
        fond1.setText("             ");
        fond1.setBounds(0, 0, 500, 700);
        fond1.setBackground(new Color(181, 228, 140));
        fond1.setOpaque(true);

        //Fondo AZUL
        JLabel fond2 = new JLabel();
        fond2.setText("             ");
        fond2.setBounds(0, 0, 500, 100);
        fond2.setBackground(new Color(82, 182, 154));
        fond2.setOpaque(true);

        panel.add(fond2);
        panel.add(fond1);

    }

    public void LETRAS() {
        //Etiqueta de Registro
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Registro de Usuario \n");
        etiqueta1.setBounds(69, 29, 350, 40);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(new Color(82, 182, 154));
        etiqueta1.setFont(new Font("Copperplate Gothic Bold", 3, 28));
        panel.add(etiqueta1);

        //Etiqueta de Nombre
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Ingresa tu Nombre \n");
        etiqueta2.setBounds(-10, 120, 350, 40);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(new Color(181, 228, 140));
        etiqueta2.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta2);

        //Etiqueta ________ NOMBRE 
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("___________________________________________________");
        etiqueta3.setBounds(40, 160, 350, 40);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setBackground(new Color(181, 228, 140));
        etiqueta3.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta3.setOpaque(true);
        panel.add(etiqueta3);

        //Etiqueta Apellido 
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("Ingresa tu Apellido \n");
        etiqueta4.setBounds(-10, 200, 350, 40);
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(new Color(181, 228, 140));
        etiqueta4.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta4);

        //Etiqueta _____ Apellido 
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("___________________________________________________");
        etiqueta5.setBounds(40, 240, 350, 40);
        etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setBackground(new Color(181, 228, 140));
        etiqueta5.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta5.setOpaque(true);
        panel.add(etiqueta5);

        //Etiqueta correo
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText("  Ingresa tu T-Rex ID® \n");
        etiqueta6.setBounds(-10, 280, 350, 40);
        etiqueta6.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true);
        etiqueta6.setBackground(new Color(181, 228, 140));
        etiqueta6.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta6);

        //Etiqueta ________________ correo
        JLabel etiqueta7 = new JLabel();
        etiqueta7.setText("___________________________________________________");
        etiqueta7.setBounds(40, 320, 350, 40);
        etiqueta7.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setBackground(new Color(181, 228, 140));
        etiqueta7.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta7.setOpaque(true);
        panel.add(etiqueta7);

        //Etiqueta  contraseña
        JLabel etiqueta8 = new JLabel();
        etiqueta8.setText("Ingresa tu Contraseña \n");
        etiqueta8.setBounds(35, 360, 300, 40);
        etiqueta8.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta8.setForeground(Color.BLACK);
        etiqueta8.setOpaque(true);
        etiqueta8.setBackground(new Color(181, 228, 140));
        etiqueta8.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta8);

        //Etiqueta _________________ contraseña
        JLabel etiqueta9 = new JLabel();
        etiqueta9.setText("___________________________________________________");
        etiqueta9.setBounds(40, 400, 350, 40);
        etiqueta9.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta9.setForeground(Color.BLACK);
        etiqueta9.setBackground(new Color(181, 228, 140));
        etiqueta9.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta9.setOpaque(true);
        panel.add(etiqueta9);

        //Etiqueta Telefono
        JLabel etiqueta10 = new JLabel();
        etiqueta10.setText("Ingresa tu Telefono \n");
        etiqueta10.setBounds(-10, 440, 350, 40);
        etiqueta10.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta10.setForeground(Color.BLACK);
        etiqueta10.setOpaque(true);
        etiqueta10.setBackground(new Color(181, 228, 140));
        etiqueta10.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta10);

        //Etiqueta ____________________ Telefono
        JLabel etiqueta11 = new JLabel();
        etiqueta11.setText("___________________________________________________");
        etiqueta11.setBounds(40, 480, 350, 40);
        etiqueta11.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta11.setForeground(Color.BLACK);
        etiqueta11.setBackground(new Color(181, 228, 140));
        etiqueta11.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta11.setOpaque(true);
        panel.add(etiqueta11);

        JLabel etiqueta12 = new JLabel();
        etiqueta12.setText("Ingresa tu Tipo de Registro \n");
        etiqueta12.setBounds(31, 520, 350, 40);
        etiqueta12.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta12.setForeground(Color.BLACK);
        etiqueta12.setOpaque(true);
        etiqueta12.setBackground(new Color(181, 228, 140));
        etiqueta12.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta12);

    }

    public void IMAGEN() {
        ImageIcon T_REX = new ImageIcon("t-rex1.png");
        JLabel im1 = new JLabel();
        im1.setBounds(350, 520, 150, 150);
        im1.setIcon(new ImageIcon(T_REX.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(im1);

    }

    public void OPCIONES() {
        //Boton de opcion
        String[] tipos = {"Selecciona", "Empleado", "Cliente"};

        JComboBox listatipo = new JComboBox(tipos);
        listatipo.setToolTipText("Selecciona");
        listatipo.setBounds(40, 560, 170, 30);
        listatipo.setBackground(new Color(181, 228, 140));
        listatipo.setForeground(Color.BLACK);
        listatipo.setFont(new Font("Copperplate Gothic Bold", 1, 20));
        panel.add(listatipo);

    }

    public void CAJAS() {
        //Caja Nombre
        JTextField nombre = new JTextField();
        nombre.setBounds(50, 150, 350, 30);
        nombre.setForeground(Color.gray);
        nombre.setBackground(new Color(181, 228, 140));
        nombre.setOpaque(true);
        nombre.setBorder(null);
        nombre.setText("Ej. Pedro ");
        nombre.setFont(new Font("Eras Bold ITC", 1, 15));
        panel.add(nombre);

        //Caja Apellido
        JTextField apellido = new JTextField();
        apellido.setBounds(50, 230, 350, 30);
        apellido.setForeground(Color.gray);
        apellido.setBackground(new Color(181, 228, 140));
        apellido.setOpaque(true);
        apellido.setBorder(null);
        apellido.setText("Ej. Picapiedra ");
        apellido.setFont(new Font("Eras Bold ITC", 1, 15));
        panel.add(apellido);

        //Caja correo
        JTextField correo = new JTextField();
        correo.setBounds(50, 310, 350, 30);
        correo.setForeground(Color.gray);
        correo.setBackground(new Color(181, 228, 140));
        correo.setOpaque(true);
        correo.setBorder(null);
        correo.setText("Ej. picapiedrapedro19@gmail.com ");
        correo.setFont(new Font("Eras Bold ITC", 1, 15));
        correo.getText();
        panel.add(correo);

        //Caja Contraseña
        JTextField contra = new JTextField();
        contra.setBounds(50, 395, 350, 30);
        contra.setForeground(Color.gray);
        contra.setBackground(new Color(181, 228, 140));
        contra.setOpaque(true);
        contra.setBorder(null);
        contra.setText(" ************************** ");
        contra.setFont(new Font("Eras Bold ITC", 1, 15));
        panel.add(contra);

        //Caja Telefono
        JTextField tel = new JTextField();
        tel.setBounds(50, 470, 470, 30);
        tel.setForeground(Color.gray);
        tel.setBackground(new Color(181, 228, 140));
        tel.setOpaque(true);
        tel.setBorder(null);
        tel.setText("  Ej. 5610710491 ");
        tel.setFont(new Font("Eras Bold ITC", 1, 15));
        tel.getText();
        panel.add(tel);
        
        
        //BOTON
     /*   JButton ingreso=new JButton ("REGISTRAR");
        ingreso.addActionListener(new ActionListener(){
            public void actionPerfomed(ActionEvent e){
            int DATOS=Integer.parseInt(tel.getText());
            DATOS +=Integer.parseInt(contra.getText());
            correo.setText(String.valueOf(DATOS));
            }
        });
        ingreso.setBounds(235, 580, 120, 30);
        panel.add(registrar);
        
 */
                
      

       

        

    }

    
    public void BOTONES() {
        //Boton de registro
        JButton registro1 = new JButton("REGISTRAR");
        registro1.setBounds(235, 580, 120, 30);
        registro1.setForeground(Color.BLACK);
        registro1.setHorizontalAlignment(SwingConstants.CENTER);
        registro1.setBackground(new Color(82, 182, 154));
        registro1.setOpaque(true);
        registro1.setFont(new Font("Copperplate Gothic Bold", 1, 10));
        registro1.setCursor(new Cursor(HAND_CURSOR));
        registro1.addActionListener(new ActionListener() {
            @Override
         
            public void actionPerformed(ActionEvent arg0) {
                String registro1;

                 JOptionPane.showMessageDialog(null, "<html><p style =\" color:black; font: 25px; \">SE GUARDO TU REGISTRO CON EXITO</p></html>");
            
                Login l = new Login();
                l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                l.setVisible(true);

                setVisible(false);
                
                 

            }
        });

       

        panel.add(registro1);
    }

}
