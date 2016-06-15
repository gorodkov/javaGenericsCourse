package generics.m0.e3;

public class Main {

    public static void main(String... args) {
        final Integer left = 1;
        final Double middle = .4;
        final String right = "right";
        final Triple<Integer, Double, String> triple = new Triple<>(left, middle, right);
        final Tuple<Integer, String> t = triple;
        final Integer leftId = t.getLeft();
        if (leftId != left) {
            throw new RuntimeException("Triple#getLeft() do not returns the value that have been set in the constructor");
        }
        final String rightValue = t.getRight();
        if (rightValue != rightValue) {
            throw new RuntimeException("Triple#getRight() do not returns the value that have been set in the constructor");
        }
        final Double middleValue = triple.getMiddle();
        if (middleValue != middle) {
            throw new RuntimeException("Triple#getMiddle() do not returns the value that have been set in the constructor");
        }
    }

}

