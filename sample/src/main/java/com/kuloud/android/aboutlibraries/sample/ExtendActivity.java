package com.kuloud.android.aboutlibraries.sample;

import android.os.Bundle;

import com.kuloud.android.aboutlibraries.Libs;
import com.kuloud.android.aboutlibraries.ui.LibsActivity;
import com.kuloud.android.aboutlibraries.sample.R;


public class ExtendActivity extends LibsActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        /*
        Intent intent = new Intent();
        intent.putExtra(Libs.BUNDLE_FIELDS, Libs.toStringArray(R.string.class.getFields()));
        intent.putExtra(Libs.BUNDLE_LIBS, new String[]{"activeandroid", "caldroid"});
        setIntent(intent);
        */

        setIntent(new Libs.Builder().withFields(R.string.class.getFields()).withLibraries("activeandroid", "caldroid").intent(this));


        super.onCreate(savedInstanceState);
    }
}
