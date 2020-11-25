import java.io.*;
import java.util.Scanner;


public class DataOper {
    public static void main(String[] args) {
        //Handling files
        System.out.println("------------------------------------------------");
        System.out.println("1. Handling files");

        File dir = new File("C:\\Users\\Admin\\Java\\JavaReview\\DataOper");
        if(dir.exists()){
            System.out.println("Directory name is " + dir.getName());
            String[] files = dir.list();
            System.out.println(files.length + " files found: ");
            for (int i = 0; i < files.length; i++) {
                System.out.println("file " + (i + 1) + ": " + files[i]);
            }
        }else{
            System.out.println("folder not found");
        }

        //Reading console input
        System.out.println("------------------------------------------------");
        System.out.println("2. Reading console input");

        System.out.println("Enter your name: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer2= new BufferedReader(isr);
        String input="";
        try{
            input = buffer2.readLine();
            System.out.println(input + ", you are welcome. ");
            buffer2.close();
        }catch (IOException e){
            System.out.println("An input error has occurred");
        }

        /*System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        try{
            String in= scanner.nextLine();
            System.out.println("you are " + in);
        }catch (Exception e){
            System.out.println("An input error has occurred");
        }*/

        System.out.println("------------------------------------------------");
        System.out.println("3. Reading files");

        try{
            FileReader file = new FileReader("C:\\Users\\Admin\\Java" +
                    "\\JavaReview\\DataOper\\A Winter Night.txt");
            BufferedReader buffer3 = new BufferedReader(file);
            String line ="";
            while((line = buffer3.readLine())!=null){
                System.out.println(line);
            }
            buffer3.close();
        }catch(IOException e){
            System.out.println("A read error has occurred");
        }

        System.out.println("------------------------------------------------");
        System.out.println("4. Writing files");

        try{
            FileWriter file = new FileWriter("New File.txt");
            BufferedWriter buffer4 = new BufferedWriter(file);
            buffer4.append("AppendLine...");
            buffer4.newLine();
            buffer4.write("New line1...\n");
            buffer4.close();
        }catch(IOException e){
            System.out.println("A write error has occurred");
        }
    }
}
