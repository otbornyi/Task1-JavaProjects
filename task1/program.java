// package task1;

// import java.io.*;
// import java.util.Arrays;
// import java.util.Scanner;

// public class program {

//     static int getScannerNumber() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Input int number : ");
//         int num = in.nextInt();

//         return num;

//     }

//     static void writeNumbers() {
//         try (FileWriter writer = new FileWriter("task1/input.txt", false)) {

//             int a = getScannerNumber();
//             int b = getScannerNumber();
//             String num2 = "b " + b + "\n";
//             String num1 = "a " + a;

//             writer.write(num2);
//             writer.write(num1);
//             writer.flush();

//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }

//     static void Result(double num) {
//         try (FileWriter writer = new FileWriter("task1/output.txt", false)) {
//             String result = String.valueOf(num);
//             writer.write(result);
//             writer.flush();

//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }

//     static String[] loadNumbers(String path) throws Exception {
//         BufferedReader read = new BufferedReader(new FileReader(path));
//         String str;
//         String[] str2 = new String[2];
//         int i = 0;
//         while ((str = read.readLine()) != null) {
//             String result = str.replaceAll("\\D+", "");
//             str2[i] = result;
//             i++;
//         }
//         return str2;
//     }

//     public program() {
//     }

//     public static void main(String[] args) throws Exception {
//         writeNumbers();
//         String[] num = loadNumbers("task1/input.txt");
//         int a = Integer.parseInt(num[1]);
//         int b = Integer.parseInt(num[0]);
//         double c = Math.pow(a, b);
//         System.out.printf("%d ^ %d = %.0f", a, b, Math.pow(a, b));
//         Result(c);
//     }
// }