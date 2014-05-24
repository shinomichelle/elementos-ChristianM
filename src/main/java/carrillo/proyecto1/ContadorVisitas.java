package carrillo.proyecto1;

public class ContadorVisitas {

    private static int conta;

    public static int getConta() {
        conta++;
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
