package typeadapter;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        var s1 = new Gson().toJson(LocalDate.now()); // Requires the --add-opens java.base/java.time=ALL-UNNAMED VM option
        System.out.println(s1);
        var gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
        var s2 = gson.toJson(LocalDate.now());
        System.out.println(s2);
    }

}