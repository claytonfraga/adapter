package com.ufes.pessoas;

import com.ufes.pessoas.adaptador.ArquivoTXTAdapter;
import com.ufes.pessoas.adaptador.ArquivoXMLAdapter;
import com.ufes.pessoas.adaptador.IArquivoAdapter;
import com.ufes.pessoas.model.Pessoa;

public class Principal {

    public static void main(String[] args) throws Exception {
        IArquivoAdapter serializador;

        serializador = new ArquivoTXTAdapter("src/main/resources/pessoas.txt");
        serializador.gravar(new Pessoa("Fulano de tal"));

        serializador = new ArquivoXMLAdapter("src/main/resources/pessoas.xml");

        serializador.gravar(new Pessoa("Fulano de tal"));
    }

}
