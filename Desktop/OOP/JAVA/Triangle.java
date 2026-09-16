public class Triangle {
    public static void main(String[] args) {
        
        double area = findarea(4.0, 3.0);
        System.out.println("The area is: " + area);

       
        double hypotenuse = findhypotenuse(4.0, 3.0);
        System.out.println("The hypotenuse is: " + hypotenuse);

      
        double perimeter = findperimeter(4.0, 3.0);
        System.out.println("The Perimeter is: " + perimeter);
    }
    
    
    public static double findarea(double x, double y) {
        return 0.5 * x * y;        
    }
    
 
    public static double findhypotenuse(double x, double y) {
       
        double hSquared = Math.pow(x, 2) + Math.pow(y, 2); 
        return Math.sqrt(hSquared); 
    }
    
    
    public static double findperimeter(double x, double y) {
     
        double hypotenuse = findhypotenuse(x, y); 
        return x + y + hypotenuse;
    }
}