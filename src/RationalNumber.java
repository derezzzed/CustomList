
public class RationalNumber implements Comparable<RationalNumber> {
    private int numerator;
    private int denomirator;


    RationalNumber(int numerator, int denomirator) {

        this.numerator = numerator;
        this.denomirator = denomirator;
    }

    public int getNumerator() {
        return numerator;
    }


    public int getDenumirator() {
        return denomirator;
    }


    @Override
    public int compareTo(RationalNumber o) {
      return  numerator * o.getDenumirator() - denomirator * o.getNumerator();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(numerator).append(" ").append(denomirator).toString();
    }
}
