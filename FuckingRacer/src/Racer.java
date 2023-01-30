import java.util.ArrayList;
import java.util.Random;

public class Racer {
    private String name;
    private int age;
    private int car;
    private int luck;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getCar(){
        return car;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public int getLuck(){
        return luck;
    }
    public void setLuck(){
        this.luck = (int) (Math.random()*10);
    }

    public void setMaxSpeed (int car, int age){
        this.maxSpeed=car*2+25-age/10;
    }
    Racer(String name, int age, int car){
        this.name = name;
        this.age = age;
        this.car = car;
    }
    Racer (int random){
        if (random==0){
            this.name = "Боб";
            this.age = 26;
            this.car = (int) (Math.random()*10);
        }
        if (random==1){
            this.name = "Олух";
            this.age = 14;
            this.car = (int) (Math.random()*10);
        }
        if (random==2){
            this.name = "Ронин";
            this.age = 34;
            this.car = (int) (Math.random()*10);
        }
        if (random==3){
            this.name = "Ольга";
            this.age = 29;
            this.car = (int) (Math.random()*10);
        }
        if (random==4){
            this.name = "Николай";
            this.age = 45;
            this.car = (int) (Math.random()*10);
        }
        if (random==5){
            this.name = "Марти Макфлай";
            this.age = 24;
            this.car = (int) (Math.random()*10);
        }
        if (random==6){
            this.name = "Док Браун";
            this.age = 25;
            this.car = (int) (Math.random()*10);
        }
        if (random==7){
            this.name = "Великий липкий";
            this.age = 26;
            this.car = (int) (Math.random()*10);
        }
        if (random==8){
            this.name = "Роро Кококо";
            this.age = 27;
            this.car = (int) (Math.random()*10);
        }
        if (random==9){
            this.name = "Девяносто сторый";
            this.age = 28;
            this.car = (int) (Math.random()*10);
        }
        if (random==10){
            this.name = "Никто";
            this.age = 29;
            this.car = (int) (Math.random()*10);
        }
    }
    public static Integer getRandom(ArrayList<Integer>list){
        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            return list.remove(index);
        }
        return 0;
    }
    public static String speak (String name, int age, int car){
        String car1 [] = new String[]{"Koenigsegg Agera RS", "Bugatti Veyron Super Sport", "Hennessey Venom GT", "SSC Ultimate Aero TT", "McLaren F1", "Pagani Huayra", "Noble M600", "Aston Martin One-77", "Ferrari LaFerrari", "Lamborghini Aventador"};

        return "Этого игрока зовут "+name+" И ему вот "+age+" Его машина нехуйская - это "+car1[car];
    }
}
