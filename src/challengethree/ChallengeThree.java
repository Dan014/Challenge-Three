/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengethree;

import java.util.Arrays;

/**
 *
 * @author DANIEL GARCIA
 */
public class ChallengeThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {5, 7, 1, 1, 2, 3, 22};
        //int[] nums = {1, 1, 1, 1, 1};
        //int[] nums = {1, 5, 1, 1, 1, 10, 15, 20, 100};

        changeNotAvailable(nums);
        System.out.println("Resultado--> " + changeNotAvailable(nums));
    }

    /**
     * La función changeNotAvailable toma un arreglo de enteros coins como
     * entrada y devuelve un entero que representa la cantidad mínima de cambio
     * que no se puede crear utilizando las monedas dadas.
     *
     * @param coins lista de numeros enteros que representan las monedas
     * @return la cantidad mínima de cambio que no se puede crear utilizando las
     * monedas dadas
     */
    public static int changeNotAvailable(int[] coins) {
        Arrays.sort(coins);//Ordena el arreglo coins en orden ascendente
        int currentValue = 0;//Inicializa la variable currentValue a 0. Esta variable se utiliza para realizar un seguimiento del valor del cambio actual que se puede crear utilizando las monedas dadas
        for (int coin : coins) {//Recorre cada elemento en el arreglo coins. Cada elemento se almacena en la variable coin para su procesamiento.
            if (coin > currentValue + 1) {// se verifica si el valor de la moneda actual coin es mayor que el valor actual del cambio currentValue más 1. Si es así, significa que no se puede crear el cambio currentValue + 1 utilizando las monedas disponibles.
                return currentValue + 1;//En este caso, el método devuelve currentValue + 1
            }
            currentValue += coin;//Si la moneda actual coin se puede usar para crear el cambio actual, su valor se agrega al valor actual del cambio currentValue
        }
        return currentValue + 1;//Si se recorren todas las monedas sin encontrar una cantidad de cambio que no se pueda crear, el método devuelve currentValue más 1
    }

}
