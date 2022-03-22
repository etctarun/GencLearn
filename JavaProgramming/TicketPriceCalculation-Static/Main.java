import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Ticket tick = new Ticket();
        Scanner sc = new Scanner(System.in);
        int nbook , aticket;
        
        System.out.println("Enter no of bookings:");
        nbook = sc.nextInt();
        System.out.println("Enter the available tickets:");
        aticket = sc.nextInt();
        tick.setAvailableTickets(aticket);
        
        for(int i = 0 ; i < nbook ; i++){
            System.out.println("Enter the ticketid:");
            int ticketid = sc.nextInt();
            System.out.println("Enter the price:");
            int price = sc.nextInt();
            System.out.println("Enter the no of tickets:");
            int nofticket = sc.nextInt();
       
            System.out.println("Available tickets:" + tick.getAvailableTickets());
            System.out.println("Total amount:" + tick.calculateTicketCost(nofticket));
            System.out.println("Available ticket after booking:" + tick.getAvailableTickets());
        }
    }
}