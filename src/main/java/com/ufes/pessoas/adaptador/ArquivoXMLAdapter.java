package com.ufes.pessoas.adaptador;

import com.ufes.pessoas.model.Pessoa;
import com.ufes.pessoas.adaptado.XMLWriter;

public class ArquivoXMLAdapter implements IArquivoAdapter {

    private final XMLWriter xml;

    public ArquivoXMLAdapter(String nomeArquivo) {
        if (!nomeArquivo.toLowerCase().endsWith("xml")) {
            throw new RuntimeException("Informe um arquivo XML válido");
        }
        xml = new XMLWriter(nomeArquivo);
    }

    @Override
    public void gravar(Pessoa pessoa) {
        xml.store(pessoa.getNome());
    }

}
