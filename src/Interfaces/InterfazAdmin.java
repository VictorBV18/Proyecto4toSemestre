
package Interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class InterfazAdmin extends JFrame{
    
        public InterfazAdmin() {
            
        this.setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("( ◕▿◕ ) Administrador T-REX");
        setMinimumSize(new Dimension(500, 700));
        
    }
        private void components(){
         
        //Fondo del panel    
        JPanel fondoAdmin = new JPanel();
        fondoAdmin.setSize(900, 600);
        ImageIcon imageIcon = new ImageIcon("AdminF.png");
        Image image = imageIcon.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(image));
        background.setBounds(0, 0, fondoAdmin.getWidth(), fondoAdmin.getHeight());
        add(background);
        fondoAdmin.setLayout(null);
        
        //Etiqueta de interfaz
        JLabel titulo = new JLabel("T-Rex CRUD movies");
        titulo.setBounds(280, 40, 400, 30);
        titulo.setFont(new Font("Bookman Old Style", 1, 28));
        titulo.setForeground(new Color(39, 55, 70));
        add(titulo);
        
        //Crear tabla
        DefaultTableModel modelo = new DefaultTableModel();
        JTable peliculas = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(peliculas);
        scrollPane.setBounds(70, 180, 750, 260);
        add(scrollPane);
        //Se agregan las columnas
        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Genero");
        modelo.addColumn("Duracion");
        modelo.addColumn("Director");
        modelo.addColumn("Año");
        peliculas.setModel(modelo);
        
        //Botones de agregar, borrar y actualizar       
        JButton agregar = new JButton("Agregar");
        agregar.setBounds(200, 500, 130, 40);
        agregar.setFont(new Font("Bookman Old Style",1,14));
        agregar.setForeground(Color.BLACK);
        agregar.setOpaque(true);
        agregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        agregar.setBackground(new Color(195, 155, 211 ));
        add(agregar);

        JButton borrar = new JButton("Borrar");
        borrar.setBounds(400, 500, 130, 40);
        borrar.setFont(new Font("Bookman Old Style",1,14));
        borrar.setForeground(Color.BLACK);
        borrar.setOpaque(true);
        borrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        borrar.setBackground(new Color(245, 183, 177 ));
        add(borrar);

        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(600, 500, 130, 40);
        actualizar.setFont(new Font("Bookman Old Style",1,14));
        actualizar.setForeground(Color.BLACK);
        actualizar.setOpaque(true);
        actualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        actualizar.setBackground(new Color(169, 223, 191  ));
        add(actualizar);
        
        //Se agrega la accion de cada boton
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // agregarP();
            }
        });

        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //borrarP();
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //actualizarP();
            }
        });
        
        }
        
}
    