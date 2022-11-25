public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicional");
        int idade = 20;
        int quantidadePesoas =3;
        boolean acompanhado = quantidadePesoas >= 2;

        if (idade >= 18 || acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }

    }
}
