package wayofisekai;

import anotation.gFN;
import java.util.Random;

public class Enemy extends inheritCharNEnemy{
    
    //Enemy saját tulajdonságok deklarálása
    @gFN(value = "getXpDrop", type = Integer.class)
    private Integer xpDrop;
    @gFN(value = "getMoneyDrop", type = Integer.class)
    private Integer moneyDrop;
    @gFN(value = "getDRate", type = Integer.class)
    private Integer dRate;
    @gFN(value = "getQuest", type = Integer.class)
    private Integer quest;
    @gFN(value = "getDefHp", type = Integer.class)
    private Integer defhp;
    //random így nincs használva, csak helyileg az Enemy classjában
    //@gFN(value = "getRnd", type = Random.class)
    private Random rnd = new Random();
    
    //Enemy létrehouása
    public Enemy(){
        
        super(".", 0, 0, 0);
        this.xpDrop = 0;
        this.moneyDrop = 0;
        this.quest = 0;
        
    }
    
    public Enemy(String name, Integer hp, Integer atk, Integer def, Integer dRate, Integer quest){
        
        super(name, hp, atk, def);
        this.xpDrop = rnd.nextInt(dRate) + 50;
        this.moneyDrop = rnd.nextInt(dRate) + 50;
        this.quest = quest;
        
    }
    
    //Getter fügvények
    public Integer getQuest(){
        
        return this.quest;
        
    }
    
    public Integer getXpDrop(){
        
        return this.xpDrop;
        
    }
    
    public Integer getMoneyDrop(){
        
        return this.moneyDrop;
        
    }
    
    public Integer getDRate(){
        
        return this.dRate;
        
    }
    
    public Integer getDefHp(){
        
        return this.defhp;
        
    }
    
    //Setter függvények
    public void setDefHp(Integer defhp){
        
        this.defhp = defhp;
        
    }
}