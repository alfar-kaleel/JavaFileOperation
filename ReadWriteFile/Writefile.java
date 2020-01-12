/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alfar
 */
public class Writefile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
       fileWriter();
        
    }
    
    
    
    static void fileWriter() throws IOException{
    
      FileWriter fileWriter = new FileWriter("/users/alfar/sample.txt");
      
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      
      bufferedWriter.write("this is my first file writing appplication " );
      
      bufferedWriter.newLine();
      
      bufferedWriter.write("welcome");
      
      bufferedWriter.close();
    
    }
    
}
