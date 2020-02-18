import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        //ADD USER AND SHOW
        UserService userService = new UserService();

        User user1 = new User ("Marcin", 35);
        User user2 = new User ("pedro", 45);
        User user3 = new User ("paco", 46);

        userService.AddUserList(user1);
        userService.AddUserList(user2);
        userService.AddUserList(user3);

        userService.writeUserList(userService.getUserList());

        userService.ShowList(userService.getUserList());

        userService.DeleteUser("Marcin");
        userService.writeUserList(userService.getUserList());

         userService.ShowList(userService.getUserList());

    }
}

