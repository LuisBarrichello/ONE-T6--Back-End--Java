public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50); // Exemplo com o valor em dólar


        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora.calcularPerimetro(5, 8);


        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7); // Exemplo com o número 7



        ConversorTemperatura conversorDeTempetatura = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversorDeTempetatura.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversorDeTempetatura.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");



        Produto produto = new Produto();
        produto.setPrecoUnitario(10.5);
        produto.calcularPrecoTotal(20);
        produto.aplicarDesconto(0.1);
    }
}
