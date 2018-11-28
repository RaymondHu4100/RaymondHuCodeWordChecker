package com.company;

public class CodeWordChecker implements StringChecker
{
    private int minLen;
    private int maxLen;
    private String symbol;
    public CodeWordChecker(int minLen, int maxLen, String symbol)
    {
        this.minLen = minLen;
        this.maxLen = maxLen;
        this.symbol = symbol;
    }
    public CodeWordChecker(String symbol)
    {
        this.minLen = 6;
        this.maxLen = 20;
        this.symbol = symbol;
    }
    public boolean isValid(String str)
    {
        if ((str.indexOf(symbol) != -1) || (str.length() < minLen) || (str.length() > maxLen))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(5,8,"$");
        StringChecker sc2 = new CodeWordChecker("pass");

        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));

        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("MypassPort"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
