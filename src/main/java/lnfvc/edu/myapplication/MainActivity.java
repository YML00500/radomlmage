package lnfvc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public ViewFlipper vf1,vf2,vf3,vf4;
    int x=1;
    String[]score={"http://johnyu.cn/s181/20181205000.jpg",
            "http://johnyu.cn/s181/20181205001.jpg",
            "http://johnyu.cn/s181/20181205004.jpg",
            "http://johnyu.cn/s181/17111653423.jpg",
            "http://johnyu.cn/s181/20181205003.jpg",
            "http://johnyu.cn/s181/20181205008.jpg",
            "http://johnyu.cn/s181/20181205016.jpg",
            "http://johnyu.cn/s181/20181205035.jpg",
            "http://johnyu.cn/s181/20181205043.jpg",
            "http://johnyu.cn/s181/20181205044.jpg",
            "http://johnyu.cn/s181/20181205045.jpg",
            "http://johnyu.cn/s181/20181205047.jpg",
            "http://johnyu.cn/s181/20181205048.jpg",
            "http://johnyu.cn/s181/20181205050.jpg",
            "http://johnyu.cn/s181/20181205051.jpg",
            "http://johnyu.cn/s181/20181205053.jpg",
            "http://johnyu.cn/s181/20181205055.jpg",
            "http://johnyu.cn/s181/20181205056.jpg",
            "http://johnyu.cn/s181/20181205057.jpg",
            "http://johnyu.cn/s181/20181205059.jpg",
            "http://johnyu.cn/s181/20181205061.jpg",
            "http://johnyu.cn/s181/20181205062.jpg",
            "http://johnyu.cn/s181/20181205064.jpg",
            "http://johnyu.cn/s181/20181205065.jpg",
            "http://johnyu.cn/s181/20181205066.jpg",
            "http://johnyu.cn/s181/20181205069.jpg",
            "http://johnyu.cn/s181/20181205070.jpg",
            "http://johnyu.cn/s181/20181205071.jpg",
            "http://johnyu.cn/s181/20181205072.jpg",
            "http://johnyu.cn/s181/20181205074.jpg",
            "http://johnyu.cn/s181/20181205076.jpg",
            "http://johnyu.cn/s181/20181205080.jpg",
            "http://johnyu.cn/s181/20181205081.jpg",
            "http://johnyu.cn/s181/201812050102.jpg",
            "http://johnyu.cn/s181/201812050122.jpg",
            "http://johnyu.cn/s181/201812050124.jpg",
            };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.but1);
        vf1=findViewById(R.id.vf1);
        vf2=findViewById(R.id.vf2);
        vf3=findViewById(R.id.vf3);
        vf4=findViewById(R.id.vf4);
        Random random=new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (x == 1) {
                    button.setText("结束");
                    x = 0;
                    vf1.removeAllViews();
                    vf2.removeAllViews();
                    vf3.removeAllViews();
                    vf4.removeAllViews();
                    for (int i=0;i<score.length;i++) {
                        int lengt1=random.nextInt(32);
                        ImageView img1=new ImageView(MainActivity.this);
                        ImageView img2=new ImageView(MainActivity.this);
                        ImageView img3=new ImageView(MainActivity.this);
                        ImageView img4=new ImageView(MainActivity.this);
                        Glide.with(MainActivity.this).load(score[lengt1]).into(img1);
                        Glide.with(MainActivity.this).load(score[lengt1+1]).into(img2);
                        Glide.with(MainActivity.this).load(score[lengt1+2]).into(img3);
                        Glide.with(MainActivity.this).load(score[lengt1+3]).into(img4);
                        vf1.addView(img1);
                        vf2.addView(img2);
                        vf3.addView(img3);
                        vf4.addView(img4);
                    }
                    vf1.startFlipping();
                    vf2.startFlipping();
                    vf3.startFlipping();
                    vf4.startFlipping();

                } else {
                    button.setText("开始");
                    x = 1;
                    vf1.stopFlipping();
                    vf2.stopFlipping();
                    vf3.stopFlipping();
                    vf4.stopFlipping();
                }

            }
        });
    }
    
}