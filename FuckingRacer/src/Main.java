import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws throwsException {

        System.out.println("Гоночка");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество участников (максимум 10)");
        int n = sc.nextInt();
        if (n>10){
            throw new throwsException("//Сказано - не больше 10 участников");
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<(n-1); i++){
            list.add(i);
        }
        Racer [] arr = new Racer[n];
        System.out.println("Ввеедите имя своего игрока: ");
        String name = sc.next();
        System.out.println("Введите возраст своего игрока: ");
        int age = sc.nextInt();
        System.out.println("Выберете Вашу Машину");
        int car = sc.nextInt();
        arr[0] = new Racer(name, age, car);
        arr[0].setMaxSpeed(arr[0].getCar(), arr[0].getAge());
        arr[0].setLuck();
        for (int i = 1; i<n; i++){
            arr[i] = new Racer(Racer.getRandom(list));
            arr[i].setMaxSpeed(arr[i].getCar(), arr[i].getAge());
            arr[i].setLuck();
        }
        for (int i = 0; i<n; i++){
            System.out.println(arr[i].speak(arr[i].getName(), arr[i].getAge(), arr[i].getCar()));
            System.out.println(arr[i].getMaxSpeed());
            System.out.println(arr[i].getLuck());
        }
    }
}