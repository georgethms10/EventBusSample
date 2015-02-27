package com.example.eventbussample;

import java.util.EventListener;

import de.greenrobot.event.EventBus;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second extends Activity implements EventListener {

	Button button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		button2 = (Button) findViewById(R.id.button2);

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EventBus.getDefault().post(
						new CloseEvent("Hi from eventBus :)"));
				Second.this.finish();

			}
		});
	}

}
