package Onp;

            import java.util.Scanner;

            public class Onp {

                private static char dados[]; // Vetor que contÃƒÂ©m os dados da lista 
                private static int topo;

                private static int tamMax;

             
                public static boolean vazia() {
                    if (topo == -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

              
                public static boolean cheia() {
                    if (topo == (tamMax - 1)) {
                        return true;
                    } else {
                        return false;
                    }
                }

                /**
                 * ObtÃƒÂ©m o tamanho da Pilha
                 */
                public static int tamanho() {
                    return topo + 1;
                }

                public static char top() {
                    if (vazia()) {
                        return ' '; // pilha vazia
                    }
                    return dados[topo];
                }

               
                public static boolean push(char valor) {
                    if (cheia()) {
                        return false;  
                    }
                    topo++;
                    dados[topo] = valor;
                    return true;
                }

             
                public static char pop() {
                    if (vazia()) {
                        return ' '; // Pilha vazia
                    }
                    char valor = dados[topo];
                    topo--;
                    return valor;
                }



                public static void main(String[] args) {

                    tamMax = 100;
                    dados = new char[tamMax];
                    topo = -1;

                    Scanner entrada = new Scanner (System.in);
                    int quantidade = entrada.nextInt();
                    String expressao[] = new String[quantidade];

                    for (int i = 0; i < quantidade; i++) {
                        expressao[i] = entrada.next();

                    }
                    for (int i = 0; i < quantidade; i++) {
                        char[] letras = expressao[i].toCharArray();
                        poli(letras);
                    }

                }
                public static void poli(char[] letras){
                    for (int i = 0; i < letras.length; i++) {
                        if (letras[i] == '+' || letras[i] == '-' || letras[i] == '*' || letras[i] == '/' || letras[i] == '^') {
                            push(letras[i]);
                        }else if(letras[i]==')'){
                            System.out.print(pop());
                        } else if(letras[i]!='('){
                            System.out.print(letras[i]);
                        }
                    }
                    System.out.println();
                }


            }
