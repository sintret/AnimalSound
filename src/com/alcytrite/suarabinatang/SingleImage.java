package com.alcytrite.suarabinatang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SingleImage extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singleimage);

		int position = this.getIntent().getExtras().getInt("position");
		ImageView iv = (ImageView) findViewById(R.id.singleimage);
		int image = ImageAdapter.mThumbsId[position];
		iv.setImageResource(image);
		final Intent intent = new Intent(this, SoundBase.class);
		intent.putExtra("position", position);
		startService(intent);
		iv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				stopService(intent);
				finish();
			}

		});

	}

}
