/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author alfar
 */
public class Readuppercase extends BufferedReader {
    
    
    
    
public Readuppercase(Reader reader) {
super(reader);

}



@Override
public int read() throws IOException{

int ascii = super.read();

if (ascii >96 && ascii <123){

ascii = ascii - 32;


}


return ascii;
}



public static void main(String [] args) throws IOException {


String fileName = "/users/alfar/sample.txt";

int character;



FileReader fileReader = new FileReader(fileName);


Readuppercase uppercaseReader = new Readuppercase(fileReader);

while((character = uppercaseReader.read()) != -1) {
System.out.print((char)character);

}

fileReader.close();
uppercaseReader.close();



}

}
    
