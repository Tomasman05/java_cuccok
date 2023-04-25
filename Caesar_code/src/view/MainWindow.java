
package view;

import ceasarcoding.CeasarCoding;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import model.Entity;
import model.HistoryTableModel;

public class MainWindow extends JFrame{
    private final JCheckBox checkBoxIsEncode;
    private final JComboBox<Integer> comboxBoxOffset;
    private final JTextArea textAreaOutput;
    private final JTextArea textAreaInput;
    private final JButton buttonEncode;
    private List<Entity> entities;
    private final JTable tableHistory;
   
    public static void main(String[] args) {
       new MainWindow().setVisible(true);
    }
   
    private AbstractAction EncodeDecodeAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
             String input = textAreaInput.getText();
               String output;
               int offset = (int)comboxBoxOffset.getSelectedItem();
               
               if (checkBoxIsEncode.isSelected()) {
                    output = CeasarCoding.code(input, offset);
                    entities.add(new Entity(input,output));
                    
                }
               else{
                   output= CeasarCoding.deCode(input, offset);
                   entities.add(new Entity(output,input));
               }
               textAreaOutput.setText(output);
               tableHistory.invalidate();
               
        }
    };
    
    public MainWindow(){
        entities = new ArrayList<>();
        this.setTitle("Ceaser Coding");
        this.setSize(500, 200);
        //this.setResizable(false);
        JPanel panel = new JPanel();
       
        GridBagLayout gbl = new GridBagLayout();  
        gbl.columnWeights= new double[] {0.0, 1.5, 0.0, 0.0, 1.0};
        gbl.rowWeights= new double[] {1.0, 0.0};
       
        panel.setLayout(gbl);
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets = new Insets(10,5,5,5);
       
        JLabel labelInput = new JLabel("Input:");
        panel.add(labelInput, gbc);
       
        textAreaInput = new JTextArea();
        textAreaInput.setLineWrap(true);
        textAreaInput.getInputMap().put(KeyStroke.getKeyStroke("ENTER"),"encode/decode" );
        textAreaInput.getActionMap().put("encode/decode",EncodeDecodeAction);
        gbc.gridx=1;
        panel.add(new JScrollPane(textAreaInput), gbc);
       
        gbc.gridx=2;
        JLabel labelOutput = new JLabel("Output:");
        panel.add(labelOutput, gbc);
       
        textAreaOutput = new JTextArea();
        textAreaOutput.setEditable(false);
        gbc.gridx=3;
        gbc.gridwidth=2;
        textAreaOutput.setLineWrap(true);
        panel.add(new JScrollPane(textAreaOutput), gbc);
       
        checkBoxIsEncode = new JCheckBox("Encode");
        checkBoxIsEncode.setSelected(true);
       
        checkBoxIsEncode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxIsEncode.isSelected())
                {
                    buttonEncode.setText("Encode");
                }
                else {
                    buttonEncode.setText("Code");
                }
            }
            });
       
       
       
        gbc.gridy=1;
        gbc.gridx=2;
        gbc.gridwidth=1;
        panel.add(checkBoxIsEncode,gbc);
       
        Integer[] offsets = new Integer[25];
        for (int i = 0; i < offsets.length; i++) {
            offsets[i]=(i+1);
        }      
        comboxBoxOffset = new JComboBox<>(offsets);
       
        gbc.gridx=3;
        panel.add(comboxBoxOffset, gbc);
       
        buttonEncode = new JButton("Encode");
        buttonEncode.addActionListener(EncodeDecodeAction);
        gbc.gridx=4;
        gbc.fill=GridBagConstraints.NONE;
        panel.add(buttonEncode, gbc);
       
        
        JTabbedPane tabbedPaneCoding = new JTabbedPane();
        tabbedPaneCoding.add("EncodeDecode", panel);
        JPanel panelHistory = new JPanel(); 
        panelHistory.setLayout(new BorderLayout());
        tableHistory = new JTable(new HistoryTableModel(entities));
        panelHistory.add(new JScrollPane(tableHistory), BorderLayout.CENTER);
        tabbedPaneCoding.add("History",panelHistory);
        this.add(tabbedPaneCoding);
        //this.add(panel);
    }
    
    
}

