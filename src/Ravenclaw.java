import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int magic, int transgression, int smart, int wise, int witty, int creative) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    private int sum() {
        int sum = smart + wise + witty + creative;
        return sum;
    }

    public void compare(Ravenclaw other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + "Лучший Когтевранец чем" + other.getName());
        } else {
            System.out.println(other.getName() + "Лучший Когтевранец чем" + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return smart == ravenclaw.smart && wise == ravenclaw.wise && witty == ravenclaw.witty && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty, creative);
    }

    @Override
    public String toString() {
        return " Имя" + getName() +
                "Сила Магии " + getMagic() +
                " Дистанция трансгрессии " + getTransgression() +
                " Умный " + smart +
                " Мудрый " + wise +
                " Остроумный " + witty +
                " Творческий " + creative;
    }
}
