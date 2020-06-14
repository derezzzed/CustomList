
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


    int minusMinus(RationalNumber o) {
        Integer integer;

        int thisObjNumerator = Math.abs(numerator);
        int thisObjDenomirator = Math.abs(denomirator);
        int anotherObjNumerator = Math.abs(o.getNumerator());
        int anotherObjDenomirator = Math.abs(o.getDenumirator());

        int lmc = GcgFinder.lcm(thisObjDenomirator, anotherObjDenomirator);
        int a = lmc / thisObjDenomirator * thisObjNumerator;
        int b = lmc / anotherObjDenomirator * anotherObjNumerator;
        integer = b;
        return integer.compareTo(a);
    }
    int plusPlus(RationalNumber o) {
        Integer integer;

        int lmc = GcgFinder.lcm(denomirator, o.getDenumirator());
        int a = lmc / denomirator * numerator;
        int b = lmc / o.getDenumirator() * o.getNumerator();
        integer = a;
        return integer.compareTo(b);
    }
    @Override
    public int compareTo(RationalNumber o) {
       if (numerator > 0 && o.getNumerator() > 0) {
           plusPlus(o);
       }
       else if (numerator < 0 && o.getNumerator() < 0) {
           minusMinus(o);
       }
       else if (numerator > 0 && o.getNumerator() < 0) {
           return 1;
       }
       else if (numerator < 0 && o.getNumerator() > 0) {
           return -1;
       }
       return 0;
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denumerator=" + denomirator +
                '}';
    }
}
