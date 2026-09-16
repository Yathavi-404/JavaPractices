public class triangle1 {
        public static void main(String [] args){
        double h=4.0;
        double b=3.0;
        triangle1 t=new triangle1();
        double p=t.findhypo(h,b);
        double q=t.findarea(h,b);
        double r=t.findperi(h,b);
            System.out.println("Area is:"+q);
            System.out.println("hypo is:"+p);
            System.out.println("Peri is:"+r);
    }   
    double findhypo(double x,double y){
        return Math.sqrt(x*x+y*y);
    }
    double findarea(double x,double y){
        return 0.5*x*y;
    }
    double findperi(double x,double y){
        return (x+y+findhypo(x,y));
    }
}

/*
class Triangle {

    double height;
    double base;
    double hypotenuse;

    double FindArea() {
        return 0.5 * height * base;
    }

    double FindHypotenuse() {
        return Math.sqrt(height * height + base * base);
    }

    double FindPerimeter() {
        return height + base + FindHypotenuse();
    }
}


public class Demo {

    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.height = 4.0;
        t.base = 3.0;

        double area = t.FindArea();
        double hypo = t.FindHypotenuse();
        double perimeter = t.FindPerimeter();

        System.out.println("Area is: " + area);
        System.out.println("Hypotenuse is: " + hypo);
        System.out.println("Perimeter is: " + perimeter);
    }
} */
