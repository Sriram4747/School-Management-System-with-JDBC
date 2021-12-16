package my.contacteditor;

import java.io.ByteArrayOutputStream;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author shrir
 */
public class OStream {
    static FloatSum f2;
    OStream(FloatSum fs) {
        f2=fs;
    }
            
    
    public static void main(String[] args)throws IOException, FileNotFoundException {
        
        FileOutputStream fout=new FileOutputStream("D:\\ps.txt");
        FileInputStream f1=new FileInputStream("D:\\os.txt");
        f1.read();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(f2);
    }

    
    
}

