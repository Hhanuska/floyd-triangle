import java.util.ArrayList;

public class FloydTriangle {
    private final ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

    public FloydTriangle(int rows) {
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>(i+1);

            for (int j = 0; j < i + 1; j++) {
                row.add(++counter);
            }

            triangle.add(row);
        }
    }

    public ArrayList<ArrayList<Integer>> getTriangle() {
        return triangle;
    }

    public void toConsole() {
        for (ArrayList<Integer> row : triangle) {
            System.out.println(row + "\t\tSum: " + row.stream().mapToInt(e -> e).sum());
        }
    }

    public String toString() {
        String text = "Floyd triangle with " + triangle.size() + " rows";

        for (ArrayList<Integer> row : triangle) {
            text += "\n" + row.toString().replace("[", "").replace("]", "");
        }

        return text;
    }
}
