package wayofisekai;

import java.util.Random;

public class Enemy extends inheritCharNEnemy{
    
    //Enemy saját tulajdonságok deklarálása
    private Integer xpDrop;
    private Integer moneyDrop;
    private Integer dRate;
    private Random rnd = new Random();
    
    //Enemy létrehouása
    public Enemy(String name, Integer hp, Integer atk, Integer def, Integer dRate){
        
        super(name, hp, atk, def);
        this.xpDrop = rnd.nextInt(dRate) + 50;
        this.moneyDrop = rnd.nextInt(dRate) + 50;
        
    }
    
}