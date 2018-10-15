/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augrat;

import static augrat.JavaGenerator.readAugratfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FuseEngine {
    
    public static void bugFusion(String bodyloc, String importloc ,JsonBugBlockModels model) throws IOException
    {
          // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("libs/body.augrat"); 
        PrintWriter px = new PrintWriter("libs/import.augrat");
        
        //setPacakge Name
       // pw.println("package " + packageName + ";"); 
        
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader(bodyloc)); 
        String line = br.readLine(); 
          
        // loop to copy each line of files
        while (line != null) 
        { 
            pw.println(line); 
                //Adding bug method calls in body.augrat from BugBlock
                if(line.contains("<<!@AUGRAT Constructor Index@!>>"))
                {
                      pw.println("  "+model.methodName);
                }
                
                 //Adding bug method body in body.augrat from BugBlock
                if(line.contains("<<!@AUGRAT Method Index@!>>"))
                {
                    try{
                        for(int i = 0 ; i < model.bugBlock.size(); i++)
                        {
                          pw.println("  "+ model.bugBlock.get(i));
                        }
                    }finally{
                          pw.println("\n");
                    }
                }
            line = br.readLine(); 
        } 
        
        
        br = new BufferedReader(new FileReader(importloc)); 
          
        line = br.readLine(); 
        // loop to copy each line of  
        while(line != null) 
        { 
            px.println(line); 
            line = br.readLine(); 
        } 
        
         //Adding bug Headers body in import.augrat from BugBlock
         for(int i = 0 ; i < model.headers.size(); i++)
          {
              px.println("import "+model.headers.get(i));
          }
        
        pw.flush(); 
        px.flush();
        br.close(); 
        pw.close(); 
        px.close();
          
       
        JOptionPane.showMessageDialog(null,model.nameOfBug + " Successfully Added!");
    }
    
    public static void duplicateRemove(String loc) throws IOException
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
