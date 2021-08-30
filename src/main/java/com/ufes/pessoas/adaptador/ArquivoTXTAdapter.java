package com.ufes.pessoas.adaptador;

import com.ufes.pessoas.model.Pessoa;
import com.ufes.pessoas.adaptado.FileUtil;

public class ArquivoTXTAdapter implements IArquivoAdapter {

    FileUtil arquivo = new FileUtil();
    String nomeArquivo;

    public ArquivoTXTAdapter(String nomeArquivo) {
        if (!nomeArquivo.toLowerCase().endsWith("txt")) {
            throw new RuntimeException("Informe um arquivo TXT válido");
        }
        arquivo = new FileUtil();
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void gravar(Pessoa pessoa) {
        arquivo.write(this.nomeArquivo, pessoa.getNome());
    }

}
