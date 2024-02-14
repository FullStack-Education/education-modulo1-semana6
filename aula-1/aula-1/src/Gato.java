public class Gato extends Animal{ //herança de Anima para Gato

    private String corPele;

    private String raca;

    public Gato(String nome, int idade, String corPele) {
        super(nome, idade, corPele); // é como o this, só que da Classe Pai
    }

    @Override
    public void emiteSom(){
        System.out.println("Miau miau");
    }

    public void ronronar(){
        System.out.println("Rrrrrrr");
    }

}
