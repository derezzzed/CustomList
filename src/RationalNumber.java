
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

        int a = numerator * 2;
        int b = o.getNumerator() * 2;

        if (a == denomirator && b == o.getDenumirator()) return 0;

        else if (denomirator > o.getDenumirator()) return 1;

        else return -1;
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denumerator=" + denomirator +
                '}';
    }
}
