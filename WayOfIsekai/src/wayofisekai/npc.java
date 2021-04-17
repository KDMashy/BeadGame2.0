package wayofisekai;

import anotation.gFN;

public class npc {
    
    //NPC-k tulajdonságai
    @gFN(value = "getVilName", type = String.class)
    private String vilName; //neve
    @gFN(value = "isComp", type = Boolean.class)
    private Boolean comp; //kész e a küldetése
    @gFN(value = "isAcc", type = Boolean.class)
    private Boolean acc; //el van e fogadva a küldetés
    @gFN(value = "getCname", type = String.class)
    private String cname; //karakter neve, akinek a mentéséhez tartozik
    
    //npc-k létrehozása
    public npc(String name, Boolean iscomp, Boolean isacc, String cname){
        this.vilName = name;
        this.comp = iscomp;
        this.acc = isacc;
        this.cname = cname;
    }
    
    //Getter függvények
    //neve
    public String getVilName(){
        return this.vilName;
    }
    //kész e
    public Boolean isComp(){
        return this.comp;
    }
    //elfogadva e
    public Boolean isAcc(){
        return this.acc;
    }
    //hozzá tartozó karakter neve
    public String getCname(){
        return this.cname;
    }
    
    //Setter függvények
    //név állítás
    public void setVilName(String name){
        this.vilName = name;
    }
    //kész/nem az
    public void setComp(Boolean is){
        this.comp = is;
    }
    //elfogadva/ nem
    public void setAcc(Boolean is){
        this.acc = is;
    }
    //hozzátartozó karakter név változtatása
    public void setCname(String cname){
        this.cname = cname;
    }
}