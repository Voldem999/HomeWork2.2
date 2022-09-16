public class SlytherinStudents extends HogwartsStudents {
    public int cunning;
    public int determination;
    public int ambition;
    public int resourceful;
    public int thirstForPower;

    public SlytherinStudents(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourceful, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceful = resourceful;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {return cunning;}

    public void setCunning(int cunning) {this.cunning = cunning;}

    public int getDetermination() {return determination;}

    public void setDetermination(int determination) {this.determination = determination;}

    public int getAmbition() {return ambition;}

    public void setAmbition(int ambition) {this.ambition = ambition;}

    public int getResourceful() {return resourceful;}

    public void setResourceful(int resourceful) {this.resourceful = resourceful;}

    public int getThirstForPower() {return thirstForPower;}

    public void setThirstForPower(int thirstForPower) {this.thirstForPower = thirstForPower;}

    public void compareSlytherin(SlytherinStudents slytherinStudents) {
        int ability1 = ability();
        int ability2 = slytherinStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Cлизерина " + getName() + " лучше, чем студент Cлизерина " + slytherinStudents.getName() + " : " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент Cлизерина " + getName() + " хуже, чем студент Cлизерина " + slytherinStudents.getName() + " : " + ability1 + " VS  " + ability2);
        } else {
            System.out.println("Студент Cлизерина " + getName() + " такой же, как студент Cлизерина " + slytherinStudents.getName() + " : " + ability1 + " VS " + ability2);
        }
    }

    private int ability() {return cunning + determination + ambition + resourceful + thirstForPower;}

    @Override
    public String toString() {
        return String.format("%s, хитрость - %d, решительность - %d, амбициозность - %d, находчивость - %d, жажда власти - %d ", super.toString(), cunning, determination, ambition, resourceful, thirstForPower);
    }
}
