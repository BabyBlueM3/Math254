public class EulerMethod{


    /*  This program starts by having a user input the intitial step size, initial x, and initial y value for a given equation. 
        
        The given equation is y' = y - 5x + 2
        y(0) = 2
        y(x) = 3 + 5x - e^x

        With intervals from [0,1/2]

    */

    public static void main (String [] args) {
        
        double h = 0.25;
        double x_f = 0.5;
        double y_0 = 2.0;
        double y_i;



        for(double i = 0; i < x_f;){
            System.out.println(i);


            y_i = y_0 + h*(y_0 -5*(i) + 2); 

            y_0 = y_i;

            i = i + h;

            System.out.println("y(1/2) =" + y_i);

        }
        
    }
}

