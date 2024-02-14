package enums;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(DiasSemana.SEXTA);
        System.out.println(DiasSemana.valueOf("sexta".toUpperCase()));

        DiasSemana dia = null; // dia pode ter apenas os valores do Enum DiasSemana, e null
        dia = DiasSemana.DOMINGO;

        DiasSemana dia2 = DiasSemana.QUINTA;

        // for -> para cada item de uma lista execute o código dentro do for
        // para cada item de valores atribui o item a "value" e executa o codigo
        // DiasSemana.values() -> retorna todos os valores do enum em lista
        for (DiasSemana value : DiasSemana.values()) {
            System.out.println(value.getValorDia());
            System.out.println(value.getTextoDia());
        }

        System.out.println(DiasSemana.getDiaPorValorDia(3));



    }
}
