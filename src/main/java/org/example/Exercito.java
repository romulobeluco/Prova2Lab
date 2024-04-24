package org.example;

public class Exercito {

    private String nome;

    Soldado soldados[];

    public Exercito(String nome){
        this.nome=nome;
        soldados=new Soldado[10];


    }
public void addSoldado(Soldado s){
        for(int i=0;i< soldados.length;i++)
        {
            if(soldados[i]==null)
            {
                soldados[i]=s;
                break;
            }
        }
}
public void mostraInfo()
{
    System.out.println("Soldados");
    System.out.println("-------------------");
for(int i=0;i< soldados.length;i++) {

    if(soldados[i]!=null){
        System.out.println();
        if(soldados[i] instanceof Sargento){
            Sargento sargento= (Sargento) soldados[i];

            sargento.defender();
            sargento.usandoItem();
            soldados[i].mostraInfo();


        }
        else if(soldados[i] instanceof MedicoMilitar){
            MedicoMilitar medicoMilitar =(MedicoMilitar)  soldados[i];

            medicoMilitar.usandoItem();
            medicoMilitar.curar();
            soldados[i].mostraInfo();

        }
        else if(soldados[i] instanceof Oficial){
            Oficial oficial =(Oficial) soldados[i];

            oficial.defender();
            oficial.usandoItem();
            soldados[i].mostraInfo();

        }


    }

}
    System.out.println("------------------------");
    System.out.println("Quantidade de soldados igual a "+Soldado.qtdSoldado);
}

}
