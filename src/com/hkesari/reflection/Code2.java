package com.hkesari.reflection;

import java.lang.reflect.Field;
//reflection can allow to access private field dynamically
//Field.get(), method.invoke.
class User{
    private String name;
    private String pwd;

    User(String name, String pwd){
        this.name = name;
        this.pwd = pwd;
    }

    private String getPwd(){
        return this.pwd;
    }
}
public class Code2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User U = new User("John","123idif");

        Field field = User.class.getDeclaredField("pwd");
        field.setAccessible(true);
        String pwd = (String)field.get(U);

        System.out.println(pwd);
    }

}
