package com.example.chetan.listviewtest;

import java.io.Serializable;
//import java.io.StreamTokenizer;

/**
 * Created by chetan on 8/10/16.
 */
public class Actor implements Serializable {

    private String name;
    private  int age;
   // private boolean male;

    public Actor()
    {

    }
    public  Actor(String name,int age)
    {
        this.name= name;
        this.age = age;
       // this.male = male;
    }

    public void setName(String name1)
    {
        this.name = name1;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAge(int age1)
    {
        this.age = age1;
    }

    public int getAge()
    {
        return this.age;
    }
   /* public void setMale(boolean male1)
    {
        this.male = male1;
    }

    public boolean getMale()
    {
        return this.male;
    }
    */

}
