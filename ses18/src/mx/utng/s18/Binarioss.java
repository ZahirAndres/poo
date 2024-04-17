package mx.utng.s18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Binarioss {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\mx\\utng\\s18\\image.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\mx\\utng\\s18\\copia_image.png"));
        byte[] buffer = new byte[1024];
        int byteLeidos = 0;
        while ((byteLeidos = bis.read(buffer))>0) {
            bos.write(buffer, 0, byteLeidos);
        }
        bis.close();
        bos.close();
    }
}
