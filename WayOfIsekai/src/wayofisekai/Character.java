package wayofisekai;

public class Character extends inheritCharNEnemy {
 
    //Karakter saját tulajdonságainak deklarálása
    private Integer lvl;
    private Integer xp;
    private Integer sp; //Skill Points
    private Boolean sex;
    
    //Karakter OBJ létrehozása
    public Character(String name, Boolean sex) {
        
        super(name, 350, 50, 30);
        this.sex = sex;
        this.lvl = 1;
        this.xp = 0;
        this.sp = 0;
        
    }
    
    //LvL Up
    public void lvlUp() { this.lvl++; }
    
    //Getter függvények
    public Integer getLvl(){
        
        return this.lvl;
        
    }
    
    public Integer getXp(){
        
        return this.xp;
        
    }
    
    public Integer getSp(){
        
        return this.sp;
                
    }
    
    public String getSex(){
        
        if (sex == Boolean.TRUE) {
            
            return "Female";
            
        } else {
            
            return "Male";
            
        }
        
    }
    
}