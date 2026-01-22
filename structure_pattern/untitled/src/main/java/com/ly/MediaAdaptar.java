package com.ly;

public class MediaAdaptar implements MediaPlayer{
    private  OldPlayer oldPlayer;

    public MediaAdaptar(OldPlayer oldPlayer){
        this.oldPlayer=oldPlayer;
    }

    @Override
    public void play(String file) {
        oldPlayer.playFile(file);
    }
}
