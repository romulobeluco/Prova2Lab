package org.example;

public abstract  class Soldado {

    public static int qtdSoldado;
public int id;
    private String nome;
    private long cpf;
ItemEspecial item;

    public Soldado(String nome, long cpf, ItemEspecial item) {
        this.nome = nome;
        this.cpf = cpf;
        this.item = item;
        qtdSoldado++;
        id=qtdSoldado;
    }

    public String getNome() {
        return nome;
    }

    public void mostraInfo(){

        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        if(item!=null)
        System.out.println("Arma: "+item.tipo);

    }
public abstract void usandoItem();





}
