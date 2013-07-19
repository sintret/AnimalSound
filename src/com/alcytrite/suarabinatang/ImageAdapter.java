package com.alcytrite.suarabinatang;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;

	// constructor
	public ImageAdapter(Context c) {
		mContext = c;
	}

	public static Integer[] mThumbsId = { R.drawable.kodok, R.drawable.tokek,
			R.drawable.burung, R.drawable.macan
	};

	public static String[] thumbString = { "Kodok keok",
			"Tokek Koek", "Suara Burung berkicau", "macan Ngamuk" };

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbsId.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup group) {
		// TODO Auto-generated method stub
		ImageView imageView;
		if (view == null) {
			imageView = new ImageView(mContext);
			int h = mContext.getResources().getDisplayMetrics().densityDpi;
			imageView
					.setLayoutParams(new GridView.LayoutParams(h - 45, h - 45));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(1, 1, 1, 1);
		} else {
			imageView = (ImageView) view;

		}
		imageView.setImageResource(mThumbsId[position]);
		return imageView;
	}

}
