package org.example;

import java.util.*;
public class RemoveA
{
    public String removeA(String str)
    {
        String res = str;
        int len = str.length();

        if(len > 2)
        {
            if(str.charAt(0) == 'A' && str.charAt(1) == 'A')
            {
                res = str.substring(2);
            }
            else if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
            {
                res = str.substring(1);
            }
            else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
            {
                res = str.charAt(0) + str.substring(2);
            }
        }
        else
        {
            if(len == 2)
            {
                if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
                {
                    res = str.charAt(1) + "";
                }
                else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
                {
                    res = str.charAt(0) + "";
                }
                else
                {
                    res = "";
                }
            }
            else
            {
                res = "";
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        RemoveA str = new RemoveA();
        System.out.println(str.removeA("ABCDA"));
    }
}