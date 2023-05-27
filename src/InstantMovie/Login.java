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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Login extends JFrame {
//PANEL PRINCIPAL

    public Login() {
        this.setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("T-REX MOVIE INTERFAZ");
        setMinimumSize(new Dimension(900, 600));
        COMPONENTES();
    }
    public JPanel panel;

    //ARRANQUE DE LOS BOTONES, ETIQUETAS, ETC
    public void COMPONENTES() {
        PANEL();
        LETRAS();
        BOTONES();
        IMAGEN();
        ETIQUETAS();
        CAJAS();

    }

    //FONDO DE PANEL 
    public void PANEL() {
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    //AQUI SE INSERTAN LAS ETIQUETAS NECESARIAS PARA QUE SE VEA PRESENTABLE EL FONDO DE EL LOGIN.
    public void ETIQUETAS() {

        JLabel fond1 = new JLabel();
        fond1.setText("             ");
        fond1.setBounds(0, 0, 900, 600);
        fond1.setBackground(new Color(82, 182, 154));
        fond1.setOpaque(true);

        JLabel fond2 = new JLabel();
        fond2.setText("             ");
        fond2.setBounds(0, 0, 350, 600);
        fond2.setBackground(new Color(153, 217, 140));
        fond2.setOpaque(true);

        panel.add(fond2);
        panel.add(fond1);

    }

    //AQUI VA TODO EL LETTERING :) 
    public void LETRAS() {
        //etiqueta login usuario
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Login de Usuario \n");
        etiqueta1.setBounds(450, 10, 350, 40);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setForeground(new Color(24, 78, 119));
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(new Color(181, 228, 140));
        etiqueta1.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        panel.add(etiqueta1);

        //Etiqueta de hasta abajo
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Bienvenido a la Experiencia T-REX :)");
        etiqueta2.setBounds(70, 530, 220, 30);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true);

        etiqueta2.setFont(new Font("Times New Roman", 1, 13));
        panel.add(etiqueta2);

        //etiqueta iniciar sesion
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("INICIAR SESIÓN");
        etiqueta3.setBounds(370, 100, 350, 60);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setBackground(new Color(82, 182, 154));
        etiqueta3.setOpaque(true);
        etiqueta3.setFont(new Font("Bodoni MT", 1, 35));
        panel.add(etiqueta3);

        //etiqueta usuario
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("T-Rex ID®");
        etiqueta4.setBounds(350, 190, 250, 40);
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setBackground(new Color(82, 182, 154));
        etiqueta4.setOpaque(true);
        etiqueta4.setFont(new Font("Copperplate Gothic Bold", 1, 20));
        panel.add(etiqueta4);

        //etiqueta contraseña
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("CONTRASEÑA");
        etiqueta5.setBounds(377, 330, 250, 40);
        etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setBackground(new Color(82, 182, 154));
        etiqueta5.setOpaque(true);
        etiqueta5.setFont(new Font("Copperplate Gothic Bold", 1, 20));
        panel.add(etiqueta5);

        //etiquetas ______________ xd
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText("_______________________________________________");
        etiqueta6.setBounds(420, 250, 300, 40);
        etiqueta6.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setBackground(new Color(82, 182, 154));
        etiqueta6.setOpaque(true);
        panel.add(etiqueta6);

        JLabel etiqueta7 = new JLabel();
        etiqueta7.setText("_______________________________________________");
        etiqueta7.setBounds(420, 384, 300, 40);
        etiqueta7.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setBackground(new Color(82, 182, 154));
        etiqueta7.setOpaque(true);

        panel.add(etiqueta7);

    }

    public void IMAGEN() {
        ImageIcon T_REX = new ImageIcon("t-rex1.png");
        JLabel im1 = new JLabel();
        im1.setBounds(50, -15, 230, 230);
        im1.setIcon(new ImageIcon(T_REX.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(im1);

        ImageIcon FONDO = new ImageIcon("fondodino.png");
        JLabel im2 = new JLabel();
        im2.setBounds(0, 0, 350, 600);
        im2.setIcon(new ImageIcon(FONDO.getImage().getScaledInstance(im2.getWidth(), im2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(im2);

    }

    public void CAJAS() {

        //Caja de texto de nombre
        JTextField nombre = new JTextField();
        nombre.setBounds(423, 245, 330, 30);
        nombre.setForeground(Color.gray);
        nombre.setBackground(new Color(82, 182, 154));
        nombre.setOpaque(true);
        nombre.setBorder(null);
        nombre.setText("Ingrese su correo");
        nombre.setFont(new Font("Eras Bold ITC", 1, 15));
        panel.add(nombre);

        //Caja de texto de contraseña
        JTextField contraseña = new JTextField();

        contraseña.setBounds(420, 379, 330, 30);
        contraseña.setForeground(Color.gray);
        contraseña.setBackground(new Color(82, 182, 154));
        contraseña.setOpaque(true);
        contraseña.setBorder(null);
        contraseña.setText("***********************");
        contraseña.setFont(new Font("Eras Bold ITC", 1, 15));

        panel.add(contraseña);

        //Caja de texto 
    }

    public void BOTONES() {

        //BOTON de ingresar de el usuario
        JButton login = new JButton();
        login.setBounds(500, 440, 120, 40);
        login.setText("ENTRAR");
        login.setForeground(Color.BLACK);
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setBackground(new Color(153, 217, 140));
        login.setOpaque(true);
        login.setFont(new Font("Copperplate Gothic Bold", 1, 15));
        login.setCursor(new Cursor(HAND_CURSOR));
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                InterfazCine Cin = new InterfazCine();
                Cin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Cin.setVisible(true);

                
                setVisible(false);

            }
        });
        panel.add(login);

        //Boton de registro del usuario
        JButton registro2 = new JButton();
        registro2.setBounds(710, 510, 125, 40);
        registro2.setText("REGISTRATE");
        registro2.setForeground(Color.BLACK);
        registro2.setHorizontalAlignment(SwingConstants.CENTER);
        registro2.setBackground(new Color(153, 217, 140));
        registro2.setOpaque(true);
        registro2.setFont(new Font("Copperplate Gothic Bold", 1, 12));
        registro2.setCursor(new Cursor(HAND_CURSOR));

        registro2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                Registro r = new Registro();
                r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                r.setVisible(true);

                setVisible(false);

            }
        });
        panel.add(registro2);

    }

}
