public class QCalculator {
    public void calcQuadraticEquation(double a,double b,double c){
        double discriminant = Math.pow(b,2) - 4*a*c;
        double root1;
        if (discriminant>0){
            root1 = (-b+Math.sqrt(discriminant))/2*a;
            double root2 = (-b-Math.sqrt(discriminant))/2*a;
            System.out.println("Root1 = "+root1+",root2 = "+root2);
        }else if (discriminant == 0){
            root1 = -b/2*a;
            System.out.println("Root = "+root1);
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}
