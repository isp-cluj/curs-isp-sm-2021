/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs7.files;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author mihai.hulea
 */
public class Teste {
    public static void main(String[] args) throws IOException {
        
            FilesAndFoldersUtil.createFolder("c:\\satu-mare");
        
            List<String> files = FilesAndFoldersUtil.getFilesInFolder("c:\\_trucks");
            
            for(String s: files)
                System.out.println(s);
            
            
            FileWriteUtil.writeUsingFileWriter("Linia1 1", "c:\\satu-mare\\test.txt");
            
//        FilesAndFoldersUtil.createFolder("tmp");
//        FilesAndFoldersUtil.getFilesInFolder("tmp").stream().forEach(s->System.out.println(s));
//        FileWriteUtil.writeUsingFiles("Line 1", "tmp\\test1.txt");
//        FileReadUtil.readAllFileLines("tmp\\test1.txt").stream().forEach(System.out::println); //method refferece
//        
//        
//        FilesAndFoldersUtil.createFolder("c:\\_tmp");
//        
        
    }
   
}
