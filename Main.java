package com.company;

import java.util.Scanner;

public class Main {

    public static float Oplata(int kolnedelprosr, float stoimost, float procent) {
        float dolg = stoimost;
        for (int i = 1; i < kolnedelprosr; i++)
            dolg = dolg * (1 + procent);
        return dolg;
    }

    public static float Oplata(int koltem, int prosrtem, float proc, float stoimost) {
        float zarab, itogo = 0;
        for (int i = 0; i < koltem; i++) {
            zarab = stoimost;
            for (int j = 0; j < prosrtem - i; j++)
                zarab = zarab * (1 + proc);
            //   System.out.println(zarab);
            itogo = itogo + zarab;
        }
        return itogo;
    }

    public static float Oplata(int koltem, int prosrtem, float proc, float stoimost, int stud, int nestud) {
        float zarab = 0, itogo = 0;
        for (int i = 0; i < koltem; i++) {
            zarab = stoimost;
            for (int j = 0; j < prosrtem - i; j++)
                zarab = zarab * (1 + proc);
            //   System.out.println(zarab);
            itogo = itogo + zarab;

        }
        itogo = nestud * itogo;
        for (int i = 0; i < stud - nestud; i++)
            itogo = itogo + zarab;
        return itogo;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite stoimost proverki raboti");
        float stoimost = in.nextFloat();
        System.out.println("Vvedite kolichestvo nedel prosrochki");
        int kolnedel = in.nextInt();
        System.out.println("Vvedite procent stavki");
        float proc = in.nextFloat();
        System.out.println("просрочит сдачу одной темы на T недель: Штраф - ");
        float zad1 = Oplata(kolnedel, stoimost, proc);
        System.out.println(zad1);
        System.out.println("Сколько всего тем");
        int koltem = in.nextInt();
        System.out.println("Skolko tem prosrocheno");
        int prosrtem = in.nextInt();
        float zad2 = Oplata(koltem, prosrtem, proc, stoimost);
        System.out.println("просрочит сдачу N = " + prosrtem + "из M = " + koltem + " тем на Y = " + kolnedel + " недель каждая, Итого к оплате->  " + zad2);
        float zad3 = Oplata(koltem, koltem, proc, stoimost);
        System.out.println("просрочит сдачу N = " + koltem + " = M = " + koltem + " тем на Y = " + kolnedel + " недель каждая, Итого к оплате->  " + zad3);
        System.out.println("Kolichestvo studentov:");
        int stud = in.nextInt();
        System.out.println("Kolichestvo plohih studentov:");
        int nestud = in.nextInt();
        float zad5 = Oplata(koltem, prosrtem, proc, stoimost, stud, nestud);
        System.out.println("Oplata za vseh studentov = " + zad5);
    }
}
