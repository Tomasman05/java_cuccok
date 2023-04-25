import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainFrame extends JFrame{
    private JLabel resultLbl;
    private JTextField inputTf;
    private JButton calcBtn;
    MainFrame(){
        super("Duplázó");
        initComponents();
    }
    private void initComponents(){
        this.setSize(400,300);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel inputLbl= new JLabel();
        inputLbl.setBounds(100, 50, 50, 25);
        inputLbl = new JLabel("Szám: ");

        inputTf= new JTextField(10);
        inputTf.setBounds(155, 50, 100, 25);

        calcBtn = new JButton("Számít");
        calcBtn.setBounds(100, 85, 80, 25);

        JLabel resLbl = new JLabel("Eredmény: ");
        resLbl.setBounds(100, 110, 100, 25);
        resLbl = new JLabel();

        resultLbl = new JLabel();
        resultLbl.setBounds(210, 113, 100, 25);

        this.add(inputLbl);
        this.add(inputTf);
        this.add(calcBtn);
        this.add(resLbl);
        this.add(resultLbl);
    }
    public JButton getCalcBtn(){return calcBtn;}
    public JTextField getInputTf(){return inputTf;}

    public void setResultLbl(String result){resultLbl.setText(result);}
}
