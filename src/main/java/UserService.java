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
            if (userIterator.next().getName() == user) {
                userIterator.remove();
            }
        }
    }


    public void ShowList(){
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()){
            System.out.println(userIterator.next().showUser());
        }
    }

}

