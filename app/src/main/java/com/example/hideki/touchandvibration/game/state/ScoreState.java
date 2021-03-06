package com.example.hideki.touchandvibration.game.state;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.MotionEvent;

import com.example.hideki.touchandvibration.controller.GameMainActivity;
import com.example.hideki.touchandvibration.framework.util.Painter;


public class ScoreState extends State {
	private String highScore;

    private Context context;

    public ScoreState(Context context){
        this.context = context;
    }

	@Override
	public void init() {
		highScore = GameMainActivity.getHighScore() + "";
	}

	@Override
	public void update(float delta) {
	}

	@Override
	public void render(Painter g) {
		g.setColor(Color.rgb(53, 156, 253));
		g.fillRect(0, 0, GameMainActivity.GAME_WIDTH,
				GameMainActivity.GAME_HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(Typeface.DEFAULT_BOLD, 50);
		g.drawString("The All-Time High Score", 120, 175);
		g.setFont(Typeface.DEFAULT_BOLD, 70);
		g.drawString(highScore, 370, 260);
		g.setFont(Typeface.DEFAULT_BOLD, 50);
		g.drawString("Touch the screen.", 220, 350);
	}

	@Override
	public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
		if (e.getAction() == MotionEvent.ACTION_UP) {
			setCurrentState(new MenuState(context));
		}
		return true;
	}
}