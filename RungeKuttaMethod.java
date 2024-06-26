public class RungeKuttaMethod {
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

        double k_1;
        double k_2;
        double k_3;
        double k_4;


        for(double i = 0; i < x_f;){
            System.out.println(i);

            k_1 = (y_0 -5*(i) + 2);

            k_2 = ( (y_0 + ((h * k_1)/ 2)) - 5*(i + (h/2)) + 2);

            k_3 = ( (y_0 + ((h * k_2)/ 2)) - 5*(i + (h/2)) + 2);

            k_4 = ( (y_0 + (h * k_3)) - 5*(i + h) + 2);



            y_i = y_0 + (h/6)*(k_1 + (2*(k_2)) + (2*(k_3)) + k_4);

            //System.out.println(y_i);

            
            y_0 = y_i;

            i = i + h;

            System.out.println("k_1 =" + k_1);
            System.out.println("k_2 =" + k_2);
            System.out.println("k_3 =" + k_3);
            System.out.println("k_4 =" + k_4);


            System.out.println("y_1 =" + y_i);

        }
    }
}
