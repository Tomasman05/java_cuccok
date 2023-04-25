
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class HistoryTableModel extends AbstractTableModel{
    private final List<Entity> lista;
    private final String [] oszlopNev= new String []{"Plain text", "Encoded text"};
    
    
    public HistoryTableModel(List<Entity> lista) {
        this.lista = lista;
    }

    @Override
    public String getColumnName(int column) {
       return oszlopNev[column];
    }

    @Override
    public int getRowCount() {
       return lista.size();
    }

    
    @Override
    public int getColumnCount() {
       return oszlopNev.length; 
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Entity entity = lista.get(rowIndex);
        if (columnIndex==0) {
            return entity.getPlainText();
        }
        else{return entity.getEncodedText();}
    }
    
    
}
