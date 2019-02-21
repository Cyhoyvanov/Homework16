import java.util.Scanner;

public class Homewrork16 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах Цельсия: ");
        double temperatureC = scan.nextDouble();
        double temperatureF = temperatureC*9/5+32;
        System.out.println("Температура в градусах Фаренгейта: "+temperatureF);
    }
}

