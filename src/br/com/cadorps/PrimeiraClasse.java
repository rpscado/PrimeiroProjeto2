package br.com.cadorps;

public class PrimeiraClasse {
    public static void main(String[] args) {
        String varText = args[0];

        if (varText.equals("Brasil")) {
            System.out.print("O melhor pais do mundo");
        } else if (varText.equals("Argentina")){
            System.out.print("Los Ermanos.");
        } else {
            System.out.print("Pais como " + varText + " precisa melhorar.");
        }

        //System.out.print(varText);

        //System.out.print("Brasil");
    }
}
