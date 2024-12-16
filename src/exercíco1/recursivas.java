package exercíco1;
public class recursivas {
    public static int SomaDosQuadrados(int vetor[]){
        return somaDosQuadrados(vetor, vetor.length, 0, 0);
    }
    
    public static int somaDosQuadrados(int vetor[], int tamanho, int i, int resultado){
        if(i==tamanho){
            return resultado;
        }
        
        resultado += (int) Math.pow(vetor[i], 2); 
        return somaDosQuadrados(vetor, tamanho, i+1, resultado);
    }
    
    public static int InverteVetor(int vetor[], int num){
       return inverteVetor(vetor,vetor.length-1,num,0,0); 
    }
    public static int inverteVetor(int vetor[], int tamanho, int num, int i,int cont){
        if(i==tamanho){
            if(vetor[i]==num){
                cont++;
            }
            return cont;            
        }
        if(vetor[i]==num){
            cont++;
        }
        if(vetor[tamanho]==num){
            cont++;
        }
        int aux=vetor[tamanho];
        vetor[tamanho]=vetor[i];
        vetor[i]=aux;
        return inverteVetor(vetor,tamanho-1,num, i+1, cont);
        
    }
    public static boolean VerificaOrdem(int vetor[]){
       return verificaOrdem(vetor,vetor.length,0); 
    }
    public static boolean verificaOrdem(int vetor[], int tamanho, int i){
        if(tamanho<2){
            System.out.println("Seu vetor está ordenado");
            return true;
        }
        if(i==tamanho-1){
            if(vetor[i]>=vetor[i-1]){
            System.out.println("O vetor esta ordenado");
            return true;
            }else{
                return false;
            }
        }
        if(vetor[i]<=vetor[i+1]){
          return verificaOrdem(vetor,tamanho,i+1);  
        }else{
            System.out.println("Este vetor não ésta ordenado");
            return false;
        }
    }
    public static void DescobreImpares(int v[]){
        System.out.println("Os número impares são: ");
       descobreImpares(v,v.length,0); 
    }
    public static void descobreImpares(int v[], int tamanho, int i){
        if(i==(tamanho)){
            return;
        }
        if((v[i]%2)!=0){
            System.out.println(v[i]);          
        }
        descobreImpares(v,tamanho,i+1);
        
    }
    
}
