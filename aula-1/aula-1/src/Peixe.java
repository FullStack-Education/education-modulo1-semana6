public class Peixe extends Animal{

    private String corEscamas;

    public Peixe(String nome, int idade, String corPele) {
        super(nome, idade, corPele);
    }

    @Override
    public void emiteSom(){
        System.out.println("glub glub");
    }
}
