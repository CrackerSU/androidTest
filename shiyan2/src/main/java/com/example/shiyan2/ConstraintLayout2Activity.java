package com.example.shiyan2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConstraintLayout2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout2);

        // 设置标签点击事件
        setupTabClicks();
    }

    private void setupTabClicks() {
        TextView tabSpaceStations = findViewById(R.id.tabSpaceStations);
        TextView tabFlights = findViewById(R.id.tabFlights);
        TextView tabRovers = findViewById(R.id.tabRovers);
        View tabIndicator = findViewById(R.id.tabIndicator);

        View.OnClickListener tabClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 重置所有标签样式
                tabSpaceStations.setTextColor(0xFF666666);
                tabSpaceStations.setTypeface(null, android.graphics.Typeface.NORMAL);

                tabFlights.setTextColor(0xFF666666);
                tabFlights.setTypeface(null, android.graphics.Typeface.NORMAL);

                tabRovers.setTextColor(0xFF666666);
                tabRovers.setTypeface(null, android.graphics.Typeface.NORMAL);

                // 设置选中标签样式
                TextView selectedTab = (TextView) v;
                selectedTab.setTextColor(0xFF000000);
                selectedTab.setTypeface(null, android.graphics.Typeface.BOLD);

                // 移动指示器到选中的标签
                tabIndicator.setX(selectedTab.getX());
            }
        };

        tabSpaceStations.setOnClickListener(tabClickListener);
        tabFlights.setOnClickListener(tabClickListener);
        tabRovers.setOnClickListener(tabClickListener);
    }
}