package map;

import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

    public static void main(String[] args) throws IOException {
        var url = new URL("http://country.io/names.json");
        var reader = new InputStreamReader(url.openStream());
        var type = new TypeToken<Map<String, String>>(){}.getType();
        Map<String, String> map = new Gson().fromJson(reader, type);
        System.out.println(map);
    }

}