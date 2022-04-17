package behavioral.state.states;

import behavioral.state.ui.Player;

public class PlayingState extends State{

    PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "paused";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
