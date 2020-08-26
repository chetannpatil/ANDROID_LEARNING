package com.example.chetan.workoutapp;

/**
 * Created by chetan on 3/3/17.
 */
public class WorkOut
{
    String nameStr ;
    String descriptionStr ;

    public WorkOut(String n ,String d)
    {
        this.nameStr = n ;
        this.descriptionStr = d;
    }

     public static WorkOut [] modelsWorkArray = { new WorkOut("vidya","38-24-36"),new WorkOut("Soujanya","32-24-42"),new WorkOut("monika","46-32-36") };

    @Override
    public String toString()
    {
       return this.nameStr;
    }

    public String getNameStr()
    {
        return this.nameStr;
    }
    public String getDescriptionStr()
    {
        return this.descriptionStr ;
    }
}
