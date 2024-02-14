package enums;

// Enumeração simples representando dias da semana
public enum DiasSemana {
    // cada valor é como se fosse um "objeto"
    // não podem se repetir os valores devem estar no construtor do enum
    SEGUNDA(2, "dia trabalho"), // SEGUNDA é um objeto que o valor "SEGUNDA" e o valor 2
    TERCA(3, "dia trabalho"),
    QUARTA(4, "dia trabalho"),
    QUINTA(5, "dia trabalho"),
    SEXTA(6, "dia trabalho"),
    SABADO(7, "dia descanso"),
    DOMINGO(1, "dia descanso");

    private final int valorDia; // variavel obrigatória
    private final String textoDia; // variavel obrigatória

    DiasSemana(int valorDia, String textoDia) { // construtor enum
        this.valorDia = valorDia;
        this.textoDia = textoDia;
    }

    public static DiasSemana getDiaPorValorDia(int dia){
        for (DiasSemana value : values()) {
            if(value.valorDia == dia){
                return value;
            }
        }
        return null;
    }

    public int getValorDia() {
        return valorDia;
    }

    public String getTextoDia() {
        return textoDia;
    }
}

