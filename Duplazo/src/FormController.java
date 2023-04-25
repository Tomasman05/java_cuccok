public class FormController {
    private MainFrame mainFrm;
    FormController(){
        mainFrm= new MainFrame();
        //setComponentsActions();
        
        start();
    }
    private void start(){
        mainFrm.setVisible(true);

    }
}
