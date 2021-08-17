public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate (55,164);
        System.out.println("Индекс массы тела равен: " + bodyMassIndex);
    }

}
