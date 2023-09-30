
import java.awt.BorderLayout;
import java.util.LinkedList;
import java.util.Scanner;

public class Calculation {

    Scanner sc = new Scanner(System.in);

    public String getValue(String msg) {
        System.out.println(msg);

        return sc.nextLine();
    }

    public double getNumber(String msg) {
        System.out.print(msg);
        double n;
        try {
            n = sc.nextDouble();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Please input number");
            n = getNumber(msg);
        }
        return n;
    }

    public void superlativeEquation() {
        LinkedList<Double> odd = new LinkedList<>();
        LinkedList<Double> even = new LinkedList<>();
        double a = getNumber("Enter A:");
        double b = getNumber("Enter B:");
        double result = 0;
        if (a == 0 && b == 0) {
            System.out.println("Phuong Trinh VSN.");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong Trinh VN");
        } else if (a > 0) {
            result = -b / a;
            System.out.println("Solution x = " + result);
        }

        if (a % 2 != 0) {
            odd.add(a);
        }
        if (b % 2 != 0) {
            odd.add(b);
        }
        if (result % 2 != 0) {
            odd.add(result);
        }
        int n = odd.size();
        int check = 0;
        System.out.print("Number is Odd:");
        for (Double double1 : odd) {
            System.out.print(double1);
            check++;
            if (check == odd.size()) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println();
        if (a % 2 == 0) {
            even.add(a);
        }
        if (b % 2 == 0) {
            even.add(b);
        }
        if (result % 2 == 0) {
            even.add(result);
        }
        for (Double double2 : even) {
            System.out.println("Number is Even:" + double2);
        }
    }

    public void quadraticEquation() {
        LinkedList<Double> odd = new LinkedList<>();
        LinkedList<Double> even = new LinkedList<>();
        double x1 = 0, x2 = 0;
        double a = getNumber("Enter A:");
        double b = getNumber("Enter B:");
        double c = getNumber("Enter C:");
        double delta = 0;
        delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            System.out.println("Nhập dữ liệu sai!");
        } else {
            if (delta < 0) {
                System.out.println("Phuong Trinh VN!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                x2 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }

        if (a % 2 != 0) {
            odd.add(a);
        }
        if (b % 2 != 0) {
            odd.add(b);
        }
        if (c % 2 != 0) {
            odd.add(c);
        }
        if (delta % 2 != 0) {
            odd.add(delta);
        }
        if (x1 % 2 != 0) {
            odd.add(x1);
        }
        if (x2 % 2 != 0) {
            odd.add(x2);
        }
        int n = odd.size();
        int check = 0;
        System.out.print("Number is Odd:");
        for (Double double1 : odd) {
            System.out.print(double1);
            check++;
            if (check == odd.size()) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println();
        if (a % 2 == 0) {
            even.add(a);
        }
        if (b % 2 == 0) {
            even.add(b);
        }
        if (c % 2 == 0) {
            even.add(b);
        }
        if (delta % 2 == 0) {
            if (delta != 0) {
                even.add(delta);
            }
        }
        if (x1 % 2 == 0) {
            even.add(x1);
        }
        if (x2 % 2 == 0) {
            even.add(x2);
        }
        int check1 = 0;
        System.out.print("Number is Even:");
        for (Double double2 : even) {
            System.out.print(double2);
            check1++;
            if (check1 == even.size()) {
                continue;
            }
            System.out.print(", ");
        }
    }

    public void choice() {
        while (true) {
            System.out.println("========= Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            double choice = getNumber("Please choice one option: ");
            if (choice == 1) {
                System.out.println("----- Calculate Equation -----");
                superlativeEquation();
            } else if (choice == 2) {
                System.out.println("----- Calculate Quadratic Equation -----");
                quadraticEquation();
            } else if (choice == 3) {
                System.out.println("Exit Succesfull!");
                System.exit(0);
            } else {
                System.out.println("Try Again");
            }
        }
    }
}
