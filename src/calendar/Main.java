package calendar;

public class Main {

    public static void main(String[] args) {
        Date date1 = new Date(25,2,2011);
        Date date2 = date1.afterDays(7);
        
        for (int i = 1; i <= 7; ++i) {
        System.out.println("Friday after  " + i + " weeks is " + date2);
        date2 = date2.afterDays(7);}
        
        System.out.println("This week's Friday is " + date1);
        System.out.println("The date 790 days from this week's Friday is  " + date1.afterDays(790));
    }
    
}
