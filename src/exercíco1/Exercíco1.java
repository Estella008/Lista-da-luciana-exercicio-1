package exercíco1;

import java.util.Scanner;

public class Exercíco1 {
//aquilesssssssssssss
   
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);       
        
        System.out.println("Insira o tamanho do vetor");
        int tamanho= teclado.nextInt(); 
        int vet[]= new int[tamanho];
        System.out.println("insira os elementos do vetor:");
        for(int i=0;i<tamanho;i++){
            vet[i]=teclado.nextInt();
        }
       // ordenadores.insertionSort(vet);
       // ordenadores.selectionSort(vet);
       // ordenadores.MergeSort(vet);
       //recursivas.DescobreImpares(vet);
       //int receba = recursivas.InverteVetor(vet, 6);
       //System.out.println("" + receba);
       int receba = recursivas.SomaDosQuadrados(vet);
        System.out.println("" + receba);
    }
    
}
