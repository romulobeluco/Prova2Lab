package org.example;

public class MedicoMilitar extends Soldado implements Curar{

    private int anosExperiencia;
    private int capacidadeEmergencia;

    public MedicoMilitar(String nome, long cpf, ItemEspecial item) {
        super(nome, cpf, item);
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Anos de experiencia: "+this.anosExperiencia);
        System.out.println("Capacidade de Emergencia "+this.capacidadeEmergencia);
    }
    public void setCapacidadeEmergencia(int capacidadeEmergencia) {
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    public void usandoItem() {

        if(item!=null)
            capacidadeEmergencia=capacidadeEmergencia+100;



    }


    @Override
    public void curar() {
        if(capacidadeEmergencia>920){
            System.out.println("Curando...");
        }

    }
}
