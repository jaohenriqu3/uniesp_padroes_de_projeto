import java. util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo v = new Veiculo();
        Carro c = new Carro();
        Moto m = new Moto();

        System.out.println("Montadora do seu zé");
        System.out.println("Digite: 1 - Cadastrar um novo veiculo / 2 - Ver veiculos cadastrados");

        int sistema = sc.nextInt();
        switch (sistema){
            case 1:
                System.out.println("Digite: 1 - Cadastrar Carro / 2 - Cadastrar Moto");
                int CadastroMouC = sc.nextInt();
                switch (CadastroMouC){
                    case 1:
                        System.out.println("Cadastro de Carro");
                        System.out.println("--------------------");
                        System.out.println("Digite a marca do veiculo:");
                        c.setMarca(sc.next());
                        System.out.println("Digite o modelo veiculo:");
                        c.setModelo(sc.next());
                        System.out.println("Digite o ano de fabricação do veiculo:");
                        c.setAnoFabricacao(sc.nextInt());
                        System.out.println("Digite o preço do veiculo:");
                        c.setPreco(sc.nextDouble());
                        System.out.println("Produto cadastrado com sucesso :)");
                        c.exibirInfoCarro();
                        break;
                    case 2:
                        System.out.println("Cadastro de Moto");
                        System.out.println("--------------------");
                        System.out.println("Digite a marca do veiculo:");
                        m.setMarca(sc.next());
                        System.out.println("Digite o modelo veiculo:");
                        m.setModelo(sc.next());
                        System.out.println("Digite o ano de fabricação do veiculo:");
                        m.setAnoFabricacao(sc.nextInt());
                        System.out.println("Digite o preço do veiculo:");
                        m.setPreco(sc.nextDouble());
                        System.out.println("Produto cadastrado com sucesso :)");
                        m.exibirInfoMoto();
                        break;
                } break;

    // Listagem de Veiculos -- 2
            case 2:
                System.out.println("Digite: 1 - Listar Carros / 2 - Listar Motos");
                int carroOuMoto = sc.nextInt();
                switch (carroOuMoto){
                    case 1:
                        System.out.println("Listagem de Carros:");
                        System.out.println("---------------------");
                        c.exibirInfoCarro();
                        break;
                    case 2:
                        System.out.println("Listagem de Motos:");
                        System.out.println("---------------------");
                        m.exibirInfoMoto();
                        break;
                } break;
        }
    }
}