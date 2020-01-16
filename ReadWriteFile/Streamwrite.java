/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


/**
 *
 * @author alfar
 */
public class Streamwrite {
    
    
    public static void main (String [] args) throws IOException{
    
      fileWriter();
    
    }

    private static void fileWriter() throws IOException {
       
        OutputStream outputStream = new FileOutputStream("/users/alfar/sample.txt");
OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

outputStreamWriter.write("Writing this paragraph as a stream");

outputStreamWriter.close();
        
        
        
    }
    
}
