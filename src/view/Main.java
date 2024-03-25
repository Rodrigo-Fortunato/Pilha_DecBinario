package view;

import controller.ConverterController;
import model.Pilha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConverterController converte = new  ConverterController();
        Scanner scan = new Scanner(System.in);
        boolean noLimite = false;
        int decimal=0;

        while (!noLimite){
            System.out.println("Digite um número decimal, limitado a 1000: ");
            decimal= scan.nextInt();
            if (decimal <=1000 && decimal >=0){
                noLimite = true;
            }
        }


        try {
            System.out.println( converte.decToBin(decimal));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
