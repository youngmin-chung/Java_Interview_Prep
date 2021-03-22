import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class NonNegativeArrayList extends ArrayList<Integer> {

    public NonNegativeArrayList(Integer... numbers) {
        super(Arrays.stream(numbers)
                .filter(n -> n >= 0)
                .collect(Collectors.toList()));
    }

    @Override
    public void add(int index, Integer element) {
        if (element >= 0) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element) {
        if (element >= 0) {
            return super.add(element);
        } else {
            return false;
        }
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList()));
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList()));
    }

    @Override
    public Integer set(int index, Integer element) {
        if (element >= 0) {
            return super.set(index, element);
        } else {
            System.out.println("Item is less than 0 so it is not added");
            return element;
        }
    }

    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        super.replaceAll(operator);
        super.removeIf(n -> n < 0);
    }

}
