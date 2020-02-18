import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class UserService {
    private ArrayList<User> userList;

    //private Iterator<User> userIterator;
    public UserService() {
        this.userList = new ArrayList<User>();
        // this.userIterator = userList.iterator();
    }

    public void AddUserList (User user){
        userList.add(user);
    }

    public void DeleteUser (String user){
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()){
            if (userIterator.next().getName().equals(user)) {
                userIterator.remove();
            }
        }
    }

    public void writeFile(){
        try{
            ObjectOutputStream writtingFile = new ObjectOutputStream(new FileOutputStream("C:/Test/test.txt"));
            writtingFile.writeObject(userList);
            writtingFile.close();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public void readFile (){

        try{
            ObjectInputStream readingFile = new ObjectInputStream(new FileInputStream("C:/Test/test.txt"));
            userList = (ArrayList <User>) readingFile.readObject();
            readingFile.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found");
        }
    }


    public void ShowList(ArrayList<User> list){

        Iterator<User> userIterator = list.iterator();
        while (userIterator.hasNext()){
            System.out.println(userIterator.next().showUser());
        }
    }


    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}

