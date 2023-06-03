
package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class InterfazCine extends JFrame {
        
        public InterfazCine() {
        this.setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("T-Rex MOVIE Una Experiencia Unica :) ");
        setMinimumSize(new Dimension(900, 600));
        
       
        
        Componentes();
        }
        
        
        private void Componentes(){
            
        //Fondo del panel    
        JPanel fondo = new JPanel();
        fondo.setSize(900, 600);
        ImageIcon imageIcon = new ImageIcon("DinoF.png");
        Image image = imageIcon.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        JLabel background = new JLabel (new ImageIcon(image));
        background.setBounds(0,0, fondo.getWidth(), fondo.getHeight());
        add(background);
        fondo.setLayout(null);
        
        //Texto
        JLabel salas = new JLabel("Elija la sala");
        salas.setBounds(50, 30, 300, 60);
        salas.setForeground(Color.BLACK);
        salas.setFont(new Font("Bookman Old Style", 1, 18));
        salas.setVisible(true);
        add(salas);
        
        JLabel aforo = new JLabel("Aforo");
        aforo.setBounds(180, 30, 100, 60);
        aforo.setForeground(Color.BLACK);
        aforo.setFont(new Font("Bookman Old Style", 1,18));
        add(aforo);
        JTextField afo = new JTextField();
        afo.setBounds(180,80,60,50);
        afo.setBackground(new Color(0,0,0,0));
        afo.setFont(new Font("Century Schoolbook", 1, 18));
        afo.setOpaque(false);
        add(afo);
        
        String[] opcion ={"Normal","VIP", "Cliente Fiel"};
        JComboBox lista = new JComboBox(opcion);
        lista.setToolTipText("Seleciona");
        lista.setBounds(50, 80, 110, 50);
        lista.setBackground(new Color(0,0,0,0));
        lista.setFont(new Font("Century Schoolbook", 1, 14));
        lista.setForeground(Color.BLACK);
        lista.setOpaque(false);
        add(lista);
        
        lista.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
            String respuesta = (String) lista.getSelectedItem();
            //Respuesta de acuerdo a la opcion del JComoboBox
            if(respuesta.equals("Normal")){
                afo.setText("70");
            }else if( respuesta.equals("VIP")){
                afo.setText("50");
            }else if(respuesta.equals("Cliente Fiel")){
                afo.setText("35");
            }
            
            }
        });
           
        //Tarjeta de cobro
        JLabel cobro = new JLabel("Opciones de pago");
        cobro.setBounds(50, 180, 210, 50);
        cobro.setFont(new Font("Bookman Old Style", 1,18));
        cobro.setForeground(Color.BLACK);
        add(cobro);
        String[] lista2 ={"Efectivo","Tarjeta"};
        JComboBox cobro1 = new JComboBox(lista2);
        cobro1.setBounds(50, 220, 120, 50);
        cobro1.setBackground(new Color(0,0,0,0));
        cobro1.setFont(new Font("Century Schoolbook", 1, 18));
        cobro1.setForeground(Color.BLACK);
        add(cobro1);
        
        //Caja de lista2
        JTextField cobro2 = new JTextField();
        cobro2.setBounds(400,220,170,50);
        cobro2.setFont(new Font("Bookman Old Style", 1,18));
        cobro2.setForeground(Color.BLACK);
        cobro2.setOpaque(false);
        add(cobro2);
        JLabel aviso = new JLabel("Numero de cuenta");
        aviso.setBounds(400,180,200,50);
        aviso.setFont(new Font("Bookman Old Style", 1,18));
        aviso.setForeground(Color.BLACK);
        add(aviso);
        cobro1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String respuesta1= (String) cobro1.getSelectedItem();
                if( respuesta1.equals("Efectivo")){
                    JOptionPane.showMessageDialog(fondo, "Pagar al final en caja");
                }else if (respuesta1.equals("Tarjeta")){
                   JOptionPane.showMessageDialog(fondo, "Ingresa tu numero de cuenta ");

                }
            }
        });
        //Personas
        JLabel cantP = new JLabel("N.Personas");
        cantP.setBounds(270,30,100,60);
        cantP.setFont(new Font("Bookman Old Style",1, 18));
        cantP.setForeground(Color.BLACK);
        cantP.getHorizontalTextPosition();
        add(cantP);
        //Caja Personas
        JTextField cantp= new JTextField();
        cantp.setBounds(270,80,100,50);
        cantp.setFont(new Font( "Bookman Old Style",1,18));
        cantp.getText();
        cantp.setOpaque(false);
        add(cantp);
        
        //Pago
        JLabel pago = new JLabel("Monto de pago");
        pago.setBounds(230,180,180,50);
        pago.setForeground(Color.BLACK);
        pago.setFont(new Font("Bookman Old Style",1,18));
        pago.setForeground(Color.BLACK);
        add(pago);
        JTextField mpago = new JTextField();
        mpago.setBounds(230,220,140,50);
        mpago.setForeground(Color.BLACK);
        mpago.setFont(new Font("Bookman Old Style",1,18));
        mpago.setForeground(Color.BLACK);
        mpago.setOpaque(false);
        add(mpago);
        //persona
        JLabel Tpersona = new JLabel("Categoria de persona");
        Tpersona.setBounds(390,30, 200,60);
        Tpersona.setFont(new Font("Bookman Old Style",1,18));
        Tpersona.setForeground(Color.BLACK);
        add(Tpersona);
        String[] Popcion ={"Niños: $30","Adulto: $100","Estudiantes: $50","Discapacitados/M: $70"};
        JComboBox opcion1 = new JComboBox(Popcion);
        opcion1.setToolTipText("Seleciona");
        opcion1.setBounds(390, 80, 200, 50);
        opcion1.setBackground(new Color(0,0,0,0));
        opcion1.setFont(new Font("Century Schoolbook", 1, 14));
        opcion1.setForeground(Color.BLACK);
        add(opcion1);
        

        //Seleccionar cartelera
        JLabel cartelera= new JLabel("Seleccione la pelicula");
        cartelera.setBounds(620,180,200,50);
        cartelera.setForeground(Color.BLACK);
        cartelera.setFont(new Font("Bookman Old Style",1,18));
        cartelera.setVisible(true);
        add(cartelera);
        JButton botonc = new JButton("Ver cartelera");
        botonc.setBounds(620,220,200,50);
        botonc.setFont(new Font("Bookman Old Style",1,18));
        botonc.setForeground(Color.BLACK);
        botonc.setContentAreaFilled(false);
        add(botonc);
        
        //Crear tabla con los datos
        
        //Boton de generar recibo
        JButton imprimir = new JButton("Generar Recibo");
        imprimir.setBounds(660,500,190,50);
        imprimir.setFont(new Font("Bookman Old Style",1,18));
        imprimir.setForeground(Color.BLACK);
        imprimir.setContentAreaFilled(false);
        add(imprimir);
        
        
        
        
        
        add(background);
        }
}
