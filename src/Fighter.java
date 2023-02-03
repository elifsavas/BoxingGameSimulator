public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge; //sporcuların birbirlerini bloklama ihtimalini hesaplayacağız.

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge < 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe) {
        System.out.println(this.name + " -> " + foe.name + " " + this.damage + " hasar vurdu!");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı");
            System.out.println("==================");
            return foe.health;
        }
        if (foe.health - this.damage < 0)
            return 0;
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNum = Math.random() * 100; // math sınıfı javadan hazır olarak aldığımız bir sınıf. math.random rastgele bir sayı üretir.
        return randomNum <= this.dodge;
    }

}
