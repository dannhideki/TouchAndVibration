package com.example.hideki.touchandvibration.game.state;

import android.content.Context;
import android.view.MotionEvent;

import com.example.hideki.touchandvibration.controller.Assets;
import com.example.hideki.touchandvibration.framework.util.Painter;

public class LoadState extends State {

    private Context context;

    public LoadState(Context context){
        this.context = context;
    }

	@Override
	public void init() {
		Assets.load();
	}

	@Override
	public void update(float delta) {
		setCurrentState(new MenuState(context));
	}

	@Override
	public void render(Painter g) {
	}

	@Override
	public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
		return false;
	}
}