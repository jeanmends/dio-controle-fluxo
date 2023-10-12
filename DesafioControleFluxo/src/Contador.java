import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

            if (parametroDois >= parametroUm){
                int contagem = parametroDois - parametroUm;
                for (int index = 0; index < contagem; index++){
                    System.out.println("Imprimindo o número " +(index + 1));
                }
            }else{
                throw new ParametrosInvalidosException();
            }


        //realizar o for para imprimir os números com base na variável contagem
    }
}
