package exercíco1;
public class ordenadores {
    public static void MergeSort(int v[]){
        mergeSort(v,0,v.length-1);
    }
    public static void mergeSort(int v[], int inicio, int fim){
        if(inicio<fim){
            int meio=(inicio+fim)/2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio+1,fim);
            merge(v, inicio, meio, fim);
            imprimeVetor(v);
        }        
    }

    public static void merge(int v[], int inicio, int meio, int fim){
        int com1= inicio, com2= meio+1, comAux=0;
        int vetAux[]= new int[fim- inicio+1];
        while(com1 <= meio && com2<=fim){
            if(v[com1]<=v[com2]){
                vetAux[comAux]=v[com1];
                com1++;
            }else{
                vetAux[comAux]=v[com2];
                com2++;
            }
            comAux++;
            }
           while(com1<=meio){
               vetAux[comAux]=v[com1];
               comAux++;
               com1++;               
            }
         while(com2<=fim){
               vetAux[comAux]=v[com2];
               comAux++;
               com2++;               
            }
         for(comAux=inicio; comAux<=fim;comAux++){
             v[comAux]=vetAux[comAux-inicio];
         }
         
    }
    public static void selectionSort(int v[]){
        int menor=0;
        int aux=0;
        int cont=0;
        for(int i=0;i<(v.length-1);i++){
           menor=i;
           for(int j=i+1;j<v.length;j++){
               cont++;
               if(v[j]<v[menor]){
                   menor=j;
               }
             cont++;
             if(v[menor]!=v[i]){
                 aux=v[i];
                 v[i]=v[menor];
                 v[menor]=aux;
             }
            
           }
        }
        System.out.println("vetor ordenato pelo selectio Sort:");
        imprimeVetor(v);
        System.out.println("Numero de comparações pelo selection "+ cont);
    }
    public static void imprimeVetor(int v[]){
      for(int i=0; i<v.length;i++){
          System.out.print(v[i]+ " ");
      }
        System.out.println("");
    }

    public static void insertionSort(int v[]) {
        imprimeVetor(v);
        int i = 0;
        int j = 1;
        int aux = 0;
        int cont = 0;
        while (j < v.length) {
            aux = v[j];
            i = j - 1;
            cont++;
            int cont2 = 0;
            while (i >= 0 && v[i] > aux) {
                cont++;
                v[i + 1] = v[i];
                cont++;
                i--;
            }
            if (cont2 > 0) {
                cont2--;
            }
            cont += cont2;
            v[i + 1] = aux;
            j++;
        }
        System.out.println("Seu vetor ordenado pelo Insertion Sort");
        imprimeVetor(v);
        System.out.println("O número de comparações foi pelo Insertion Sort"+ cont);
    }

}
