class dog{
    string breed;
    string size;
    string color;
    int age;
    eat();
    bark();
}
public class Instancedemo {
    public staic void main(String [] args){
        dog d1=new dog();
        dog d2=new dog();
        dog d3=new dog();
        d1.breed="Neapolitan Mastiff";
        d1.size="Large";
        d1.color="Black";
        d1.age=5;
        d2.breed="Maltese";
        d2.size="Small";
        d2.color="White";
        d2.age=2;
        d3.breed="Neapolitan Mastiff";
        d3.size="Large";
        d3.color="Black";
        d3.age=5;
    }
    
}
