package org.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Item {

    private List<Item> itens;

    public Pasta(String nome) {
        super(nome);
        this.itens = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Pasta: " + this.getNome() + "\n";
        for (Item item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }
}