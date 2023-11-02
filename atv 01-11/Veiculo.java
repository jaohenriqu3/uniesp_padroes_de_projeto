public class Veiculo {
    private String Marca;
    private String Modelo;
    private int AnoFabricacao;
    private Double Preco;

    //Gets
    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public int getAnoFabricacao() {
        return AnoFabricacao;
    }
    public Double getPreco() {
        return Preco;
    }

    //Sets
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public void setAnoFabricacao(int AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }
    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }
}

