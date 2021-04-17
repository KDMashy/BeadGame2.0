package wayofisekai;

import anotation.gFN;

public class inheritCharNEnemy {
 
    //Tulajdonságok deklarálása
    @gFN(value = "getName", type = String.class)
    protected String name; //név
    @gFN(value = "getHp", type = Integer.class)
    protected Integer hp; //életerő
    @gFN(value = "getAtk", type = Integer.class)
    protected Integer atk; //sebzés
    @gFN(value = "getDef", type = Integer.class)
    protected Integer def; //védelem, nincs használva - 
                           //egyéb problémák miatt, talán a jövőben...
    @gFN(value = "getLvl", type = Integer.class)
    protected Integer lvl; //szint, bár leginkább csak karakterre van használva
    
    //ős konstruktor
    public inheritCharNEnemy(String name, Integer hp, Integer atk, Integer def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
    
    //Getter függvények
    //neve
    public String getName(){
        return this.name;
    }
    //szintje
    public Integer getLvl(){
        return this.lvl;
    }
    //életereje
    public Integer getHp() {
        return this.hp;
    }
    //sebzése
    public Integer getAtk() {
        return this.atk;
    }
    //védelme, nincs használva, talán a jövőben
    public Integer getDef() {
        return this.def;
    }
    
    //Setter fügvények
    //név állítás
    public void setName(String name){
        this.name = name;
    }
    //életerő állítás
    public void setHp(Integer hp) {
        this.hp = hp;
    }
    //sebzés állítás
    public void setAtk(Integer atk) {
        this.atk = atk;
    }
    //védelem állítás, talán a jövőben...
    public void setDef(Integer def) {
        this.def = def;
    }
    //szint állítás
    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }
}