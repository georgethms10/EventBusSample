package com.example.eventbussample;

/*
 * Basic event bus example to send some data between activities
 * 
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import de.greenrobot.event.EventBus;

public class MainActivity extends Activity {

	Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button1 = (Button) findViewById(R.id.button1);
		EventBus.getDefault().register(MainActivity.this);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Second.class);
				startActivity(i);
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		   EventBus.getDefault().unregister(MainActivity.this);

	}

	public void onEvent(CloseEvent event) {
		Toast.makeText(getApplicationContext(), event.getButtonTitle(),
				Toast.LENGTH_SHORT).show();
		button1.setText(event.getButtonTitle());
	}

 
}
