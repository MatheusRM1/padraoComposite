package org.composite;

public class Arquivo extends Item {

    private String extensao;

    public Arquivo(String nome, String extensao) {
        super(nome);
        this.extensao = extensao;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String getConteudo() {
        return "Arquivo: " + this.getNome() + "." + this.extensao + "\n";
    }
