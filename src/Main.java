import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Gryffindor harry = new Gryffindor(" Гарри ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor hermione = new Gryffindor(" Гермиона ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor ron = new Gryffindor(" Рон ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slytherin drako = new Slytherin(" Драко ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slytherin graham = new Slytherin(" Грэхэм ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slytherin gregory = new Slytherin(" Грегори ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff zachariah = new Hufflepuff(" Захария ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff cedric = new Hufflepuff(" Седрик ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff justin = new Hufflepuff(" Джастин ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Ravenclaw zhou = new Ravenclaw(" Чжоу ",random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101));
        Ravenclaw padma = new Ravenclaw(" Падма ",random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101));
        Ravenclaw marcus = new Ravenclaw(" Маркус ",random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101),random.nextInt(101));
        harry.compare(hermione);
        drako.compare(gregory);
        System.out.println(harry);
        harry.compare(drako);
    }
}