public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer anoCarro;
    private Integer quantidadePortas = 2;
    private Integer numeroChassi;
    private String combustivel;

    public String getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getNumeroChassi() {
        return this.numeroChassi;
    }

    public void setNumeroChassi(Integer numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public Integer getQuantidadeCalotas() {
        return this.quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusosPneus() {
        return this.quantidadeParafusosPneus;
    }

    public void setQuantidadeParafusosPneus(Integer quantidadeParafusosPneus) {
        this.quantidadeParafusosPneus = quantidadeParafusosPneus;
    }

    public Carro(Integer quantidadePneus, Integer anoCarro, Integer numeroChassi, String combustivel) {
        setQuantidadePneus(quantidadePneus);
        setAnoCarro(anoCarro);
        if (anoCarro > 2018) { // Se ano do carro for maior que 2018
            quantidadePortas = quantidadePortas + 2; // Adicionar 2 portas ao carro
        }
        setNumeroChassi(numeroChassi);
        setCombustivel(combustivel);

    }

    public Integer getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(Integer anoCarro) {
        this.anoCarro = anoCarro;
    }

    public Integer getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 2;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        setQuantidadeCalotas(quantidadePneus);
        setQuantidadeParafusosPneus(quantidadePneus * 4);
        this.quantidadePneus = quantidadePneus;
    }

    public void imprimeValores() {
        System.out.println("Quantidade Pneus: " + getQuantidadePneus());
        System.out.println("Quantidade de calotas: " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos: " + getQuantidadeParafusosPneus());
        System.out.println("Ano do carro: " + getAnoCarro());
        System.out.println("O carro possui: " + getQuantidadePortas() + " portas");
        System.out.println("Chassi do carro: " + getNumeroChassi());
        System.out.println("O tipo de combustivel do carro é: " + getCombustivel());

    }
}
