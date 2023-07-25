package week11.day1;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Exceptions_4 {
    public static void main(String[] args) {

        File file = null;
        try {
            file = new File("somefilename.txt");

            if(!file.exists())
                file.createNewFile();
        }
        catch (IOException ex){
            System.out.println("Couldn't create or read a file");
        }
        finally { //a block which will be executed anyway
            file.delete();
        }

//        try {
//            //trying to connect to database with ip 192.168.2.4
//        }
//        catch(SQLException ex){
//            System.out.println("Couldn't connect or read to/from database");
//            then I will try to connect 192.168.5.64
//        }
//        finally{
//            //close connection with database
//        }

    }
}
