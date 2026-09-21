public class Main{
      public static void main (String[] args){
         Vehicle v1 = new Vehicle();
         v1.brand= "Toyota";
         v1.model= "Corolla";
         v1.year= 2020;
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Is Vintage? " + v1.isVintage());
 
         System.out.println();
 
         Vehicle v2 = new Vehicle();
         v2.brand= "Ford";
         v2.model= "Mustang";
         v2.year= 1965;
         v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Is Vintage? " + v2.isVintage());
         
         System.out.println();
         
         Vehicle v3 = new Vehicle();
         v3.brand= "Honda";
         v3.model= "Civic";
         v3.year= 2015;
         v3.displayInfo();         
         System.out.println("Age: " + v3.calculateAge());
         System.out.println("Is Vintage? " + v3.isVintage());
      }
}