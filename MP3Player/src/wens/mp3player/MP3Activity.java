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
	 * ����һ��menu�˵��������menu��ťʱ�������˵�������ø÷��������ǿ���������������м����Լ��İ�ť�ؼ�
	 * 
	  */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(0, 1, 1,R.string.mp3_updatelist);
		return true;


	}

}
