public class Main {
    public static void main(String[] args) {


    }
    static void removeDuplicates(CustomList<RationalNumber> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i).compareTo(list.get(j)))==0) {
                    list.remove(j);
                }
            }
        }
    }
}
