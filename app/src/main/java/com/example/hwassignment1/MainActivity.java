package com.example.hwassignment1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv;
        LinearLayout ll, ll2;
        LinearLayout.LayoutParams params;


        HorizontalScrollView scroll = new HorizontalScrollView(this);
        scroll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        LinearLayout mainlayout = new LinearLayout(this);
        mainlayout.setOrientation(LinearLayout.VERTICAL);
        mainlayout.setBackgroundColor(Color.BLACK);
        mainlayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        // Row 1
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("1");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Rules void hello1(int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 2 and 3


        ll2 = new LinearLayout(this);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
        params.setMargins(1, 1, 1, 1);
        ll2.setLayoutParams(params);

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new ViewGroup.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("2");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("3");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        ll.addView(tv);
        tv.setTextSize(18);
        ll2.addView(ll);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, 150);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("properties");
        tv.setBackgroundColor(getResources().getColor(R.color.colorWhiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll2.addView(tv);


        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        params = new LinearLayout.LayoutParams(800, 150);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("name");
        tv.setBackgroundColor(getResources().getColor(R.color.colorWhiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("category");
        tv.setBackgroundColor(getResources().getColor(R.color.colorWhiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        ll2.addView(ll);

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
        // params.setMargins(1,1,1,1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Day Hour Classification");
        tv.setBackgroundColor(getResources().getColor(R.color.colorWhiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        tv.setSingleLine(true);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Day and Time");
        tv.setBackgroundColor(getResources().getColor(R.color.colorWhiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        tv.setSingleLine(true);
        ll.addView(tv);

        ll2.addView(ll);
        mainlayout.addView(ll2);

        //Row 4

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("4");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Rule");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(800, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("C1");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("A1");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);

        //Row 5

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("5");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(800, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText(getResources().getString(R.string.s51));
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText(getResources().getString(R.string.s52));
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 6

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("6");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("int min");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("int max");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("String greeting");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 7

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setLayoutParams(params);
        tv.setText("7");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setText("Rule");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setText("From");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setText("To");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Greeting");
        tv.setBackgroundColor(getResources().getColor(R.color.colorBlue));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 8

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(1, 1, 1, 1);
        ll.setLayoutParams(params);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("8");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R10");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("0");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("11");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        tv.setPadding(1, 1, 1, 1);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Morning");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        tv.setPadding(1, 1, 1, 1);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 9

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("9");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R20");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("12");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("17");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Afternoon");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 10

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("10");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R30");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("18");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("21");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Evening");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        //Row 11

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("11");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R40");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("22");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("23");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Night");
        tv.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        tv.setTextSize(18);
        ll.addView(tv);

        mainlayout.addView(ll);


        scroll.addView(mainlayout);
        //   setContentView(scroll);


    }
}

