package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Exercito exercito = new Exercito("Brasil");

        Oficial oficial = new Oficial("Luiz", 1039137, null);
        oficial.setPatente("Major II");


        ItemEspecial item = new ItemEspecial("Ak-47");
        MedicoMilitar medico = new MedicoMilitar("Julia", 103317, item);
        medico.setAnosExperiencia(500);
        medico.setCapacidadeEmergencia(200);


        ItemEspecial item2 = new ItemEspecial("AWP");
        Sargento sargento = new Sargento("Pedro", 1031731, item2);
        sargento.setEspecializacao("Patente 2");
        sargento.setExperienciaCombate(300);

        exercito.addSoldado(oficial);
        exercito.addSoldado(medico);
        exercito.addSoldado(sargento);

        exercito.mostraInfo();




    }
}