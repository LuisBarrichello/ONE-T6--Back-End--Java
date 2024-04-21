public class Main4 {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Dom Quixote", "Miguel de Cervantes", 1605);

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        System.out.println(json);


        Titulo titulo2 = new Titulo("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        // Configuração do Gson com Pretty Printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(outrotitulo);

        System.out.println(json);




        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2022, 75000.00);

        // Serializando o objeto para JSON usando Gson
        Gson gson = new Gson();
        String json = gson.toJson(veiculo);

        // Imprimindo o resultado
        System.out.println(json);
    }
}
