
package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class InterfazAdmin extends JFrame{
    
                public JPanel panel;
                public JLabel text;
        public InterfazAdmin() {
            
         
            
            
        this.setSize(500, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("T-REX INTERFAZ USUARIO ");
        setMinimumSize(new Dimension(500, 700));
        
        panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
       

    }
}
    