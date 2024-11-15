import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        traditionalComparatorImplementation();
        lambdaComparatorImplementation();
    }

    private static void lambdaComparatorImplementation() {
        //  ()->{}
      Comparator <Integer> comparatorLambda=(Integer a,Integer b)->a.compareTo(b);
        System.out.println(comparatorLambda.compare(10,5));
    }

    private static void traditionalComparatorImplementation() {
        Comparator<Integer> comparator= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(02);    //return 0 if o1==o2
                                            // return 1 if o1>02
                                            // return -1 if o1>o2
            }
        };

        System.out.println(comparator.compare(10,5));
    }
}
