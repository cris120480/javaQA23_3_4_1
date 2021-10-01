public class Main {
    public static void main(String[] args) {
        WeightIndexService service = new WeightIndexService();
        int weight = 75;
        float height = 180;
        float miles = service.calculate(weight, height);
        System.out.println(miles);

    }
}