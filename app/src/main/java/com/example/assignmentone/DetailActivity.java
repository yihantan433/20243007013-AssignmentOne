package com.example.assignmentone;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 1. 取出 MainActivity 通过 Intent 传来的编号（0~3），默认 0
        int index = getIntent().getIntExtra("topic_index", 0);

        // 2. 从 array.xml 读取三个数组：标题、详情正文、图片名
        Resources res = getResources();
        String[] titles = res.getStringArray(R.array.string_array_titles);
        String[] contents = res.getStringArray(R.array.string_array_content);
        String[] imageNames = res.getStringArray(R.array.string_array_images);

        // 3. 用编号作数组下标，取出对应内容填充标题和正文
        TextView txtTitle = findViewById(R.id.txt_detail_title);
        TextView txtContent = findViewById(R.id.txt_detail_content);
        txtTitle.setText(titles[index].trim());
        txtContent.setText(contents[index].trim());

        // 4. 根据图片名动态查找 drawable 资源，填充图片
        //    trim() 去除数组中可能存在的空格，否则查找会失败
        ImageView imgDetail = findViewById(R.id.img_detail);
        int imageId = res.getIdentifier(imageNames[index].trim(), "drawable", getPackageName());
        imgDetail.setImageResource(imageId);
    }
}
