package wayofisekai;

import anotation.gFN;
import java.util.ArrayList;

public class Character extends inheritCharNEnemy {
 
    //Karakter saját tulajdonságainak deklarálása
    @gFN(value = "getXp", type = Integer.class)
    private Integer xp;
    @gFN(value = "getSex", type = Boolean.class)
    private Boolean sex;
    @gFN(value = "getMoney", type = Integer.class)
    private Integer money;
    
    //Karakter OBJ létrehozása
    public Character(){
        
        super("none", 350, 50, 30);
        this.sex = Boolean.TRUE;
        this.lvl = 1;
        this.xp = 0;
        this.money = 0;
        
    }
    
    public Character(String name, Integer lvl, Integer xp, Boolean sex, Integer money){
        
        super(name, 350, 50, 30);
        this.lvl = lvl;
        this.xp = xp;
        this.sex = sex;
        this.money = money;
        
        this.hp = 500 + ((lvl - 1) * 150);
        this.atk = 50 + ((lvl - 1) * 25);
        this.def = 30 + ((lvl - 1) * 10);
        
        
    }
    
    public Character(String name, Boolean sex) {
        
        super(name, 350, 50, 30);
        this.sex = sex;
        this.lvl = 1;
        this.xp = 0;
        this.money = 0;
        
    }
    
    //LvL Up
    public void lvlUp() { 
        
        funkcio<Character> xpStay = new funkcio<>();
        this.lvl++;
        this.xp -= xpStay.lvlUpXp(this.lvl - 1);
        this.hp = 500 + ((lvl - 1) * 150);
        this.atk = 50 + ((lvl - 1) * 25);
        this.def = 30 + ((lvl - 1) * 10);
        funkcio<Enemy> stat = new funkcio<>();
        ArrayList<Enemy> e = stat.loadEnemy(this);
        for (Enemy x : e) {
            
            x = stat.enemyStat(x, this);
            x.setDefHp(x.getHp());
            
        }
    
    }
    
    //Getter függvények
    
    public Integer getXp(){
        
        return this.xp;
        
    }
    
    public Integer getMoney() {
        
        return this.money;
        
    }
    
    public Boolean getSex(){
        
        return this.sex;
        
    }
    
    //Setter függvények
    public void setSex(Boolean sex){
        
        this.sex = sex;
        
    }
    
    public void setMoney(Integer money){
        
        this.money += money;
        
    }
    
    public void setXp(Integer xp){
        
        this.xp += xp;
        
    }
    
}