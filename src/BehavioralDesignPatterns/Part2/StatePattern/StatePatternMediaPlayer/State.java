package BehavioralDesignPatterns.Part2.StatePattern.StatePatternMediaPlayer;

public interface State {

    void pause(MediaPlayer mediaPlayer);

    void play(MediaPlayer mediaPlayer);
}
