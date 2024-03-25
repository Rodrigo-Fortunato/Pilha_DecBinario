package controller;

import model.Pilha;

public class ConverterController {
    static String testestring="";
    Pilha pInt = new Pilha();


    public ConverterController(){
        super();
    }
    public String decToBin(int decimal) throws Exception {
        if (decimal >= 2) {
            pInt.push(decimal % 2);
            return decToBin(decimal / 2);
        }
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(decimal);

        while (!pInt.isEmpty()){
            strBuilder.append(pInt.pop());
        }

        return strBuilder.toString();
    }
}
