import java.util.Scanner;

public class numbers {
    String name;
    int sub[] = new int[5];
    int total;
    float percent;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name = sc.nextLine();

        System.out.print("Enter marks in five subjects: ");
        for (int i = 0; i < 5; i++) {
            sub[i] = sc.nextInt();
            total += sub[i];
        }
        percent = (float) total / 5; // Ensure float division for accurate percentage
    }

    public void show() {
        System.out.print("Student Name: " + name);
    
        for (int i = 0; i < 5; i++) {
            System.out.println(sub[i]);
        }
        System.out.print("Student total marks: " + total);
        System.out.print("Student percentage: " + percent);
        if (percent > 90)
            System.out.println("Grade: A");
        else if (percent > 80)
            System.out.println("Grade: B");
        else if (percent > 70)
            System.out.println("Grade: C");
        else if (percent > 60)
            System.out.println("Grade: D");
        else if (percent > 50)
            System.out.println("Grade: E");
        else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {
        numbers s1[] = new numbers[5];

        for (int i = 0; i < 5; i++) {
            s1[i] = new numbers();
            s1[i].getdata();
        }
        for (int i = 0; i < 5; i++) {
            s1[i].show();
        }
    }
}
