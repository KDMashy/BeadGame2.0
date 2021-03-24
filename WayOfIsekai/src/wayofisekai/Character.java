package wayofisekai;

import anotation.gFN;

public class Character extends inheritCharNEnemy {
 
    //Karakter saját tulajdonságainak deklarálása
    @gFN(value = "getLvl", type = Integer.class)
    private Integer lvl;
    @gFN(value = "getXp", type = Integer.class)
    private Integer xp;
    @gFN(value = "getSp", type = Integer.class)
    private Integer sp; //Skill Points
    @gFN(value = "getSex", type = Boolean.class)
    private Boolean sex;
    
    //Karakter OBJ létrehozása
    public Character(){
        
        super("none", 350, 50, 30);
        this.sex = Boolean.TRUE;
        this.lvl = 1;
        this.xp = 0;
        this.sp = 0;
        
    }
    
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
    
    //Setter függvények
    public void setSex(Boolean sex){
        
        this.sex = sex;
        
    }
    
}