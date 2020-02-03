package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much weight do you want of the gift?");
        int weight = sc.nextInt();
        int remain_weight;
        Chocolates chocolates = new Chocolates();
        Candies candies = new Candies();
        System.out.println("Which chocolate do you want to add");
        String name = sc.next();
        System.out.println("Of what price you want the chocolate:");
        int price = sc.nextInt();
        chocolates.add(name,price);
        remain_weight=chocolates.add(weight);
        candies.add(remain_weight);
        chocolates.print();
        candies.print();
//       int total=0;
//       for(int i=0;i<10;i++)
//       {
//           for(int j=0;j<10;j++) {
//               if (i * chocolates.getWeight() == weight)
//                   total = i;
//               else if (i * candies.getWeight() == weight)
//                   total = i;
//               else if (i * chocolates.getWeight() + j * candies.getWeight() == weight)
//                   total = i + j;
//           }
//       }
//       System.out.print(total);

    }
}