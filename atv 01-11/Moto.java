public class Moto extends Veiculo {
    private int Placa;
        public void exibirInfoMoto() {
            System.out.println("Moto" + getMarca() + "Modelo " + getModelo());
            System.out.println("Ano de Fabricação: " + getAnoFabricacao());
            System.out.println("Placa: " + Placa);
            System.out.println("Preço: $" + getPreco());
        }
}