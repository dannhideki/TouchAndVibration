package com.example.hideki.touchandvibration.game.state;

import android.view.MotionEvent;

import com.example.hideki.touchandvibration.controller.Assets;
import com.example.hideki.touchandvibration.framework.util.Painter;

public class LoadState extends State {
	@Override
	public void init() {
		Assets.load();
	}

	@Override
	public void update(float delta) {
		setCurrentState(new MenuState());
	}

	@Override
	public void render(Painter g) {
	}

	@Override
	public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
		return false;
	}
}