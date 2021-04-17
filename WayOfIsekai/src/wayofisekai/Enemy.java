package wayofisekai;

import anotation.gFN;
import java.util.Random;

public class Enemy extends inheritCharNEnemy{
    
    //Enemy saját tulajdonságok deklarálása
    @gFN(value = "getXpDrop", type = Integer.class)
    private Integer xpDrop; //tapasztalati pontok dobása
    @gFN(value = "getMoneyDrop", type = Integer.class)
    private Integer moneyDrop; //pénz dobása
    @gFN(value = "getDRate", type = Integer.class)
    private Integer dRate; //egyedi drop rate ellenfelenként
    @gFN(value = "getQuest", type = Integer.class)
    private Integer quest; //ellenfélhez tartozó küldetés
    @gFN(value = "getDefHp", type = Integer.class)
    private Integer defhp; //alap hp, fight rész alatt az obj hpjával dolgozik
    //random így nincs használva, csak helyileg az Enemy classjában
    //@gFN(value = "getRnd", type = Random.class)
    private Random rnd = new Random();
    
    //Enemy létrehouása
    //paraméterek nélküli constructor
    public Enemy(){
        //ősösztály, és egyéb tulajdonságok
        super(".", 0, 0, 0);
        this.xpDrop = 0;
        this.moneyDrop = 0;
        this.quest = 0;
    }
    //paraméteres létrehozás, betöltéskor
    public Enemy(String name, Integer hp,
            Integer atk, Integer def,
            Integer dRate, Integer quest){
        //ősosztály const.
        super(name, hp, atk, def);
        this.xpDrop = rnd.nextInt(dRate) + 50;
        this.moneyDrop = rnd.nextInt(dRate) + 50;
        this.quest = quest;
        
    }
    
    //Getter fügvények
    //küldetés id
    public Integer getQuest(){
        return this.quest;
    }
    //xp dobás
    public Integer getXpDrop(){
        return this.xpDrop;
    }
    //pénz dobás
    public Integer getMoneyDrop(){
        return this.moneyDrop;
    }
    //drop rate
    public Integer getDRate(){
        return this.dRate;
    }
    //alap hp, fight utáni visszaállításra
    public Integer getDefHp(){
        return this.defhp;
    }
    
    //Setter függvények
    //alap hp beállítása
    public void setDefHp(Integer defhp){
        this.defhp = defhp;
    }
}