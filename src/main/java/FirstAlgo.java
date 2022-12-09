import java.util.*;
import java.util.stream.Collectors;

public class FirstAlgo {

//    private void swap(int one, int two , int[] a)
//    {
//        int temp = a[one];
//        a[one] = a[two];
//        a[two] = temp;
//    }
//    public void bubbleSort(int nElems,int[] a)
//    {
//        int out, in;
//        for(out=nElems-1; out>1; out--)
//            for(in=0; in<out; in++)
//                if( a[in] > a[in+1] )
//                    swap(in, in+1, a);
//    }
    private static <T> Set<T> findCommonElements(List<T> first, List<T> second) {
        Set<T> collection = new HashSet<>(second);
        return first.stream().filter(collection::contains).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        List<Integer> firstM1 = new ArrayList<>(Arrays.asList(6, 4, 6, 8, 1, 100, -100));
        List<Integer> firstM2 = new ArrayList<>(Arrays.asList(3, 8, 76544, -42, 100, 1));
        Set<Integer> newSet = findCommonElements(firstM1,firstM2);
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(newSet);
        myTreeSet.forEach(System.out::println);
    }
}
