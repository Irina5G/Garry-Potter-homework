public class Main {
    public static void main(String[] args) {

        Griffindor garryPotter = new Griffindor(55, 68, 71,64, 93);
        Griffindor germionaGreinger = new Griffindor(57, 47,29,89,34);

       Puffendui zahariaSmit = new Puffendui(46, 39, 60, 59, 71);
Puffendui sedrikDiggori = new Puffendui(54, 26, 39, 47,68);
Puffendui jastinFinchFletchli = new Puffendui(37, 60, 35,58,71);

Kogtevran chjouChang = new Kogtevran(54, 49, 35, 70, 29, 56);

Kogtevran markusBelbi = new Kogtevran(46,76,80,34,60, 53);

Slizerin drakoMalfoi = new Slizerin(45, 32, 68, 46, 80, 39, 65);
Slizerin grehemMontegu = new Slizerin(35, 60, 32, 79, 46, 29, 70);


        garryPotter.printInfo();
        germionaGreinger.printInfo();
        zahariaSmit.printInfo();
        sedrikDiggori.printInfo();
        jastinFinchFletchli.printInfo();
        chjouChang.printInfo();
        markusBelbi.printInfo();
        drakoMalfoi.printInfo();
        grehemMontegu.printInfo();


        garryPotter.printTotal();
        germionaGreinger.printTotal();
        zahariaSmit.printTotal();
        sedrikDiggori.printTotal();
        jastinFinchFletchli.printTotal();
        chjouChang.printTotal();
        markusBelbi.printTotal();
        drakoMalfoi.printTotal();
        grehemMontegu.printTotal();


       int a = garryPotter.getBravery() + garryPotter.getHonor() + garryPotter.getNobolity() + garryPotter.getMagic() + garryPotter.getTransgression();

       int b = germionaGreinger.getBravery() + germionaGreinger.getNobolity() + germionaGreinger.getHonor() + germionaGreinger.getMagic() + germionaGreinger.getTransgression();

        if (a>b) {
            System.out.println( "Лучший ученик Griffindor: Garry Potter, у него " + a + " баллов.");
        } else {
            System.out.println("Лучший ученик Griffindor: Germiona Greinger, у нее " + b + " баллов.");
        }


        int c = zahariaSmit.getHardworking() + zahariaSmit.getHonest() + zahariaSmit.getLoyal() + zahariaSmit.getTransgression() + zahariaSmit.getMagic();

        int d = sedrikDiggori.getHardworking() + sedrikDiggori.getLoyal() + sedrikDiggori.getHonest() + sedrikDiggori.getMagic() + sedrikDiggori.getTransgression();

        int k = jastinFinchFletchli.getHardworking() + jastinFinchFletchli.getLoyal() + jastinFinchFletchli.getHonest() + jastinFinchFletchli.getMagic() + jastinFinchFletchli.getTransgression();

        if (c>d && c>k) {
            System.out.println("Лучший ученик Puffendui: Zaharia Smit, у него " + c + " баллов.");
        } else if (d>c && d>k) {

            System.out.println("Лучший ученик Puffendui: Sedrik Diggori, у него " + d + " баллов.");

    } else  {
            System.out.println("Лучший ученик Puffendui: jastin FinchFletchli, у него " + k + " баллов.");
        }




        int f = chjouChang.getClever() + chjouChang.getWise() + chjouChang.getWitty() + chjouChang.getMagic() + chjouChang.getTransgression() + chjouChang.getFullOfCreativity();

        int g = markusBelbi.getClever() + markusBelbi.getWitty() + markusBelbi.getTransgression() + markusBelbi.getMagic() + markusBelbi.getFullOfCreativity() + markusBelbi.getWise();

        if (f>g) {
            System.out.println( "Лучший ученик Kogtevran: Chjou Chang, у него " + f + " баллов.");
        } else {
            System.out.println("Лучший ученик Kogtevran: Markus Belbi, у него " + g + " баллов.");
        }


        int h = drakoMalfoi.getAmbition() + drakoMalfoi.getCunning() + drakoMalfoi.getMagic() + drakoMalfoi.getTransgression() + drakoMalfoi.getDetermination() + drakoMalfoi.getLustForPower() + drakoMalfoi.getResourcefulness();

        int i = grehemMontegu.getAmbition() + grehemMontegu.getCunning() + grehemMontegu.getDetermination() + grehemMontegu.getMagic() + grehemMontegu.getTransgression() + grehemMontegu.getResourcefulness() + grehemMontegu.getLustForPower();

        if (h>i) {
            System.out.println( "Лучший ученик Slizerin: Drako Malfoi, у него " + h + " баллов.");
        } else {
            System.out.println("Лучший ученик Slizerin: Grehem Montegu, у него " + i + " баллов.");
        }


    }
}