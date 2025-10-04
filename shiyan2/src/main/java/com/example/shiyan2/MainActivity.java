package com.example.shiyan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化按钮并设置点击监听
        Button btnLinear = findViewById(R.id.btn_linear_layout);
        Button btnTable = findViewById(R.id.btn_table_layout);
        Button btnConstraint1 = findViewById(R.id.btn_constraint_layout1);
        Button btnConstraint2 = findViewById(R.id.btn_constraint_layout2);

        btnLinear.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnConstraint1.setOnClickListener(this);
        btnConstraint2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int id = v.getId();

        if (id == R.id.btn_linear_layout) {
            intent = new Intent(this, LinearLayoutActivity.class);
        } else if (id == R.id.btn_table_layout) {
            intent = new Intent(this, TableLayoutActivity.class);
        } else if (id == R.id.btn_constraint_layout1) {
            intent = new Intent(this, ConstraintLayout1Activity.class);
        } else if (id == R.id.btn_constraint_layout2) {
            intent = new Intent(this, ConstraintLayout2Activity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}