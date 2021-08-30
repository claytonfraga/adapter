package com.ufes.pessoas.adaptado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class XMLWriter {

    File file;

    public XMLWriter(String fileName) {
        file = new File(fileName);
    }

    public void store(String nome) {
        FileWriter w;
        try {
            w = new FileWriter(file, true);
            BufferedWriter bf = new BufferedWriter(w);
            bf.newLine();
            bf.write("<nome>" + nome + "</nome>");
            bf.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
