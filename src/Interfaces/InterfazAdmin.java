
package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

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
        
        
        
        
        
        }
}
    