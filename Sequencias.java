/* QUESTAO: Você recebe uma sequência ordenada de n inteiros S = s1 , s2, ..., sn 
e uma sequência ordenada de inteiros m Q = q1 , q2,...,qm. Por favor, imprima em 
ordem crescente todos esses s i que não pertence a Q .
Na primeira linha, você recebe um inteiro 2 <= n <= 100 , e na linha a seguir n 
inteiros: 
-100 <= s i <= 100, s i <= s i +1 .
Na terceira linha, você recebe um inteiro 2 <= m <= 100 , e na linha a seguir, 
inteiros m  : 
-100 <= q i <= 100, q i <= q i +1 .*/
package sequencias;

import java.util.Scanner;

public class Sequencias { //classe que constrói cada sequencia 

    public static void main(String[] args) { //classe PRINCIPAL. Nela crio o que vou precisar

        //Variaveis que irei precisar pra fazer a comparacao futuramente 
        int S, Q, seqS[], seqQ[];

        /*S será uma seq de s1 ate sn, do mesmo jeito Q. 
        seqS armazena os numeros de S, da mesma forma seqQ faz com Q*/
        Scanner entrada = new Scanner(System.in); //leitura dos dados de entrada

        System.out.print("Digite o tamanho da sequencia S: ");
        S = entrada.nextInt(); //Dou o tamanho que a sequencia S comporta
        seqS = new int[S]; //e instancio

        int posicao; //posicao é como se fosse o contador i que será executado x vezes
        for (posicao = 0; posicao < S; posicao++) { //percorre a sequencia S e da a qntdd de valores de acordo com o tamanho. 
            System.out.print("Informe o valor da posicao (" + posicao + ") para S: "); //mostra o numero escolhido na posicao atual
            seqS[posicao] = entrada.nextInt();
        }
        System.out.print("\n");
        
        System.out.print("Digite o tamanho da sequencia Q: ");
        Q = entrada.nextInt();
        seqQ = new int[Q
                ];

        for (posicao = 0; posicao<Q; posicao++) {
            System.out.print("Informe o valor da posicao (" + posicao + ") para Q: ");
            seqQ[posicao] = entrada.nextInt();
        }
        comparaSequencias(S, Q, seqS, seqQ); //A classe precisa ser chamada fora do main para poder fazer a comparacao e mostrar qual/quais numero/os é/são diferente/es
    }
    
    //Heuristica(classe) para comparação das sequencias
    public static void comparaSequencias(int S, int Q, int seqS[], int seqQ[]) { //parametrizo as variaveis que usei

        int aux1, aux2; //variaveis que armazenarao os numeros iguais ou diferentes
        //boolean numerosIguais=false;

        for (aux1 = 0; aux1 < S; aux1++) { //percorro S
            boolean numerosIguais = false; //boleano porque preciso de algo que me retorne verdadeiro ou falso. Então ele já começa (é inicializado) com falso
            for (aux2 = 0; aux2<Q; aux2++) { //percorro Q
                //boolean numerosIguais = false;
                if (seqS[aux1] == seqQ[aux2]) { //se os auxiliares forem iguais 
                    numerosIguais = true; //me retorne algo verdadeiro. x agora foi atualizado e é V
                    break;
                }
            }
            if (numerosIguais==false) {
                    //System.out.print("\n");
                    System.err.println("\nO/os numero/os (" + seqS[aux1] + ") e/sao diferentes"); // err para me dar em uma cor diferente quem é/sao o/os numero/os diferente/es
            }
        }
    }
}
