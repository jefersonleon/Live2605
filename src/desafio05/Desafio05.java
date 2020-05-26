package desafio05;

/**
 *
 * @author Jeferson Leon
 */
public class Desafio05 {

    /*
    Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé 
    tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo
    que calcule e imprima quantos anos serão necessários para que Zé seja 
    maior que Chico
     */
    public static void main(String[] args) {

        int chico, ze, anos;
        chico = 150; ze = 110; anos = 0;
        while(chico > ze){
            chico += 2; //chico=chico+2;
            ze +=  3; // ze=ze+2;
            anos++; //anos=anos+1;
        }
        System.out.println("Ze levou "+anos+" anos para ficar maior que Chico" );
        double c, z, a;
        c = 1.5; z = 1.1; a = 0;
        while(c>z){
            c+=0.02;
            z+=0.03;
            a++;
        }
        System.out.println("Ze levou "+a+" anos para ficar maior que Chico" );
    }

}
