import java.util.ArrayList;
import java.util.Iterator;

public class UserService {
    private ArrayList<User> userList;

    public UserService() {
        this.userList = userList;
    }

    public UserService(ArrayList<User> userList) {
        this.userList = userList;
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

    public void ShowList(ArrayList<User> list){

        Iterator<User> userIterator = list.iterator();
        System.out.println("------------------------------------");
        while (userIterator.hasNext()){
            System.out.println(userIterator.next().showUser());
        }
        System.out.println("------------------------------------");
    }


    public ArrayList<User> getUserList() {
        return userList;
    }


}

