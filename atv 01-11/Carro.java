public class Carro extends Veiculo {
    private int Placa;
        public void exibirInfoCarro() {
            System.out.println("Carro " + getMarca() + "Modelo " + getModelo());
            System.out.println("Ano de Fabricação: " + getAnoFabricacao());
            System.out.println("Placa: " + Placa);
            System.out.println("Preço: $" + getPreco());
        }
}