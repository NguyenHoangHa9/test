package JSONEx;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBook {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("Book.json")){
            Object obj = jsonParser.parse(reader);

            JSONArray BookList = (JSONArray) obj;
            System.out.println(BookList);

            BookList.forEach(emp -> parseBookObject((JSONObject) emp) );

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void parseBookObject(JSONObject Book){
        JSONObject BookObject = (JSONObject) Book.get("Book");

        String FirstName = (String) BookObject.get("Name");
        System.out.println(FirstName);

        String Name = (String) BookObject.get("Author");
        System.out.println(Name);

        String year = (String) BookObject.get("Chapter number");
        System.out.println(year);

        String Author = (String) BookObject.get("year of manufacture");
        System.out.println(Author);

    }
}
