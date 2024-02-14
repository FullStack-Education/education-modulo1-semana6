public class GatoClone extends Gato{

    private String fabricante;

    public GatoClone(String nome, int idade, String corPele) {
        super(nome, idade, corPele);
    }

    @Override
    public void emiteSom(){
        System.out.println("Miau miau 'zombido' Miau miau");
    }
}
