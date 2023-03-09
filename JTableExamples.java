import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class JTableExamples {
   
    JFrame f;
    
    JTable j;
 
    
    JTableExamples()
    {
        
        f = new JFrame();
 
        
        f.setTitle("JTable Example");
 
        
        String[][] data = {
            
            {"Prateek", "105", "CSE" },
            {"Sanskar","132","CSE"},
            {"Shubham","147","CSE"},
            {"Suryansh","159","CSE"},
            {"Utkarsh Pathak", "170", "CSE" }
            
        };
 
        
        String[] columnNames = { "Student Name", "USN", "Branch" };
 
        
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        
        f.setSize(500, 200);
        
        f.setVisible(true);
    }
 
    
    public static void main(String[] args)
    {
        new JTableExamples();
    }
}