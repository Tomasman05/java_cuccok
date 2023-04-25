import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    
    private JButton exitBtn;
    private JLabel resultLbl;
    private JTextField radiusTf;
    private JButton calcBtn;

    MainFrame() {

        initComponents();
    }

    private void initComponents() {

        this.setSize( 300, 200 );
        this.setTitle( "Kör kerület" );
        this.setDefaultCloseOperation( DO_NOTHING_ON_CLOSE  );
        this.setLayout( new GridLayout( 1, 1 ) );

        JPanel mainPnl = new JPanel();
        mainPnl.setLayout( new BorderLayout() );

        JPanel northPnl = new JPanel();
        northPnl.setSize( 300, 10 );
        mainPnl.add( northPnl, BorderLayout.NORTH );

        JPanel eastPnl = new JPanel();
        eastPnl.setSize( 10, 140 );
        mainPnl.add( eastPnl, BorderLayout.EAST );

        JPanel westPnl = new JPanel();
        westPnl.setSize( 10, 140 );
        mainPnl.add(westPnl, BorderLayout.WEST );

        JPanel southPnl = new JPanel();
        southPnl.setSize( 300, 30 );
        southPnl.setLayout( new FlowLayout( FlowLayout.RIGHT ));
        exitBtn = new JButton( "Kilépés" );
        southPnl.add( exitBtn );
        mainPnl.add( southPnl, BorderLayout.SOUTH );

        JPanel centerPnl = new JPanel();
        centerPnl.setLayout( new GridLayout( 3, 2 ));
        JPanel pnl1_1 = new JPanel();
        JPanel pnl1_2 = new JPanel();
        JPanel pnl2_1 = new JPanel();
        JPanel pnl2_2 = new JPanel();
        JPanel pnl3_1 = new JPanel();
        JPanel pnl3_2 = new JPanel();
        
        JLabel textLbl = new JLabel( "Sugár: " );
        pnl1_1.setLayout( new FlowLayout( FlowLayout.RIGHT ));
        pnl1_1.add( textLbl );
        centerPnl.add( pnl1_1 );

        radiusTf = new JTextField(10);
        pnl1_2.setLayout( new FlowLayout( FlowLayout.LEFT ));
        pnl1_2.add( radiusTf );
        centerPnl.add( pnl1_2 );

        centerPnl.add( pnl2_1 );
        calcBtn = new JButton( "Számít" );
        pnl2_2.setLayout( new FlowLayout( FlowLayout.LEFT ));
        pnl2_2.add( calcBtn );

        centerPnl.add( pnl2_2 );
        centerPnl.add( pnl3_1 );

        resultLbl = new JLabel( "Eredmény" );
        pnl3_2.setLayout( new FlowLayout( FlowLayout.LEFT ));
        pnl3_2.add( resultLbl );
        centerPnl.add( pnl3_2 );

        mainPnl.add( centerPnl, BorderLayout.CENTER );
        this.add( mainPnl );
    }

    public JButton getExitBtn() { return exitBtn; }
    public JButton getCalcBtn() { return calcBtn; }
    public JTextField getRadiusTf() { return radiusTf; }
    public void setRadiusTf( String text ) { radiusTf.setText( text ); }
    public void setResultLbl( String text ) { resultLbl.setText( text ); }
}