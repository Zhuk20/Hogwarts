import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magic, int transgression, int hardworking, int loyal, int honest) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int sum() {
        int sum = hardworking + loyal + honest;
        return sum;
    }

    public void compare(Hufflepuff other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + "Лучший Пуффендуец чем" + other.getName());
        } else {
            System.out.println(other.getName() + "Лучший Пуффендуец чем" + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return " Имя" + getName() +
                "Сила Магии " + getMagic() +
                " Дистанция трансгрессии " + getTransgression() +
                " Трудолюбивый " + hardworking +
                " Верный " + loyal +
                " Честный " + honest;
    }
}