package com.example.chetan.testspinner;

/**
 * Created by chetan on 22/2/17.
 */
public class Compliment
{
    protected static String getComment(String nameStr , String sizeStr)
    {
        String commentStr ="";
        String saSizes [] = sizeStr.split("-");

        int bbInt = Integer.parseInt(saSizes[0]);
        int westInt = Integer.parseInt(saSizes[1]);
        int assInt = Integer.parseInt(saSizes[2]);

        if (bbInt == 36 && westInt == 24 && assInt == 36 )
            commentStr = nameStr+" IS A PERFECT MODEL";
        else if (bbInt >= 40 && assInt < 40)
            commentStr = nameStr+" IS A DOODWAALI";
        else if (bbInt > 50 && assInt < 40)
            commentStr = nameStr+" IS A BADI DOODWAALI";
        else if (bbInt < 40 && assInt >= 40  && assInt < 50)
            commentStr = nameStr+" LOOKS BEAUTIFUL FROM BACK THAN FRONT";
        else if (bbInt < 40 && assInt >= 50 )
            commentStr = nameStr+" CAN KILL ANY 1 JUST BY GIVVING HIM HER BACK VIEW";
        else if (bbInt >= 40 && bbInt < 50 && assInt < 50 && assInt >= 40)
            commentStr = nameStr+" IS A DOODWAALI ,G***DWAALI AS WELL";

        else if (bbInt >= 40 && bbInt < 50 && assInt >= 50)
            commentStr = nameStr+" IS A DOODWAALI AND LOOKS DAMN ATTRACTIVE FROM BACK VIEW";
        else if (bbInt >= 50 && assInt < 50 && assInt >= 40)
            commentStr = nameStr+" IS A BADI DOODWAALI ,G***DWAALI AS WELL";
        else if (bbInt >= 50 && assInt >= 50 )
            commentStr = nameStr+" CAN NOT BE ROTATED BY ANYONE ON BED DUE TO HER HUGENESS lol";
        else if(bbInt < 36   && bbInt >= 30 && assInt < 36 && assInt >= 30)
            commentStr = nameStr+" IS A POOR ENTERTAINER";
        else if (bbInt < 30 && assInt < 30 )
            commentStr = nameStr+" IS A FANT WITHOUT POCKETS WHERE NOBODY KNOWS WHERE TO PUT HANDS ..LOL";
        else
            commentStr = nameStr+" IS A DEAD WASTE BODY";

        return commentStr;
    }
}
