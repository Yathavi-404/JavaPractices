public class findavg {
    public static void main(String [] args){
        double x=10;
        double y=5;
        double z=15;
        findavg a=new findavg();
        double res=a.avg(x,y,z);
        System.out.println("Average is :"+ res);
    }
    double avg(double a,double b,double c){
        double resuly=(a+b+c)/3;
        return resuly;
    }
}
