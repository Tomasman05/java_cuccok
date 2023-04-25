import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    private JPanel centerPnl;
    private JButton exitBtn;
    private JButton redBtn;
    private JButton blueBtn;
    private JButton greenBtn;
    private JButton baseBtn;
    

    MainFrame(){
        

        initComponents();

    }
   private void initComponents(){
        this.setSize(400, 300);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Szöveg másolás");
        this.setIconImage(new ImageIcon("src/mario.png").getImage());
        this.setLayout(new GridLayout(1,1));
        

        JPanel mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());
        this.add(mainPnl);
        
        JPanel northPnl = new JPanel();
        northPnl.setSize(400, 30);
        northPnl.setBackground(Color.pink);
        mainPnl.add(northPnl, BorderLayout.NORTH);
    
        JPanel eastPnl = new JPanel();
        eastPnl.setSize(30,240);
        eastPnl.setBackground(Color.pink);
        mainPnl.add(eastPnl, BorderLayout.EAST);
        
        JPanel westPnl = new JPanel();
        westPnl.setSize(30,240);
        westPnl.setBackground(Color.pink);
        mainPnl.add(westPnl, BorderLayout.WEST);

        JPanel southPnl = new JPanel();
        southPnl.setSize(400, 30);
        southPnl.setBackground(Color.pink);
        baseBtn = new JButton("Alaphelyzet");
        redBtn = new JButton("Piros");
        greenBtn = new JButton("Zöld");
        blueBtn = new JButton("Kék");
        exitBtn = new JButton("Kilépés");
        southPnl.setLayout(new FlowLayout(FlowLayout.CENTER));
        southPnl.add(redBtn);
        southPnl.add(blueBtn);
        southPnl.add(greenBtn);
        southPnl.add(baseBtn);
        southPnl.add(exitBtn);
        mainPnl.add(southPnl, BorderLayout.SOUTH);

        centerPnl = new JPanel();
        centerPnl.setBackground(Color.black);
        mainPnl.add(centerPnl, BorderLayout.CENTER);
   }
   public void setCenterPanel(Color color){
        centerPnl.setBackground(color);
   }
   public JButton getExitBtn(){return exitBtn;}
   public JButton getRedBtn(){return redBtn;}
   public JButton getBlueBtn(){return blueBtn;}
   public JButton getGreenBtn(){return greenBtn;}
   public JButton getBaseBtn(){return baseBtn;}
}
