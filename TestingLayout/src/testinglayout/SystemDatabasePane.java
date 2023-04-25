
package testinglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;



public class SystemDatabasePane extends JPanel{
    
    public SystemDatabasePane(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        this.setTitle("Testing");
        this.setSize(300,400);
        JPanel panel = new JPanel();
    }
}
