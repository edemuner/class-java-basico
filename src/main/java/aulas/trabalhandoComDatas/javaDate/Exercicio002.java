package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exercicio002 {

    public static void main(String[] args) {

        Date nascimento = new Date(659152800000L);

        System.out.println(nascimento);

        Date dataComp = new Date(1273881600L);

        int comp = nascimento.compareTo(dataComp);

        switch (comp){
            case 1:
                System.out.println("A data informada é anterior a 15 de maio de 2010");
                break;
            case 0:
                System.out.println("A data informada é 15 de maio de 2010");
                break;
            case -1:
                System.out.println("A data informada é posterior a 15 de maio de 2010");
                break;
        }

    }
}
