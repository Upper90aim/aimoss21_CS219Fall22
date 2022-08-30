public class investment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t*n);
    }

    public static void main(String [] args)  {

/*
        double c = 1; // initial deposit
        double r = 1; // 100% Yearly interest rate
        int t = 1; // number of years
        int n = (int) 2e9; // number of times compounded the interest
                // cast the int to a double
*/


        System.out.println(investment(1, 1, 1, (int)1e9 )); // Printing our final product
        System.out.println(investment(1000, .03, 10, 365)); // Printing our final product

    }
}
