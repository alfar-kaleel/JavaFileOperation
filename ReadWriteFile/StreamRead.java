/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author alfar
 */
public class StreamRead {
    
    public static void main (String [] args) throws IOException{
    
    FileRead();
    
    }

    private static void FileRead() throws IOException {
        
        FileInputStream inputStream       = new FileInputStream("/users/alfar/sample.txt");
        Reader inputStreamReader = new InputStreamReader(inputStream);

 int ascii;
        
        while((ascii = inputStreamReader.read()) != -1){
    
        System.out.print((char) ascii);
      }

inputStream.close();
inputStreamReader.close();
        
        
    }
    
    
}
