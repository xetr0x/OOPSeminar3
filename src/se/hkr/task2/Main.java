package se.hkr.task2;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        Path ThePath = Path.of("C:\\OOPSeminar3\\OOPSeminar3\\src\\se\\hkr\\participants.txt");
        main.letsRun(ThePath);

    }

    public ArrayList letsRun(Path path){
        try {
            File myObj = new File(path.toString());
            Scanner myReader = new Scanner(myObj);
            Random r = new Random();
            ArrayList<Comptetitor> list = new ArrayList<Comptetitor>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Time time = new Time(r.nextInt(1, 3),r.nextInt(0, 59),r.nextInt(0, 59));
                Comptetitor competitor = new Comptetitor(data.split(",")[0],
                        Integer.parseInt(data.split(",")[1]), data.split(",")[2],time);
                list.add(competitor);
            }
            list.sort(null);
            for (Comptetitor n: list){
                System.out.println(n);
            }
            writeToFile(list);
            myReader.close();}

        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();


        }
        return null;
    }

    public void writeToFile(ArrayList<Comptetitor> list){

        try {
            FileOutputStream file = new FileOutputStream("RunningTimeResults.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(list);

            file.close();
            System.out.println("The file has been written!");
        }catch (IOException exeption){
            System.out.println("Something went wrong");

        }
    }

}