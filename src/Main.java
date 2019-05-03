public class Main {

    Cromossomo pop;

    public static void main(String[] args) {
        Cromossomo x = new Cromossomo("00000000");
        x.calcAptidao();
        System.out.println(x.aptidao);
    }
}
