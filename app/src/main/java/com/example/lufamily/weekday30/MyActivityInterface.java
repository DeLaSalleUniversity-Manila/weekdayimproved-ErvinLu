package com.example.lufamily.weekday30;

import android.widget.TextView;

/**
 * Created by Lu Family on 11/28/2015.
 */
public interface MyActivityInterface {
    // Displays the date picker and day
    public void pickDateDisplayDay();

    // Sets the TextView to message
    public void setText(String message);

    // Adds fade animation to the text
    public void fadeAnimation(TextView tv);
}
