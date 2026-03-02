package com.ly;

public class MediaAdapter implements MediaPlayer{
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(){
        this.advanceMediaPlayer = new AdvanceMediaPlayer();
    }
    @Override
    public void play(String audioType, String fileName) {
        advanceMediaPlayer.playMp4(audioType, fileName);
    }
}
