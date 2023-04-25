import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class FormController implements ActionListener {
    private MainFrame mainFrm;
    FormController(){
        mainFrm = new MainFrame();
        setComponentsActions();
        start();
    }

    private void start(){
        mainFrm.setVisible(true);
    }

    private void setComponentsActions(){
        mainFrm.getExitBtn().addActionListener(this);
        mainFrm.getRedBtn().addActionListener(this);
        mainFrm.getBlueBtn().addActionListener(this);
        mainFrm.getGreenBtn().addActionListener(this);
        mainFrm.getBaseBtn().addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==mainFrm.getExitBtn()){
            System.exit(0);
        }
        else if(event.getSource()==mainFrm.getRedBtn()){
            mainFrm.setCenterPanel(Color.red);
        }
        else if(event.getSource()==mainFrm.getBlueBtn()){
            mainFrm.setCenterPanel(Color.blue);
        }
        else if(event.getSource()==mainFrm.getGreenBtn()){
            mainFrm.setCenterPanel(Color.green);
        }
        else if(event.getSource()==mainFrm.getBaseBtn()){
            mainFrm.setCenterPanel(Color.black);
        }
    }
}
