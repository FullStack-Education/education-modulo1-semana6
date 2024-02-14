public class Animal implements SerVivo{ // implementação de interface

    private String nome;
    private int idade;
    private String corPele;

    public Animal(String nome, int idade, String corPele) {
        this.nome = nome;
        this.idade = idade;
        this.corPele = corPele;
    }

    public void emiteSom(){
        System.out.println("Som");
    }

    @Override
    // obrigatórios devido a implementação da Interface SerVivo
    public void respira() {
        System.out.println("Ar pra dentro, ar pra fora");
    }

    @Override
    public void respawn() {

    }

//    @Override // Vem do Classe Object
//    public String toString() {
//        return "Animal{" +
//                "nome='" + nome + '\'' +
//                ", idade=" + idade +
//                ", corPele='" + corPele + '\'' +
//                '}';
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
