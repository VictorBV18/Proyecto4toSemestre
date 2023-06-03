package Interfaces;



import Connexion.Conexionmysql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

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
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Registro extends JFrame {
        Connexion.Conexionmysql con =new  Conexionmysql();
        Connection cn=(Connection) con.conectar();
        
    
    
    //declaracion variables
    private JTextField nombre, apellido, correo,contra;
    private JButton registro1, admin;
    public JPanel panel;
    private JLabel fond1, fond2, etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7, etiqueta8, etiqueta9, etiqueta10, etiqueta11;
    private JFormattedTextField tel;

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
        LETRAS();
        IMAGEN();
        ETIQUETAS();

    }

    public void PANEL() {
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void ETIQUETAS() {
        //Fondo VERDE
        fond1 = new JLabel();
        fond1.setBounds(0, 0, 500, 700);
        fond1.setBackground(new Color(181, 228, 140));
        fond1.setOpaque(true);
        panel.add(fond1);

        //Fondo AZUL
        fond2 = new JLabel();
        fond2.setBounds(0, 0, 500, 100);
        fond2.setBackground(new Color(82, 182, 154));
        fond2.setOpaque(true);
        panel.add(fond2);

    }

    public void LETRAS() {
        //Etiqueta de Registro
        etiqueta1 = new JLabel("Registro de Usuario \n");
        //etiqueta1.setText("Registro de Usuario \n");
        etiqueta1.setBounds(69, 29, 350, 40);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(new Color(82, 182, 154));
        etiqueta1.setFont(new Font("Copperplate Gothic Bold", 3, 28));
        panel.add(etiqueta1);

        //Etiqueta de Nombre
        etiqueta2 = new JLabel("Ingrea tu Nombre \n");
        etiqueta2.setBounds(-10, 120, 350, 40);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(new Color(181, 228, 140));
        etiqueta2.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta2);

        //Etiqueta ________ NOMBRE 
        etiqueta3 = new JLabel("___________________________________________________");
        etiqueta3.setBounds(40, 160, 350, 40);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setBackground(new Color(181, 228, 140));
        etiqueta3.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta3.setOpaque(true);
        panel.add(etiqueta3);

        //Etiqueta Apellido 
        etiqueta4 = new JLabel("Ingrea tu Apellido \n");
        etiqueta4.setBounds(-10, 200, 350, 40);
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(new Color(181, 228, 140));
        etiqueta4.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta4);

        //Etiqueta _____ Apellido 
        etiqueta5 = new JLabel("___________________________________________________");
        etiqueta5.setBounds(40, 240, 350, 40);
        etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setBackground(new Color(181, 228, 140));
        etiqueta5.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta5.setOpaque(true);
        panel.add(etiqueta5);

        //Etiqueta correo
        etiqueta6 = new JLabel("Ingrea tu T-Rex ID®  \n");
        etiqueta6.setBounds(-10, 280, 350, 40);
        etiqueta6.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true);
        etiqueta6.setBackground(new Color(181, 228, 140));
        etiqueta6.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta6);

        //Etiqueta ________________ correo
        etiqueta7 = new JLabel("___________________________________________________");
        etiqueta7.setBounds(40, 320, 350, 40);
        etiqueta7.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setBackground(new Color(181, 228, 140));
        etiqueta7.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta7.setOpaque(true);
        panel.add(etiqueta7);

        //Etiqueta  contraseña
        etiqueta8 = new JLabel("Ingrea tu Contraseña \n");
        etiqueta8.setBounds(35, 360, 300, 40);
        etiqueta8.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta8.setForeground(Color.BLACK);
        etiqueta8.setOpaque(true);
        etiqueta8.setBackground(new Color(181, 228, 140));
        etiqueta8.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta8);

        //Etiqueta _________________ contraseña
        etiqueta9 = new JLabel("___________________________________________________");
        etiqueta9.setBounds(40, 400, 350, 40);
        etiqueta9.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta9.setForeground(Color.BLACK);
        etiqueta9.setBackground(new Color(181, 228, 140));
        etiqueta9.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta9.setOpaque(true);
        panel.add(etiqueta9);

        //Etiqueta Telefono
        etiqueta10 = new JLabel("Ingrea tu Telefono \n");
        etiqueta10.setBounds(-10, 440, 350, 40);
        etiqueta10.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta10.setForeground(Color.BLACK);
        etiqueta10.setOpaque(true);
        etiqueta10.setBackground(new Color(181, 228, 140));
        etiqueta10.setFont(new Font("Copperplate Gothic Bold", 3, 20));
        panel.add(etiqueta10);

        //Etiqueta ____________________ Telefono
        etiqueta11 = new JLabel("___________________________________________________");
        etiqueta11.setBounds(40, 480, 350, 40);
        etiqueta11.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta11.setForeground(Color.BLACK);
        etiqueta11.setBackground(new Color(181, 228, 140));
        etiqueta11.setFont(new Font("Copperplate Gothic Bold", 3, 12));
        etiqueta11.setOpaque(true);
        panel.add(etiqueta11);

    }

    public void IMAGEN() {
        ImageIcon T_REX = new ImageIcon("t-rex1.png");
        JLabel im1 = new JLabel();
        im1.setBounds(350, 520, 150, 150);
        im1.setIcon(new ImageIcon(T_REX.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(im1);

    }

    public void CAJAS() {
        //Caja Nombre
        nombre = new JTextField();
        nombre.setToolTipText("Ej. Bart");
        nombre.setBounds(50, 150, 350, 30);
        nombre.setForeground(Color.gray);
        nombre.setBackground(new Color(181, 228, 140));
        nombre.setOpaque(true);
        nombre.setBorder(null);
        nombre.setFont(new Font("Eras Bold ITC", 1, 15));
        nombre.getText();
        
        panel.add(nombre);

        //Caja Apellido
        apellido = new JTextField();
        apellido.setToolTipText("Ej. Simpson");
        apellido.setBounds(50, 230, 350, 30);
        apellido.setForeground(Color.gray);
        apellido.setBackground(new Color(181, 228, 140));
        apellido.setOpaque(true);
        apellido.setBorder(null);
        apellido.setFont(new Font("Eras Bold ITC", 1, 15));
        apellido.getText();
        panel.add(apellido);

        //Caja correo
        correo = new JTextField();
        correo.setToolTipText("Ej. pedropicapiedra@gmail.com");
        correo.setBounds(50, 310, 350, 30);
        correo.setForeground(Color.gray);
        correo.setBackground(new Color(181, 228, 140));
        correo.setOpaque(true);
        correo.setBorder(null);
        
        correo.setFont(new Font("Eras Bold ITC", 1, 15));
        correo.getText();
        panel.add(correo);

        //Caja Contraseña
        contra = new JTextField();
        contra.setToolTipText("Ej. Picatelacolaraul69");
        contra.setBounds(50, 395, 350, 30);
        contra.setForeground(Color.gray);
        contra.setBackground(new Color(181, 228, 140));
        contra.setOpaque(true);
        contra.setBorder(null);
        contra.setFont(new Font("Eras Bold ITC", 1, 15));
        contra.getText();
        panel.add(contra);

        //Caja Telefono
        tel = new JFormattedTextField();
        tel.setToolTipText("Ej. 5610710406");
        tel.setBounds(50, 470, 470, 30);
        tel.setForeground(Color.gray);
        tel.setBackground(new Color(181, 228, 140));
        tel.setOpaque(true);
        tel.setBorder(null);
        tel.setFont(new Font("Eras Bold ITC", 1, 15));
        tel.getText();
        panel.add(tel);

    }

    public void BOTONES() {
        //Boton de registro
        registro1 = new JButton("REGISTRAR");
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
                String name=nombre.getText();
                String apell=apellido.getText();
                String email=correo.getText();
                String contraseña=contra.getText();
                String telefono=tel.getText();
               if(name.isEmpty()||apell.isEmpty()||email.isEmpty()||contraseña.isEmpty()||telefono.isEmpty()){
               JOptionPane.showMessageDialog(null, "COMPLETA TODO EL REGISTRO");
               }else{
                   try {
                       String consulta="INSERT INTO cliente (nombrecliente,apellcliente,telcliente,correocliente,contracliente)VALUES('"+name+"','"+apell+"','"+telefono+"','"+email+"','"+contraseña+"');";
                       PreparedStatement ps=(PreparedStatement) cn.prepareStatement(consulta);
                       ps.executeUpdate();
                       limpiar();
                       JOptionPane.showMessageDialog(null, "SE GUARDO EL REGISTRO");
                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null, "NO SE GUARDO EL REGISTRO");
                   }
               
               }
               
                Login l = new Login();
                l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                l.setVisible(true);

                setVisible(false);

              

               
            }
            void limpiar(){
            nombre.setText("");
            apellido.setText("");
            correo.setText("");
            contra.setText("");
            tel.setText("");            
            }

        });
        
        admin =new JButton("ADMIN");
        admin.setBounds(55, 580, 120, 30);
        admin.setForeground(Color.WHITE);
        admin.setHorizontalAlignment(SwingConstants.CENTER);
        admin.setBackground(Color.BLACK);
        admin.setOpaque(true);
        admin.setFont(new Font("Copperplate Gothic Bold", 1, 10));
        admin.setCursor(new Cursor(HAND_CURSOR));
        
        
        
        panel.add(admin);
        panel.add(registro1);
    }

}
