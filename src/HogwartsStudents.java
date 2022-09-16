public abstract class HogwartsStudents {

    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getMagic() {return magic;}

    public void setMagic(int magic) {this.magic = magic;}

    public int getTransgression() {return transgression;}

    public void setTransgression(int transgression) {this.transgression = transgression;}

    public void print() {System.out.println(this);}

    private int ability() {return magic + transgression;}

    public void compareHogwarts(HogwartsStudents hogwartsStudents) {
        int ability1 = ability();
        int ability2 = hogwartsStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше, чем студент " + hogwartsStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент " + getName() + " хуже, чем студент " + hogwartsStudents.getName() + ": " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Студент " + getName() + " такой же, как студент " + hogwartsStudents.getName() + ": " + ability1 + " VS " + ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s, сила магии - %d, расстояние трансгресии - %d ", name, magic, transgression);
    }
}
