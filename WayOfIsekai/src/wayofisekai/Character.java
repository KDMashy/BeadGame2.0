package wayofisekai;

import anotation.gFN;
import java.util.ArrayList;

public class Character extends inheritCharNEnemy {
 
    //Karakter saját tulajdonságainak deklarálása
    @gFN(value = "getXp", type = Integer.class)
    private Integer xp; //Tapasztalati pontok
    @gFN(value = "getSex", type = Boolean.class)
    private Boolean sex; //Karakter neve
    @gFN(value = "getMoney", type = Integer.class)
    private Integer money; //pénzmennyiség
    
    //Karakter OBJ létrehozása
    //paraméterek nélkül
    public Character(){
        //Ősosztály meghívása, egyéb tulajdonságok
        super("none", 350, 50, 30);
        this.sex = Boolean.TRUE;
        this.lvl = 1;
        this.xp = 0;
        this.money = 0;
    }
    //paraméteres karakter OBJ létrehozása (betöltés)
    public Character(String name, Integer lvl, Integer xp, Boolean sex, Integer money){
        //ősosztály meghívása, egyéb tulajdonságok
        super(name, 350, 50, 30);
        this.lvl = lvl;
        this.xp = xp;
        this.sex = sex;
        this.money = money;
        //Karakter szint alapján a tulajdonságok beállítása
        this.hp = 750 + ((lvl - 1) * 250);
        this.atk = 75 + ((lvl - 1) * 25);
        this.def = 30 + ((lvl - 1) * 10);
    }
    //LvL Up függvény
    public void lvlUp() { 
        //karakter szintlépése, beállítása
        funkcio<Character> xpStay = new funkcio<>();
        this.lvl++;
        this.xp -= xpStay.lvlUpXp(this.lvl - 1);
        this.hp = 750 + ((lvl - 1) * 250);
        this.atk = 75 + ((lvl - 1) * 25);
        this.def = 30 + ((lvl - 1) * 10);
        //ellenfél karakterhez illesztése
        funkcio<Enemy> stat = new funkcio<>();
        ArrayList<Enemy> e = stat.loadEnemy(this);
        for (Enemy x : e) {
            //funkcio - estat. ellenfél illesztése
            x = stat.enemyStat(x, this);
            x.setDefHp(x.getHp());
        }
    }
    
    //Getter függvények
    //tapasztalati pontok
    public Integer getXp(){
        return this.xp;
    }
    //pénz mennyiség
    public Integer getMoney() {
        return this.money;
    }
    //karakter neme
    public Boolean getSex(){
        return this.sex;
    }
    
    //Setter függvények
    //nem beállítása
    public void setSex(Boolean sex){
        this.sex = sex;
    }
    //pénz beállítása, hozzáadás
    public void setMoney(Integer money){
        this.money += money;
    }
    //tapasztalati pontok beállítása, hozzáadás
    public void setXp(Integer xp){
        this.xp += xp;
    }
}