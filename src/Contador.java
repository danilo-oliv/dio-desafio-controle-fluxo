import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e)
        {
            System.out.println("O segundo número precisa ser maior que o primeiro " + e);
        }
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException
    {
        if(p1>p2)
            throw new ParametrosInvalidosException();

        int contagem = p2-p1;
        for(int i=1;i<=contagem;i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
    }


}
