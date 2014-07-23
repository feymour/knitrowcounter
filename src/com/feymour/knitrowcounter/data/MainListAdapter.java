package com.feymour.knitrowcounter.data;

import com.feymour.knitrowcounter.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainListAdapter extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] menuEntryTexts;
	private final Integer[] imageIds;
	
	/**
	 * An adapter for the main project list. This adapter contains both an image and
	 * some text for each list entry.
	 * @param context The context of the adapter.
	 * @param web
	 * @param imageIds An array over the images used in this adapter.
	 */
	public MainListAdapter(Activity context, String[] menuEntryTexts, Integer[] imageIds) {
		super(context, R.layout.item_main_list, menuEntryTexts);
		this.context = context;
		this.menuEntryTexts = menuEntryTexts;
		this.imageIds = imageIds;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();

		View rowView = inflater.inflate(R.layout.item_main_list, null, true);

		TextView txtTitle = (TextView) rowView.findViewById(R.id.item_main_list_text_view);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.item_main_list_image_view);

		txtTitle.setText(menuEntryTexts[position]);
		imageView.setImageResource(imageIds[position]);

		return rowView;
	}
}