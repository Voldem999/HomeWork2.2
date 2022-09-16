public class GryffindorStudents extends HogwartsStudents {
    public int nobility;
    public int honor;
    public int bravery;

    public GryffindorStudents(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {return nobility;}

    public void setNobility(int nobility) {this.nobility = nobility;}

    public int getHonor() {return honor;}

    public void setHonor(int honor) {this.honor = honor;}

    public int getBravery() {return bravery;}

    public void setBravery(int bravery) {this.bravery = bravery;}

    public void compareGryffindor(GryffindorStudents gryffindorStudents) {
        int ability1 = ability();
        int ability2 = gryffindorStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Гриффиндора " + getName() + " лучше, чем студент Гриффиндора " + gryffindorStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент Гриффиндора " + getName() + " хуже, чем студент Гриффиндора " + gryffindorStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Студент Гриффиндора " + getName() + " такой же, как студент Гриффиндора " + gryffindorStudents.getName() + " : " + ability1 + " VS " + ability2);
        }
    }

    private int ability() {return nobility + honor + bravery;}

    @Override
    public String toString() {
        return String.format("%s, благородство - %d, честь - %d, храбрость - %d ", super.toString(), nobility, honor, bravery);
    }

}