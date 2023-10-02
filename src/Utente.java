public class Utente {

    // variables declaration
    private String nome;
    private String genero;
    private int idade;
    private float altura;
    private float peso;


    // constants declaration
    private static final int MAGRO = 18;
    private static final int SAUDAVEL = 25;

    private static int numberOfInstances = 0;




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

    // getNome method
    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }


    // getGenero method
    /**
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }


    // getIdade method
    /**
     *
     * @return
     */
    public int getIdade() {
        return idade;
    }


    // getAltura method
    /**
     *
     * @return
     */
    public float getAltura() {
        return altura;
    }


    // getPeso method
    /**
     *
     * @return
     */
    public float getPeso() {
        return peso;
    }


    // setNome method
    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    // setGenero method
    /**
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


    // setIdade method
    /**
     *
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }


    // setAltura method
    /**
     *
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }


    // setPeso method
    /**
     *
     * @param peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    // toString method
    /**
     *
     * @return toString
     */
    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }


    /**
     * Method to calculate IMC
     * @return IMC
     */
    public float calculateImc() {
        return peso / (altura * altura);
    }


    /**
     * method to calculate obesity degree
     * @return obesity degree
     */
    public String calculateObesityDegree() {
        float imc = calculateImc();

        if (imc < MAGRO) {
            return "Lean";
        }
        else if (imc < SAUDAVEL) {
            return "Healthy";
        }
        else {
            return "Obese";
        }

    }

    /**
     * method to calculate the younger user between 2 users
     * @param user
     */
    public void calculateYoungerUser(Utente user) {
        if (idade < user.getIdade()) {
            System.out.print(nome+" is the younger");
        }
        else if (idade > user.getIdade()){
            System.out.println(user.getNome()+" is the younger");
        }
        else{
            System.out.println("They are both the same age");
        }
    }


    /**
     * method to calculate age gap between two users
     * @param user
     * @return age gap
     */
    public int calculateAgeGap(Utente user) {
        return Math.abs(idade - user.getIdade());
    }


    /**
     * method to check if user is healthy
     * @return "Healthy" or "Unhealthy"
     */
    public String isHealthy() {
        String obesityDegree = calculateObesityDegree();
        if (obesityDegree.equals("Healthy")) {
            return "Healthy";
        }
        else {
            return "Unhealthy";
        }
    }


    /**
     * method to get number of instances
     * @return numberOfInstances
     */
    public int getNumberOfInstances() {
        return numberOfInstances;
    }


}