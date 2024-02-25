public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        boss.setDefenseType("Armor");
        System.out.println("Boss:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        System.out.println("Heroes:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 15, "Flight");
        Hero hero2 = new Hero(80, 20);
        Hero hero3 = new Hero(120, 10, "Invisibility");

        return new Hero[]{hero1, hero2, hero3};
    }
}