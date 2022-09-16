public class RavenclawStudents extends HogwartsStudents {
    public int smart;
    public int wise;
    public int witty;
    public int creative;

    public RavenclawStudents(String name, int magic, int transgression, int smart, int wise, int witty, int creative) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {return smart;}

    public void setSmart(int smart) {this.smart = smart;}

    public int getWise() {return wise;}

    public void setWise(int wise) {this.wise = wise;}

    public int getWitty() {return witty;}

    public void setWitty(int witty) {this.witty = witty;}

    public int getCreative() {return creative;}

    public void setCreative(int creative) {this.creative = creative;}

    public void compareRavenclaw(RavenclawStudents ravenclawStudents) {
        int ability1 = ability();
        int ability2 = ravenclawStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Когтеврана " + getName() + " лучше, чем студент Когтеврана " + ravenclawStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент Когтеврана " + getName() + " хуже, чем студент Когтеврана " + ravenclawStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else {
            System.out.println("Студент Когтеврана " + getName() + " такой же, как студент Когтеврана " + ravenclawStudents.getName() + " : " + ability1 + " VS  " + ability2);
        }
    }

    private int ability() {return smart + wise + witty + creative;}

    @Override
    public String toString() {
        return String.format("%s, ум - %d, мудрость - %d, остроумие - %d, творчество - %d ", super.toString(), smart, wise, witty, creative);
    }
}
