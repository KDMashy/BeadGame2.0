package wayofisekai;

public class inheritCharNEnemy {
 
    //Tulajdonságok deklarálása
    protected String name;
    protected Integer hp;
    protected Integer atk;
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
    
}