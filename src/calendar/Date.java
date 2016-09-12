package calendar;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;}
    
    public String toString(){
        return this.day + "." + this.month + "." + this.year;}
        
    public void advance(){
        day++;
        if(day>30){
            day=1;
            month++;}
        if(month>12){
            month=1;
            year++;}}
    
    public void advance(int days){
        for(int i=0;i<days;i++){
            this.advance();}}
    
    public Date afterDays(int days){
        int day = this.day;
        int month = this.month;
        int year = this.year;
        Date dateAfter = new  Date(day,month,year);
     
        dateAfter.advance(days);
        return dateAfter;
    }

}
    
    
