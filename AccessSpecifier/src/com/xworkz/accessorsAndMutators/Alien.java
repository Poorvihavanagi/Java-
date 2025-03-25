package com.xworkz.accessorsAndMutators;

public class Alien
{
    private String seenBy;
    private String seenDate;
    private String describe;

    public String getSeenBy(){
        return this.seenBy;
    }

    public String getSeenDate(){
        return this.seenDate;
    }
    public String getDescribe(){
        return this.describe;
    }
    public void setSeenBy(String seenBy){
        this.seenBy=seenBy;
    }
    public void setSeenDate(String seenDate){
        this.seenDate=seenDate;
    }
    public void setDescribe(String describe){
        this.describe=describe;
    }
}
