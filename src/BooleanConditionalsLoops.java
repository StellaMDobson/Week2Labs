
public class BooleanConditionalsLoops {

  public static void main(String[] args) {
    //create a variable named age and assign it a value of 14
    int age = 14;
    //print the boolean expression age >=16 to the console and note the results.
    System.out.println(age >= 16);
    age = 17;
    System.out.println(age >= 16);
    
    boolean hasLicense = true;
    
    
    if(age >= 16 && hasLicense) {
      System.out.println("You can drive");
    }
    else {
      System.out.println("You can not drive");
    }
    
    double costOfMilk = 3.00;
    int thirstLevel = 5;
    
    if(costOfMilk < 2.50 || thirstLevel > 6) {
      System.out.println("Milk Please");
    } 
    else {
      System.out.println("No thanks");
    }
    
    int numberOfCookies = 13;
    int numberOfChildren = 5;
    
    if(numberOfCookies % numberOfChildren > 5){
      System.out.println("Jackpot!");
    }
    else if(numberOfCookies % numberOfChildren >= 2) {
      System.out.println("Whooohoo!");
    }
    else if(numberOfCookies % numberOfChildren >= 2) {
      System.out.println("Yes!");    
    }
    else {  
      System.out.println("Sad Face :( ");
    
    }
    
    
    String loyaltyMemberStatus = "GOLD";
    double loyaltyMemberDiscount = 0.0;
    
    switch(loyaltyMemberStatus) {
      case "SILVER":
        loyaltyMemberDiscount = .1;
        break;
      case "GOLD":
        loyaltyMemberDiscount = .15;
        break;
      case "PLATUNUM":
        loyaltyMemberDiscount = .25;
        break;
          
    }
    
    System.out.println(loyaltyMemberDiscount);
    
    
    
    double billTotal = 625.00;
    double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
    System.out.println(adjustedTotal);
    
    if(adjustedTotal > 500) {
      if(loyaltyMemberStatus == "SILVER") {
        loyaltyMemberStatus = "GOLD";
       }
      else if(loyaltyMemberStatus == "GOLD") {
        loyaltyMemberStatus = "PLATINUM";
      }
    }
    
    System.out.println(loyaltyMemberStatus);
    
    String username = "Tmmy123";
    String password = "12345";
    
    if (username.equals("Tommy123") && password.equals("12345")) {
      System.out.println("login successful");
    }
    else {
      System.out.println("access denied");
    }
    
    
    for(int i = 0; i < 10; i++) {   //counts 1 to 10
      System.out.println(i);
    }
    
    for(int i = 10; i >= 0; i--) {   //counts 10 to zero
      System.out.println(i);
    }
    
    for (int i = 0; i <= 100; i +=2) {   //loop that prints every other number  from 0 - 100
      System.out.println(i);
    }
    
    for (int i = 0; i <= 100; i++) {   
          if (i % 2 == 0) {               //this is another way to say only even numbers
            System.out.println(i); 
          }
    }  
          
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " EVEN");
      }
      else {
        System.out.println(i + " ODD");
      }
      
    }
  
    int i = 100;
    while (i > 0) {
      System.out.println(i + " " + (i % 3));
      i--;
    }
    
    
  }
}
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    

    






















