package Lista_dinamica;

public class Conversor {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);

        int resto;
        InterPilha p;
        try{
            // agora o usuario decide se quer pilha estática ou dinamica através da linha de comando
            p = (InterPilha) Class.forName(args[1]).newInstance();
            // fase 1 = empilhamento dos restos
            while (numero != 0){
                resto = numero % 2;   // pego o resto da divisão deste número por 2 (vale 0 ou 1)
                p.push(resto);        // armazeno na pilha
                numero = numero / 2;  // gero um novo número, resultado da divisão dele por 2
            }
            // fase 2 = exibicao dos restos
            while (!p.isEmpty()){
                resto = p.pop();      // remove da pilha (Sempre o cara que está no topo)
                System.out.print(resto);
            }
            System.out.println("\nfim do programa");
        }
        catch(Exception ex){
            System.err.println("Deu muito ruim...");
        }
    }
}
