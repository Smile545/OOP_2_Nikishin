import heroes.*;


public class OOP_1 {
    public static void main( String[] args ) {

        Peasant peasant = new Peasant("Andrey", 5, 100);
        Rogue rogue = new Rogue("Alex", 5, 150);
        Sniper sniper = new Sniper("Bob", 5, 120);
        Wizard wizard = new Wizard("Danil", 5, 80);
        Spearman spearman = new Spearman("David", 5, 200);
        Crossbowman crossbowman = new Crossbowman("Chuan", 5, 110);
        Monk monk = new Monk("Marc", 5, 90);

        System.out.println(  );
        peasant.attack(rogue);
        peasant.harvest();
        rogue.attack(spearman);
        rogue.die();
        sniper.rest(50);
        sniper.aim();
        wizard.rest(30);
        wizard.curse();
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.takeDamage(50);
        spearman.brace();
        monk.rest(20);
        monk.heal();
        monk.step();
        monk.stepUp();
        monk.stepDown();
        monk.stepLeft();
        monk.stepRight();

        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( wizard );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
    }
}