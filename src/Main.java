public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float massa = 96;
        float height = 1.83F;
        float index = service.calculate(massa, height);
        System.out.println(index);
    }
}
