public class Main {

    static Cromossomo pop[];

    public static void main(String[] args) {
        pop = new Cromossomo[4];

        popInicial();

        for(Cromossomo c : pop)
            System.out.println(c);

    }

    public static void popInicial() {
        pop[0] = new Cromossomo("11110000");
        pop[1] = new Cromossomo("01111000");
        pop[2] = new Cromossomo("00011110");
        pop[3] = new Cromossomo("10100110");
    }


}
