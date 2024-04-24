package org.example;

public class Sargento extends Soldado implements Defesa {

    private String especializacao;
    private int experienciaCombate;


    public Sargento(String nome, long cpf, ItemEspecial item) {
        super(nome, cpf, item);
    }

    public void setExperienciaCombate(int experienciaCombate) {
        this.experienciaCombate = experienciaCombate;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Experiencia de combate: "+this.experienciaCombate);
        System.out.println("Especializacao: "+this.especializacao);
    }

    @Override
    public void usandoItem() {

        if (item == null)
            System.out.println(getNome() + " nao tem item especial para utilizar");
        else {
            System.out.println(getNome() + " utilizando item especial");
            experienciaCombate = experienciaCombate + 300;

        }

    }

    @Override
    public void defender() {
        if (experienciaCombate > 650) {
            System.out.println(this.getNome() + " conseguiu se defender");
        } else {
            System.out.println(this.getNome() + " nao conseguiu se defender");
        }
    }
}
