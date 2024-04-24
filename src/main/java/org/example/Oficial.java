package org.example;

import org.w3c.dom.ls.LSOutput;

public class Oficial extends Soldado implements Defesa {

    private String patente;

    public Oficial(String nome, long cpf, ItemEspecial item) {
        super(nome, cpf, item);
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Patente: " + this.patente);

    }

    @Override
    public void usandoItem() {
        System.out.println(this.getNome() + " usando item");
    }


    @Override
    public void defender() {
        if (item == null)
            System.out.println(this.getNome() + " nao consegue se defender");

    else

    {
        System.out.println(this.getNome() + " nao se defendeu");
    }
}
}
