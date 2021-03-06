package com.zia.freshdocs.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.zia.freshdocs.R;

public class DialogHolo extends Dialog {

	private final Context mContext;
	private TextView mTitle;

	public DialogHolo(Context context) {
		this(context, 0);
	}

	public DialogHolo(Context context, int theme) {
		super(context, theme);
		mContext = context;
		View customView = View.inflate(mContext, R.layout.alert_dialog_holo,
				null);
		mTitle = (TextView) customView.findViewById(R.id.alertTitle);
		FontLoader.loadFont(mTitle, FontLoader.ROBOTO_REGULAR);
		setContentView(customView);
	}

	@Override
	public void setTitle(CharSequence text) {
		mTitle.setText(text);
	}

	@Override
	public void setTitle(int textResId) {
		mTitle.setText(textResId);
	}

}