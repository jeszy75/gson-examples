import java.util.Arrays;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        var gson = new Gson();
        var s1 = gson.toJson(Math.PI);
        var s2 = gson.toJson("Hello, World!");
        var s3 = gson.toJson(false);
        var s4 = gson.toJson(null);
        var s5 = gson.toJson(new int[] {1, 2, 3, 4, 5});

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        var result1 = gson.fromJson(s1, Double.class);
        var result2 = gson.fromJson(s2, String.class);
        var result3 = gson.fromJson(s3, Boolean.class);
        var result4 = gson.fromJson(s4, Object.class);
        var result5 = gson.fromJson(s5, int[].class);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(Arrays.toString(result5));
    }

}