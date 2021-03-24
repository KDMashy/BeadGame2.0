package wayofisekai;

import anotation.gFN;

public class inheritCharNEnemy {
 
    //Tulajdonságok deklarálása
    @gFN(value = "getName", type = String.class)
    protected String name;
    @gFN(value = "getHp", type = Integer.class)
    protected Integer hp;
    @gFN(value = "getAtk", type = Integer.class)
    protected Integer atk;
    @gFN(value = "getDef", type = Integer.class)
    protected Integer def;
    
    //ős konstruktor
    public inheritCharNEnemy(String name, Integer hp, Integer atk, Integer def) {
    
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    
    }
    
    //Getter függvények
    public String getName(){
        
        return this.name;
        
    }
    
    public Integer getHp() {
        
        return this.hp;
        
    }
    
    public Integer getAtk() {
        
        return this.atk;
        
    }
    
    public Integer getDef() {
        
        return this.def;
        
    }
    
    //Setter fügvények
    public void setName(String name){
        
        this.name = name;
        
    }
    
}