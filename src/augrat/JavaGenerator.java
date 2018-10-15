/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augrat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Madhav Somani
 */
public class JavaGenerator {
   public static void merger(String importloc, String bodyloc , String packageName) throws FileNotFoundException, IOException{
   
        // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("Augrat.java"); 
        
        //setPacakge Name
        pw.println("package " + packageName + ";"); 
        
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader(importloc)); 
        String line = br.readLine(); 
          
        // loop to copy each line of files
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
        
        
        br = new BufferedReader(new FileReader(bodyloc)); 
          
        line = br.readLine(); 
        // loop to copy each line of  
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
        
        pw.flush(); 
        br.close(); 
        pw.close(); 
          
        readAugratfile();
        JOptionPane.showMessageDialog(null,"Augrat.java Successfully generated!");
   }
   
   public static void readAugratfile() throws IOException
   {
  
        // Reading  Augrat java file 
         AUGRAT.javaconsole.setText("");
         List<String> lines = Files.readAllLines(new File("Augrat.java").toPath());
         for(int i=0;i<lines.size();i++)
         {
            AUGRAT.javaconsole.append(lines.get(i));
             AUGRAT.javaconsole.append("\n");
         }
   }
   
}
