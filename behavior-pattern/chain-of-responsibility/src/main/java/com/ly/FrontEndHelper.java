package com.ly;

public class FrontEndHelper implements IHelp{
    private static final int MAX_HELP_LEVEL = 5;
    private IHelp help;

    public FrontEndHelper(IHelp help){
        this.help=help;
    }
    @Override
    public void help(int num) {
        if (num==MAX_HELP_LEVEL){
            System.out.println("FrontEndHelper:::::");
        }

        else {
            help.help(num);
        }


    }
}
