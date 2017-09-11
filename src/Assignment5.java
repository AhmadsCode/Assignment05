/*
@author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 5
 * Problem 5.9
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
*/
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creates a Scanner

        System.out.print("Enter # of students: "); // Prompts the user to enter # of students
        double numOfStudents = input.nextInt();

        double score, 					// Holds students' score
                highestScore = 0, 			// Highest score
                secondHighestScore = 0;	// Second highest score

        String name = "", 		// students' name
                student1 = "", 	// Name of student with highest score
                student2 = "";	// Name of student with second highest score

        // Prompts the user to enter each students' name and their score.
        System.out.println("Enter each students' name and their score:");

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextDouble();

            if (i == 0) {
                // Make the first student the highest scoring student.
                highestScore = score;
                student1 = name;
            }
            else if (i == 1 && score > highestScore) {
                // Second student scored higher than first student

                secondHighestScore = highestScore;
                highestScore = score;
                student2 = student1;
                student1 = name;
            }
            else if (i == 1) {
                // Second student scored lower than first student
                secondHighestScore = score;
                student2 = name;
            }
            else if (i > 1 && score > highestScore && score > secondHighestScore) {
                // Last student entered has the highest score
                secondHighestScore = highestScore;
                student2 = student1;
                highestScore = score;
                student1 = name;
            }
            else if (i > 1 && score > secondHighestScore) {
                // Last student entered has the second highest score
                student2 = name;
                secondHighestScore = score;
            }
        }

        // Displays student with the highest score and student with the second-highest score
        System.out.println("Student with highest score: " + student1 +
                        "\nStudent with second highest score: " + student2);
    }
}