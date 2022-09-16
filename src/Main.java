import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    private static GryffindorStudents generateGryffindorStudents(String name) {
        return new GryffindorStudents(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
    private static HufflepuffStudents generateHufflepuffStudents(String name) {
        return new HufflepuffStudents(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
    private static RavenclawStudents generateRavenclawStudents(String name) {
        return new RavenclawStudents(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
    private static SlytherinStudents generateSlytherinStudents(String name) {
        return new SlytherinStudents(name, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }

    public static void main(String[] args) {
        GryffindorStudents harry = generateGryffindorStudents("Гарри Поттер");
        GryffindorStudents hermione = generateGryffindorStudents("Гермиона Грейнджер");
        GryffindorStudents ron = generateGryffindorStudents("Рон Уизли");
        HufflepuffStudents zachariah = generateHufflepuffStudents("Захария Смит");
        HufflepuffStudents cedric = generateHufflepuffStudents("Седрик Диггори");
        HufflepuffStudents justin = generateHufflepuffStudents("Джастин Финч-Флетчли");
        RavenclawStudents zhou = generateRavenclawStudents("Чжоу Чанг");
        RavenclawStudents padma = generateRavenclawStudents("Падма Патил");
        RavenclawStudents marcus = generateRavenclawStudents("Маркус Белби");
        SlytherinStudents draco = generateSlytherinStudents("Драко Малфой");
        SlytherinStudents graham = generateSlytherinStudents("Грэхэм Монтегю");
        SlytherinStudents gregory = generateSlytherinStudents("Грегори Гойл");

        harry.print();
        hermione.print();
        ron.print();
        zachariah.print();
        cedric.print();
        justin.print();
        zhou.print();
        padma.print();
        marcus.print();
        draco.print();
        graham.print();
        gregory.print();
        System.out.println();
        harry.compareGryffindor(hermione);

        cedric.compareHufflepuff(zachariah);

        padma.compareRavenclaw(zhou);

        draco.compareSlytherin(graham);
        System.out.println();
        harry.compareHogwarts(draco);
        draco.compareHogwarts(ron);
        hermione.compareHogwarts(zhou);
    }
}
