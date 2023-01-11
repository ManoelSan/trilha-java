package arrays;

import java.util.Vector;

// Crie um vetor de 6 números inteiros
// e mostre-os na orem inversa.
public class Exerc01_OrdenInversa {
    public static void main(String[] args)
    {
        int[] vetor = {5, -7, 15, 30, 2, 19};

        System.out.println("vetor: ");
        int count = 0;
        while(count < (vetor.length))//tamanho do vetor
        {
            System.out.println(vetor[count] + " ");
            count ++;
        }

        System.out.println("\n Vector: ");
        for(int i = (vetor.length - 1); i >= 0; i --)//inverte o ordem do vetor
        {
            System.out.println(vetor[i] + " ");
        }

    }
    
}
