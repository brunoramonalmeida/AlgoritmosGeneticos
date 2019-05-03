import java.util.Random;

public class Cromossomo {
    String dna;
    double aptidao;

    public Cromossomo(String dna, double aptidao) {
        this.dna = dna;
        this.aptidao = aptidao;
    }

    public Cromossomo(String dna) {
        this.dna = dna;
    }

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public double getAptidao() {
        return aptidao;
    }

    public void setAptidao(double aptidao) {
        this.aptidao = aptidao;
    }

    public void calcAptidao() {
        double aptidao = 0;
        if (dna.charAt(0) == '1') aptidao += 3;
        if (dna.charAt(1) == '1') aptidao += 3;
        if (dna.charAt(2) == '1') aptidao += 2;
        if (dna.charAt(3) == '1') aptidao += 4;
        if (dna.charAt(4) == '1') aptidao += 2;
        if (dna.charAt(5) == '1') aptidao += 3;
        if (dna.charAt(6) == '1') aptidao += 5;
        if (dna.charAt(7) == '1') aptidao += 2;
        this.aptidao = aptidao;
    }
}
