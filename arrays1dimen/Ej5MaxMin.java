/*
 *
 * Author: Manuel Brito
 * Program that order 10 numbers and then show the min and max introduced number.
 */

package arrays1dimen;

import java.util.Scanner;

public class Ej5MaxMin {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("--- The program show the min and max introduced number ---\n");
    System.out.println("The user introduce ten numbers...\n");

    int[] numbers = {1, 5, 6, 3, 8, 3, 12, 45, 56, 10};
    int max = 0;
    int min = 0;

    // Init the array of numbers
    // int[] numbers = new int[10];

    // Input ten numbers
    //    int counter = 1;
    //    for (int i = 0; i < 10; i++) {
    //      System.out.print(counter + ". Tell me a number: ");
    //      numbers[i] = s.nextInt();
    //      counter++;
    //    }

    //    for (int i : numbers) {
    //      //      System.out.println("\n" + i);
    //
    //      System.out.println(Math.max(i, numbers[i]));
    //    }

    for (int i = 0; i < numbers.length; i++) {
      //      System.out.println(i);
      if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }

    System.out.println("The max number is: " + max);
    System.out.println("The max number is: " + min);

    s.close();
  }

  // Show the min and max number

  //    int number = 0;
  //    int number2 = 4;
  //
  //    System.out.println(Math.max(number, number2));

}