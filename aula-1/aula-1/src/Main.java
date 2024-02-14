import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Nome", 10, "Rosa");

        Animal gatanima = new Peixe("Gatanima Peixe Gato", 10, "Rosa"); // animal é Pai de Gato e por isso podemos colocar Animal = Gato

        Gato gato = new Gato("Felix", 7, "Rosa"); // animal é Pai de Gato e por isso podemos colocar Animal = Gato
        Peixe peixe = new Peixe("Beto Beta", 1, "Ciano"); // animal é Pai de Gato e por isso podemos colocar Animal = Gato
        // estou perdendo as infomações que seriam de Gato, métodos e atributos


        System.out.println(animal);
        System.out.println(gatanima); // Class peixe
        System.out.println(gato);
        System.out.println(peixe);

        animal.emiteSom();
        gatanima.emiteSom(); // tipo Animal, porém ele tem a sobreecrita do Peixe
        gato.emiteSom();
        peixe.emiteSom();

//        gatanima.ronronar(); // Animal com new Gato não tem acesso aos método exclusivos de Animal


        List<Animal> animais = new ArrayList<>();

        List<Animal> animaisEncadeados = new LinkedList<>();

        //generalizam a funcionalidade de uma Lista
        // se eu quiser usar o método as penas de LinkedList, eu preciso criar uma LinkedList pura

        // List não tem atributos, apenas métodos
        // e os métodos de list não tem implementação
        animais.add(animal);
        animaisEncadeados.add(animal);

//        List<Animal> list = new List(); // não posso criar uma instancia de uma interface
        // uma interface depende de outra classe para ter a implementação dela

        SerVivo serVivo = new Animal("Nome", 10, "Rosa");
        // interface precisa de uma classe para dar o new

        // serVivo não tem acesso a nenhum dos getter ou setters de Animal

        String planeta = SerVivo.Constantes.planeta; //Constantes em interfaces são Static, ou seja da Interface

    }
}