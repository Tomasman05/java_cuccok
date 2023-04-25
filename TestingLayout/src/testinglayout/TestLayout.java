
package testinglayout;

import javax.swing.JFrame;


public class TestLayout {

    public TestLayout(){
        JFrame frame = new JFrame();
        frame.add(SystemDatabasePane());
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TestLayout();
    }

    
}
    
