import java.util.Scanner;

public class MainConsole {

    public MainConsole() {
        about();
        task();
        doit();
    }
    private void task() {
        System.out.println("Feladat 0251 megoldása");
        System.out.println("Paralelogramma területe");
    }
    private void about() {
        System.out.println("Berkovics Gellért");
        System.out.println("Szoft I/1/N");
        System.out.println("2023-02-06");
    }
    private String input(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }
    private void doit() {
        String asidestr = input("A oldal: ");
        String bsidestr = input("B oldal: ");
        String gammastr = input("Gamma: ");

        double a = Double.parseDouble(asidestr);
        double b = Double.parseDouble(bsidestr);
        double gamma = Double.parseDouble(gammastr);

        Paralelogramma para = new Paralelogramma();
        double area = para.calcArea(a, b, gamma);
        System.out.printf("%.2f\n", area);
    }
    
}
