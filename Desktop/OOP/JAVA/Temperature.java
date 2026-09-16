public class Temperature{
    public static void main(String[] args){
        double fahrenheit=212;
        double celsius=98.5;
        System.out.println("Before converting to celcius:"+fahrenheit);
        double celcius1=((fahrenheit-32)/9)*5;
        System.out.println("AFter converting to celcius:"+celcius1);
        System.out.println("Before converting to fahrenheit:"+celsius);
        double fahrenheit1=((celsius/5)*9)+32;
        System.out.println("AFter converting to fahrenheit:"+fahrenheit1);
    }
}