package com.app.in2.javaexp3;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by jaychung on 3/26/16.
 */
public class BookActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Book book = new Book();
        book.setName("something");

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
