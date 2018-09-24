/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augrat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Madhav Somani
 */
public class JavaGenerator {
   public static void merger(String importloc, String bodyloc , String packageName) throws FileNotFoundException, IOException{
   
        // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("AUGRAT.java"); 
        
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
        // closing resources 
        br.close(); 
        pw.close(); 
          
       
   }
}
