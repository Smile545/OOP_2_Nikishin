package heroes;


public class Wizard extends BaseHero {
    public Wizard( String name, int strength, int health ) {
        super( name, strength, health );
    }


    public Wizard() {
        super( "Wizard", 4, 30 );
    }


    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }


    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }
}