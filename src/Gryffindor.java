import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int sum() {
        int sum = nobility + honor + bravery;
        return sum;
    }

    public void compare(Gryffindor other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + "Лучший Гриффиндорец чем" + other.getName());
        } else {
            System.out.println(other.getName() + "Лучший Гриффиндорец чем" + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return " Имя" + getName() +
                "Сила Магии " + getMagic() +
                " Дистанция трансгрессии " + getTransgression() +
                " Благородство " + nobility +
                " Честь " + honor +
                " Храбрость " + bravery;
    }
}
