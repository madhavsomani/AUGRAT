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
import java.util.logging.Level;
import java.util.logging.Logger;
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
        AUGRAT.totalnooflines.setText("Total Number of Lines : " + AUGRAT.javaconsole.getLineCount());
        augratFileDelete(bodyloc);
    
        try{
           duplicateFiles(  "libs/bodyFormat.augrat",bodyloc);
        }catch (IOException ex) {
            Logger.getLogger(AUGRAT.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error in generating restoring body.augrat File!", "AUGRAT", JOptionPane.ERROR_MESSAGE);
        }
        
         try{
           duplicateFiles("libs/importFormat.augrat",importloc);
        }catch (IOException ex) {
            Logger.getLogger(AUGRAT.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error in generating restoring body.augrat File!", "AUGRAT", JOptionPane.ERROR_MESSAGE);
        }
        
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
   
   public static void augratFileDelete(String loc)
   {
        File file = new File(loc); 
          
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
   
   }
   
   public static void duplicateFiles(String loc,String target) throws IOException
    {
         // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter(target); 
        
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader(loc)); 
        String line = br.readLine(); 
          
        // loop to copy each line of files
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
        
        pw.flush(); 
        br.close(); 
        pw.close(); 
          
    }
   
   public static void duplicateStringRemove(String loc) throws IOException
    {
        // PrintWriter object for output.txt 
        PrintWriter pw = new PrintWriter(loc); 
          
        // BufferedReader object for input.txt 
        BufferedReader br1 = new BufferedReader(new FileReader(loc)); 
          
        String line1 = br1.readLine(); 
          
        // loop for each line of input.txt 
        while(line1 != null) 
        { 
            boolean flag = false; 
              
            // BufferedReader object for output.txt 
            BufferedReader br2 = new BufferedReader(new FileReader(loc)); 
              
            String line2 = br2.readLine(); 
              
            // loop for each line of output.txt 
            while(line2 != null) 
            { 
                  
                if(line1.equals(line2)) 
                { 
                    flag = true; 
                    break; 
                } 
                  
                line2 = br2.readLine(); 
              
            } 
              
            // if flag = false 
            // write line of input.txt to output.txt 
            if(!flag){ 
                pw.println(line1); 
                  
                // flushing is important here 
                pw.flush(); 
            } 
              
            line1 = br1.readLine(); 
              
        } 
          
        // closing resources 
        br1.close(); 
        pw.close(); 
          
    }
    
}
