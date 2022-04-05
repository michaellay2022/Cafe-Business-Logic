import java.util.ArrayList;
// import java.util.Arrays;
public class CafeUtil {

    //int getStreakGoal()
    //sums together every consecutive integer from 1 to 10 and returns the sum
    public int getStreakGoal(int sum) {
        sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        return sum;
    }
    //End of int getStreakGoal()
    //=================================================================

    //============================================================
    //double getOrderTotal(double[] prices)
    public double getOrderTotal(double[]prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }
    //End of double getOrderTotal()
    //=================================================================

    //============================================================
    //void displayMenu(ArrayList<String>menuitems)
    public void displayMenu(ArrayList<String> menuItem) {
        int i = 1;
        for (String menu : menuItem) {
            System.out.println(i + "." + menu);
            i++;
        }
        }
    //End of void displayMenu()========================================
    //=================================================================
    
     //addCustomer(ArrayList<String>customers)===============
     public void addCustomer(ArrayList<String> customers) {
         System.out.println("Please enter your name:");
         String userName = System.console().readLine();
         System.out.println("Hello " + userName);
         System.out.println("There are" + customers.size() + "ahead of you");
         customers.add(userName); // to add an item to an ArrayList

         System.out.println(customers.toString());




    }

}









