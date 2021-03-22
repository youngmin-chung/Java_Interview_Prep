/*
 * Abstraction for technical interview
 */

public class Main {

   public static void main(String[] args) {
        UserTableManager userTableManager = new UserTableManager();

        // AbstractTableManager<UserData> abstractTableManager = new AbstractTableManager();

       UserData userData = new UserData("Elizabeth Olson", "scaletWitch@mcu.com");
       userTableManager.putItem(userData);

    }

}