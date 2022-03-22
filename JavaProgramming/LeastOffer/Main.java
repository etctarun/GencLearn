import java.util.*;

class Product implements Comparable<Product>{
    private String item;
    private double price;
    private double dis;
    
    public Product(String item , double price , double dis){
        this.item = item;
        this.price = price;
        this.dis = dis;
    }
    public Double getDiscountPrice(){
        return price *dis/100;
    }
    
    @Override
    public int compareTo(Product other){
        return this.getDiscountPrice().compareTo(other.getDiscountPrice());
    }
    
    @Override
    public String toString(){
        return item;
    }
    
}

public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     // Fill the code here
     int x ; 
     x= sc.nextInt();
     List<Product> products = new ArrayList<>();
     
     for(int i = 0 ; i<x ; i++){
         String[] data = sc.next().split(",");
         Product pro = new Product(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]));
         products.add(pro);
     }
     
      products.stream()
              .filter((product) -> product.getDiscountPrice().equals(Collections.min(products).getDiscountPrice()))
              .forEach(System.out::println);

}
}