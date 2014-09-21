package wens.mp3player;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MP3Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mp3);
	}
	/*
	 * 生成一个menu菜单，当点击menu按钮时，弹出菜单，会调用该方法，我们可以在这个方法当中加入自己的按钮控件
	 * 
	  */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(0, 1, 1,R.string.mp3_updatelist);
		return true;


	}

}
