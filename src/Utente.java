public class Utente {

    // variables declaration
    private String nome;
    private String genero;
    private int idade;
    private float altura;
    private float peso;



    // empty constructor
    public Utente() {
    }


    // name and age constructor

    /**
     * @param nome
     * @param idade
     */
    public Utente(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }


    // complete constructor

    /**
     * @param nome
     * @param genero
     * @param idade
     * @param altura
     * @param peso
     */
    public Utente(String nome, String genero, int idade, float altura, float peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

    }
}