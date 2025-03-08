import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUM = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUM, parametroDois);
        } catch (ParametroInvalido e) {
            System.out.println("O parâmetro UM não pode ser maior que o parâmetro DOIS");
        }
        scanner.close();
    }
    static void contar (int parametroUM, int parametroDois)throws ParametroInvalido{
        if (parametroUM > parametroDois){
            throw new ParametroInvalido("O segundo parâmetro deve ser maior que o primeiro"); 
        }

        int contagem = parametroDois - parametroUM;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
        
    }
}
