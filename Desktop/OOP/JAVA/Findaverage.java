public class Findaverage {
    public static void main(String[] args) {
        double x,y,z;
        x=10;
        y=5;
        z=15;
        Findaverage first=new Findaverage();
        double AVERAGE=first.process(x,y,z);
        System.out.println("The average is:"+ AVERAGE);
    }
    public static double process(double a ,double b ,double c) {
        double result= (double)(a+b+c)/3;
        return result;
    }

}
