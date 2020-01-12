/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author alfar
 */
public class Readfile {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       fileReader();    
       
    }
    
    
    static void fileReader() throws IOException{
    
    FileReader fileReader = new FileReader("/users/alfar/sample.txt");
    
    BufferedReader bufferedReader = new BufferedReader(fileReader);
     
    
    int ascii;
    
    while((ascii = bufferedReader.read()) != -1){
    
        System.out.print((char) ascii);
      }
   
 
    bufferedReader.close();
    
    
    }
    
    
    
}
