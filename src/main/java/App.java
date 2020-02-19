import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        UserFile userFile = new UserFile();
        UserService userService = new UserService(userFile.readFile());
        User user1 = new User ("Marcin", 35);
        User user2 = new User ("pedro", 45);
        User user3 = new User ("manuel", 46);
        User user4 = new User ("lolo", 46);

        userService.AddUserList(user1);
        userService.AddUserList(user2);
        userService.AddUserList(user3);
        userService.AddUserList(user4);

        userFile.writeFile(userService.getUserList());


        userService.ShowList(userService.getUserList());

        userService.DeleteUser("Marcin");
        userFile.writeFile(userService.getUserList());


         userService.ShowList(userService.getUserList());

    }
}

