import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserFile {

    private UserService userService;
    private ArrayList<User> userList;

    public ArrayList<User> readFile (){

        try{
            ObjectInputStream readingFile = new ObjectInputStream(new FileInputStream("C:/Test/test.txt"));
            userList = (ArrayList <User>) readingFile.readObject();
            readingFile.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found 99");
        }
        return userList;
    }

    public void writeFile(ArrayList<User> userList){
        try{
            ObjectOutputStream writtingFile = new ObjectOutputStream(new FileOutputStream("C:/Test/test.txt"));
            writtingFile.writeObject(userList);
            writtingFile.close();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found 66");
        }
    }
}
