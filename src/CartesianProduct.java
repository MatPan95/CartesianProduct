import java.util.ArrayList;
import java.util.List;

public class CartesianProduct {

    public static <T> List<List<T>> cartesianProduct(List<List<T>> sets) {
        List<List<T>> result = new ArrayList<>();
        cartesianRecursive(sets, 0, new ArrayList<>(), result);
        return result;
    }

    private static <T> void cartesianRecursive(List<List<T>> sets, int index, List<T> currentProduct, List<List<T>> result) {
        if (index == sets.size()) {
                result.add(new ArrayList<>(currentProduct));
                return;
        }

        for (T element : sets.get(index)) {
                currentProduct.add(element);
                cartesianRecursive(sets, index + 1, currentProduct, result);
                currentProduct.remove(currentProduct.size() - 1);
        }
    }
}
