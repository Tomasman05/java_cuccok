import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormControl implements ActionListener{
    private MainFrame mainfrm;
    FormControl(){
        mainfrm = new MainFrame();
        mainfrm.setVisible(true);
        mainfrm.getExitBtn().addActionListener(this);
        mainfrm.getCalcBtn().addActionListener(this);
    }

    private void exit(){
        System.exit(0);
    }
    private void calculate(){
        Double radius = Double.parseDouble(mainfrm.getRadiusTf().getText());
        Double result = Math.pow(radius,2)*Math.PI;
        String resultStr = String.valueOf(result);
        mainfrm.setResultLbl(resultStr);
        mainfrm.setRadiusTf("");
    }

    @Override
    public void actionPerformed (ActionEvent event){
        if(event.getSource()==mainfrm.getExitBtn()){
            exit();
        }
        else if (event.getSource() == mainfrm.getCalcBtn()){
            calculate();
        }
    }
}
