import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        List<String> b = new ArrayList<>();
        b.add("1");
        b.add("2");
        b.add("3");

        List<String> c = new ArrayList<>();
        c.add("x");
        c.add("y");
        c.add("z");

        List<List<String>> sets = new ArrayList<>();
        sets.add(a);
        sets.add(b);
        sets.add(c);

        List<List<String>> cartesianProduct = CartesianProduct.cartesianProduct(sets);

        for (List<String> product : cartesianProduct) {
            System.out.println(product);
        }
    }
}