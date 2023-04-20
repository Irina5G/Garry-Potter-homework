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
Slizerin GrehemMontegu = new Slizerin(35, 60, 32, 79, 46, 29, 70);


        garryPotter.printInfo();
        germionaGreinger.printInfo();
        zahariaSmit.printInfo();
        sedrikDiggori.printInfo();
        jastinFinchFletchli.printInfo();
        chjouChang.printInfo();
        markusBelbi.printInfo();
        drakoMalfoi.printInfo();
        GrehemMontegu.printInfo();


        garryPotter.printTotal();
        germionaGreinger.printTotal();
        zahariaSmit.printTotal();
        sedrikDiggori.printTotal();
        jastinFinchFletchli.printTotal();
        chjouChang.printTotal();
        markusBelbi.printTotal();
        drakoMalfoi.printTotal();
        GrehemMontegu.printTotal();


    }
}