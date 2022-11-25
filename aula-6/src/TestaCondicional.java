public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicional");
        int idade = 20;
        int quantidadePesoas = 3;
        if (idade >= 18) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        }else{
            if (quantidadePesoas >= 2) {
                System.out.println("você não tem 18 anos, mas pode entar pois está acompanhado");
            }else{
                System.out.println("infelizmente você não pode entrar");
            }
        }
    }
}
