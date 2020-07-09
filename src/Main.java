public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float massa = 68;
        float height = 1.70F;
        float index = service.calculate(massa, height);
        System.out.println(index);
    }
}
