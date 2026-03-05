package com.ly;

public class MiddleHelper implements IHelp{
    private IHelp help;
    private static final int MAX_HELP_LEVEL = 5;
    public MiddleHelper(IHelp help){
        this.help=help;
    }
    @Override
    public void help(int num) {
        if (num==MAX_HELP_LEVEL){
            System.out.println("MiddleHelper:::::");
        }
        else {
            help.help(num);
        }
    }
}
