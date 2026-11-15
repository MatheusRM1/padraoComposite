package org.composite;

public class Gerenciador {

    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItem() {
        if (this.item == null) {
            throw new NullPointerException("Gerenciador sem item");
        }
        return this.item.getConteudo();
    }
}