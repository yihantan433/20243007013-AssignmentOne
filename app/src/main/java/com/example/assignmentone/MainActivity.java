package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    /** Facilities 按钮点击事件：跳转到详情页，传递编号 0 */
    public void onFacilitiesClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_index", 0);
        startActivity(intent);
    }

    /** Events 按钮点击事件：跳转到详情页，传递编号 1 */
    public void onEventsClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_index", 1);
        startActivity(intent);
    }

    /** Clubs 按钮点击事件：跳转到详情页，传递编号 2 */
    public void onClubsClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_index", 2);
        startActivity(intent);
    }

    /** Support 按钮点击事件：跳转到详情页，传递编号 3 */
    public void onSupportClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_index", 3);
        startActivity(intent);
    }
}
