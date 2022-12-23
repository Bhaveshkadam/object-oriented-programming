public class Main {
    public static void main(String[] args) {
        RaOne raOne = new RaOne();
        Akatsuki akatsuki = new Akatsuki();

//        raOne.Talk();
//        akatsuki.Talk();

//        create Enemy pointer

//        Enemy enemy = raOne;
//        enemy.Talk();

        Enemy[] enemies = {raOne, akatsuki};

        enemies[0].Talk();
        enemies[1].Talk();
//        Talk() method figurd out during run time
    }
}
