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
    //random így nincs használva, csak helyileg az Enemy classjában
    //@gFN(value = "getRnd", type = Random.class)
    private Random rnd = new Random();
    
    //Enemy létrehouása
    public Enemy(String name, Integer hp, Integer atk, Integer def, Integer dRate){
        
        super(name, hp, atk, def);
        this.lvl = 1;
        this.xpDrop = rnd.nextInt(dRate) + 50;
        this.moneyDrop = rnd.nextInt(dRate) + 50;
        
    }
    
    //Getter fügvények
    public Integer getXpDrop(){
        
        return this.xpDrop;
        
    }
    
    public Integer getMoneyDrop(){
        
        return this.moneyDrop;
        
    }
    
    public Integer getDRate(){
        
        return this.dRate;
        
    }
    
    //Setter függvények
    public void setEnemyLvl(Character ch){
        
        this.lvl = ch.getLvl() + 1;
        
    }
    
}