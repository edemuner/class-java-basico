package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;


public class Exercicio {

    public static void main(String[] args) {

        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 9);

        if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){

            vencimento.add(Calendar.DATE, 1);
        } else if
            (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            vencimento.add(Calendar.DATE, 2);

            }

        System.out.println(String.format("O dia de vencimento é %d", vencimento.get(Calendar.DATE)));
        }



    }

