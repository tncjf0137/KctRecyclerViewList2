package com.example.kctrecyclerviewlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.w3c.dom.Text;

public class TextViewPagerAdapter extends PagerAdapter {
    private Context mContext = null;

    public  TextViewPagerAdapter(){
    }

    public  TextViewPagerAdapter(Context context){
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = null ;
        int date = position*7+1;
        if (mContext != null) {
            // LayoutInflater를 통해 "/res/layout/page.xml"을 뷰로 생성.
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.calendar_week, container, false);

            TextView schedule1 = (TextView) view.findViewById(R.id.schedule_sun_0am);
            if(position == 0) {
                schedule1.setText("안드12팀");
            }

            TextView textView1 = (TextView) view.findViewById(R.id.info_week1);
            TextView textView2 = (TextView) view.findViewById(R.id.info_week2);
            TextView textView3 = (TextView) view.findViewById(R.id.info_week3);
            TextView textView4 = (TextView) view.findViewById(R.id.info_week4);
            TextView textView5 = (TextView) view.findViewById(R.id.info_week5);
            TextView textView6 = (TextView) view.findViewById(R.id.info_week6);
            TextView textView7 = (TextView) view.findViewById(R.id.info_week7);


            textView1.setText(""+date) ;
            date++;
            textView2.setText(""+date) ;
            date++;
            textView3.setText(""+date) ;
            date++;
            textView4.setText(""+date) ;
            date++;
            textView5.setText(""+date) ;
            date++;
            textView6.setText(""+date) ;
            date++;
            textView7.setText(""+date) ;
        }

        // 뷰페이저에 추가.
        container.addView(view) ;

        return view ;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // 뷰페이저에서 삭제.
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (View)object);
    }
}
