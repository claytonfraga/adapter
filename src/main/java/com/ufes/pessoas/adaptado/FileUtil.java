package com.ufes.pessoas.adaptado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileUtil {

    public FileUtil() {
    }

    public void write(String fileName, String nome) {
        File file = new File(fileName);

        FileWriter w;
        try {
            w = new FileWriter(file, true);

            BufferedWriter bf = new BufferedWriter(w);
            bf.newLine();
            bf.write(nome);
            bf.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
