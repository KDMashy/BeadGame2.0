package wayofisekai;

import anotation.gFN;

public class npc {
    
    @gFN(value = "getVilName", type = String.class)
    private String vilName;
    @gFN(value = "isComp", type = Boolean.class)
    private Boolean comp;
    @gFN(value = "isAcc", type = Boolean.class)
    private Boolean acc;
    @gFN(value = "getCname", type = String.class)
    private String cname;
    
    public npc(String name, Boolean iscomp, Boolean isacc, String cname){
        this.vilName = name;
        this.comp = iscomp;
        this.acc = isacc;
        this.cname = cname;
    }
    
    //Getter függvények
    public String getVilName(){
        return this.vilName;
    }
    
    public Boolean isComp(){
        return this.comp;
    }
    
    public Boolean isAcc(){
        return this.acc;
    }
    
    public String getCname(){
        return this.cname;
    }
    
    //Setter függvények
    public void setVilName(String name){
        this.vilName = name;
    }
    
    public void setComp(Boolean is){
        this.comp = is;
    }
    
    public void setAcc(Boolean is){
        this.acc = is;
    }
    
    public void setCname(String cname){
        this.cname = cname;
    }
    
}