package com.javapapers.android.imagegallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList imageUrlList = prepareData();
        DataAdapter dataAdapter = new DataAdapter(getApplicationContext(), imageUrlList);
        recyclerView.setAdapter(dataAdapter);
    }

    private ArrayList prepareData() {

        String imageUrls[] = { //  фото з інтернету
                "https://www.prostir.ua/wp-content/uploads/2018/03/%D0%9F%D0%9D%D0%A3.jpg",
                "https://infoindustria.com.ua/wp-content/uploads/2019/01/Ukraina-400x267.jpg",
                "https://uamodna.com/assets/articles/image/m/l/8/ml81yfbw/content_full.jpg",
                "https://mib.od.ua/wp-content/uploads/2019/01/21312323412312312312312245467.jpg",
                "https://cs7.pikabu.ru/post_img/2019/01/24/7/1548328763184614229.jpg",
                "https://imgclf.112.ua/original/2019/07/11/395072.jpg?timestamp=1562820969",
                "https://static.ukrinform.com/photos/2019_01/thumb_files/630_360_1547706076-388.jpg",
                "https://racurs.ua/content/images/Publication/News/11/60/34/preview_w698zc0.jpg",
                "https://www.zr.ru/_ah/img/iwGhkZo0NBD3il4BuDcHsg=s800",
                "https://versiya.info/uploads/posts/2019-03/medium/1553594330_krg.jpg",
                "https://s0.rbk.ru/v6_top_pics/resized/1400x700_crop/media/img/9/62/755500662731629.jpg",
                "https://newsone.ua/img/forall/u/0/25/11111111111111111111111111111111111111.jpg",
                "https://media.acc.cv.ua/news/article/2019/04/03/43196/yOieQgl4pz3V04Y7Aw3W.w575.jpg",
                "https://naszwybir.pl/wp-content/uploads/2016/04/it-1078x516.jpg",
                "https://karpaty.life/uploads/0/ivano-frankivska-oblast.jpg"};

        ArrayList imageUrlList = new ArrayList<>();
        for (int i = 0; i < imageUrls.length; i++) {
            ImageUrl imageUrl = new ImageUrl();
            imageUrl.setImageUrl(imageUrls[i]);
            imageUrlList.add(imageUrl);
        }
        Log.d("MainActivity", "List count: " + imageUrlList.size());
        return imageUrlList;
    }
}
