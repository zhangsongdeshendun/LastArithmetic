package app;


import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.*;

public class Test {


    public static void main(String[] args) {

        User u1 = new User("song", 3);
        User u2 = new User("wen", 1);
        User u3 = new User("mu", 9);
        User u4 = new User("mu", 4);
        ArrayList<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        for (User user : list) {
            System.out.println(user.toString());
        }
        System.out.println("*********************************");
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });


        for (User user : list) {
            System.out.println(user.toString());
        }


    }


    public final void say() {
        System.out.println("1234");
    }

    public static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name=" + name + "age=" + age;
        }
    }


}
