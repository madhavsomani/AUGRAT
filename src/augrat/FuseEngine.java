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
        
        BufferedReader br = new BufferedReader(new FileReader(bodyloc)); 
        String line = br.readLine(); 
      
        while (line != null) 
        { 
            pw.println(line); 
                //Adding bug method calls in body.augrat from BugBlock
                if(line.contains("<<!@AUGRAT Constructor Index@!>>"))
                {
                      pw.println("          "+model.methodName);
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
              px.println("import "+model.headers.get(i)+";");
          }
        
        pw.flush(); 
        px.flush();
        br.close(); 
        pw.close(); 
        px.close();
          
       
        JOptionPane.showMessageDialog(null,model.nameOfBug + " Successfully Added!");
    }
    
    
    
}
