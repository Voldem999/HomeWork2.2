public class HufflepuffStudents extends HogwartsStudents {
    public int hardworking;
    public int loyal;
    public int honest;

    public HufflepuffStudents(String name, int magic, int transgression, int hardworking, int loyal, int honest) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {return hardworking;}

    public void setHardworking(int hardworking) {this.hardworking = hardworking;}

    public int getLoyal() {return loyal;}

    public void setLoyal(int loyal) {this.loyal = loyal;}

    public int getHonest() {return honest;}

    public void setHonest(int honest) {this.honest = honest;}

    public void compareHufflepuff(HufflepuffStudents hufflepuffStudents) {
        int ability1 = ability();
        int ability2 = hufflepuffStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Пуффендуя " + getName() + " лучше, чем студент Пуффендуя " + hufflepuffStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент Пуффендуя " + getName() + " хуже, чем студент Пуффендуя " + hufflepuffStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Студент Пуффендуя " + getName() + " такой же, как студент Пуффендуя " + hufflepuffStudents.getName() + " : " + ability1 + " VS " + ability2);
        }
    }

    private int ability() {return hardworking + loyal + honest;}

    @Override
    public String toString() {
        return String.format("%s, трудолюбие - %d, верность - %d, честность - %d ", super.toString(), hardworking, loyal, honest);
    }
}
