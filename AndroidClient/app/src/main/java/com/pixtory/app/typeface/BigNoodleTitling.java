package com.pixtory.app.typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by aasha.medhi on 11/24/15.
 */
public class BigNoodleTitling {
    private static Typeface mFont = null;

    private static Typeface getFontTypeface(Context context) {
        if (mFont == null)
            mFont = Typeface.createFromAsset(context.getAssets(), "fonts/big_noodle_titling.ttf");
        return mFont;
    }

    public static TextView applyFont(Context context, TextView textView) {
        if (textView != null)
            textView.setTypeface(getFontTypeface(context));
        return textView;
    }
}

