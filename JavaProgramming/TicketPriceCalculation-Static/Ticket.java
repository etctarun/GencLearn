public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public int getTicketid(){
        return this.ticketid;
    }
    public void setTicketid(int t){
        this.ticketid = t;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int p){
        this.price = p;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public static void setAvailableTickets(int at){
        if(at>0)
            Ticket.availableTickets = at;
    }
    
    public int calculateTicketCost(int nooftickets){
        if(nooftickets < availableTickets){
            availableTickets -= nooftickets;
            return nooftickets*price;
        }
        return -1;
    }
}