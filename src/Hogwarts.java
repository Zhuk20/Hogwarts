import java.util.Objects;

public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void compare(Hogwarts other) {
        if (this.getMagic() > other.magic) {
            System.out.println(name + "обладает большей мощностью магии, чем" + other.name);
        } else {
            System.out.println(other.name + "обладает большей мощностью магии, чем" + name);
        }
        if (this.getTransgression() > other.transgression) {
            System.out.println(name + "обладает большей дальностью трансгрессии, чем" + other.name);
        } else {
            System.out.println(other.name + "обладает большей мощностью магии, чем" + name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && transgression == hogwarts.transgression && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magic, transgression);
    }

    @Override
    public String toString() {
        return " Имя " + name +
                " Сила магии " + magic +
                " Расстояние трансгрессии " + transgression;
    }
}
