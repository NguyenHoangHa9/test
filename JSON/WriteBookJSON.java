package JSONEx;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteBookJSON {
    public static void main(String[] args) {
        JSONObject BookDetails = new JSONObject();
        BookDetails.put("Name","Khéo ăn khéo nói sẽ có được cả thiên hạ");
        BookDetails.put("Author","Trác Nhã");
        BookDetails.put("Chapter number",22);
        BookDetails.put("year of manufacture",2018);

        JSONObject BookObject = new JSONObject();
        BookObject.put("Book",BookDetails);

        JSONObject BookDetails2 = new JSONObject();
        BookDetails2.put("Name","How to Win Friends and Influence People");
        BookDetails2.put("Author","Dale Carnegie");
        BookDetails2.put("Chapter number",39);
        BookDetails2.put("year of manufacture",1975);

        JSONObject BookObject2 = new JSONObject();
        BookObject2.put("Book",BookDetails2);


        JSONObject BookDetails3 = new JSONObject();
        BookDetails3.put("Name","Think and Grow Rich");
        BookDetails3.put("Author","Napoleon Hill");
        BookDetails3.put("Chapter number",25);
        BookDetails3.put("year of manufacture",1937);

        JSONObject BookObject3 = new JSONObject();
        BookObject3.put("Book",BookDetails3);

        JSONArray BookList = new JSONArray();
        BookList.add(BookObject);
        BookList.add(BookObject2);
        BookList.add(BookObject3);

        try (FileWriter file = new FileWriter("Book.json")) {
            file.write(BookList.toJSONString());
            file.flush();
        } catch (IOException a) {
            a.printStackTrace();
        }
    }
}
