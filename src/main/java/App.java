import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        //ADD USER AND SHOW
        UserService userService = new UserService();
        User user1 = new User ("Marcin", 35);
        User user2 = new User ("pedro", 45);
        userService.AddUserList(user1);
        userService.AddUserList(user2);


        userService.ShowList();

        //DELETE USER AND SHOW
        userService.DeleteUser("Marcin");

        userService.ShowList();


    }
}

