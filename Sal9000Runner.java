import java.util.Scanner;

public class Sal9000Runner
{
    public static void main(String[] args)
    {
        /** Beginning text to prompt user input */
        Sal9000G sal1 = new Sal9000G();
        Sal9000S sal2 = new Sal9000S();
        System.out.print('\u000C');
        System.out.println (sal1.getGreeting());
        System.out.println ("Type salsoc to switch to Soccer department of Chatbot.");
        System.out.println ("Type salgen to switch to General department of Chatbot.");
        System.out.println ("You can switch back and forth at any time.");
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        /** Switch statement to switch between departments of chatbot */
        switch (statement)
        {
            case "salsoc" :
                System.out.println("You are now being transferred to the Soccer Department.");
                try 
                {
                    Thread.sleep(2500); // delays next action for 2.5 seconds
                } 
                catch(InterruptedException ex) 
                {
                    Thread.currentThread().interrupt();
                }
                System.out.println(sal2.hello());
                statement = in.nextLine();
                while (!(statement.equals("Bye") || statement.equals("bye")))
                    {
                        System.out.print('\u000C'); // clears screen
                        System.out.println (sal2.getResponse(statement));
                        statement = in.nextLine();
                    }
                break;
            case "salgen" :
                System.out.println("You are now being transferred to the General Department.");
                try 
                {
                    Thread.sleep(2500); 
                } 
                catch(InterruptedException ex) 
                {
                    Thread.currentThread().interrupt();
                }
                System.out.println(sal1.hello());
                statement = in.nextLine();
                while (!(statement.equals("Bye") || statement.equals("bye")))
                    {
                        System.out.print('\u000C');
                        System.out.println (sal2.getResponse(statement));
                        statement = in.nextLine();
                    }
                break;
            default :
                System.out.println("error"); /** I have not "stupid proofed" by code yet so it
                                                 is easy to break at the moment */
        }
    }
}