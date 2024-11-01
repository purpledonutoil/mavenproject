package javadev1;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static class User{
        private String name;
        private String lastName;

        public User(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }
    }
    public static void main(String[] args) {
        User user = new User("Anastasia", "Shandurska");

        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
    }
}
