public class Puffendui extends Hogwards {

    private int hardworking;
    private int loyal;
    private int honest;

    public Puffendui(int magic, int transgression, int hardworking, int loyal, int honest) {
        super(magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

            }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void printInfo () {
        super.printInfo();
        System.out.println(hardworking + " " + loyal + " " + honest);

       }

    public void printTotal () {
        System.out.println("Puffendui :" + (this.hardworking + this.loyal + this.honest + super.getMagic() + super.getTransgression()));
    }

}
