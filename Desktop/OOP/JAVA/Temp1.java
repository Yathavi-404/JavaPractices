public class Temp1{
    public static void main (String [] args){
        double fahrenheit=212;
        double celsius=98.5;
        System.out.println("Fahrenheit value before changing:"+fahrenheit);
        System.out.println("Celsious value before changing:"+celsius);
        /* 
        Temperature t=new Temperature();
        t.ftoc(fahrenheit);
        t.ctof(celsius);*/ 

        ftoc(fahrenheit);
        ctof(celsius);

    }
     static void  ftoc(double x){
        x=((x-32)/9)*5;
        System.out.println("Celsious value is:"+x);
    }

    /*void  ftoc(double x){
        x=((x-32)/9)*5;
        System.out.println("Celsious value is:"+x);
    }*/

    static void  ctof(double x){
        x=(((x/5))*9)+32;
        System.out.println("Fahrenheit value is:"+x);
    }
    
    /*void  ctof(double x){
        x=(((x/5))*9)+32;
        System.out.println("Fahrenheit value is:"+x);
    }*/
}