public interface Calculatable {

    Integer add(Integer a, Integer b);
    Integer subtract(Integer a, Integer b);
    Integer multiply(Integer a, Integer b);
    Integer divide(Integer a, Integer b);

    String getHistory();
}