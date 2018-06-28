package usersgui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import miscgui.Results;


/**
 *
 * @author William Pruitt
 */
public class Sort implements Comparator<Sort>
{
    @Override
    public int compare(Sort t, Sort t1) {
        String name1 = t.getClass().getName();
        String name2 = t1.getClass().getName();
        return name1.compareToIgnoreCase(name2); 
    }
  public String[] nameSort(Object[] list) throws FileNotFoundException {
        File file = new File("Results.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        list = br.lines().toArray();
        String[] list1 = list.toString().split(" ");
        java.util.Arrays.sort(list);
        Results res = new Results();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        Object[] row;
        DefaultTableModel model = (DefaultTableModel) res.jTable1.getModel();
        //int i = 0;
        
      for (int i = 0; i <= list.length - 1; i++){//String string: list1){
                row = list[i].toString().split(" ");
                model.addRow(row);
               //System.out.println(Arrays.toString(list).compareTo((string)));
            }
        return list1;
  } 
  public static void main(String[] args) throws FileNotFoundException, IOException{
      File file = new File("Results.txt");
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      Object[] list =(br.lines().toArray());
      String[] list1 = list.toString().split("");
      Sort st = new Sort();
     
      st.nameSort(list);
}
}

