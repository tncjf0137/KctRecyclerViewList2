package com.example.kctrecyclerviewlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<MemberDTO> memberDTOS = new ArrayList<>();
    public MyRecyclerViewAdapter(){
        //recyclerview_item.xml 에서 만든 뷰홀더에 넣을 데이터를 만드는 부분

        memberDTOS.add(new MemberDTO("월","1","2","3","4","5","6","7"));
        memberDTOS.add(new MemberDTO("화","8","9","10","11","12","13","14"));
        memberDTOS.add(new MemberDTO("수","15","16","17","18","19","20","21"));
        memberDTOS.add(new MemberDTO("목","22","23","24","25","26","27","28"));
        memberDTOS.add(new MemberDTO("금","29","30","31","","","",""));



    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //recyclerview_item.xml를 가져와서 데이터를 넣을 뷰홀더를 만드는 부분
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_itm,parent,false);

        return new RowCell(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //데이터 넣어주는 함수
        //memberDTOS에 넣은 데이터들을 뷰홀더에 넣어서 뷰홀더 한줄을 만드는 부분

        ((RowCell)holder).day.setText(memberDTOS.get(position).day);

        ((RowCell)holder).date1.setText(memberDTOS.get(position).date1);
        ((RowCell)holder).date2.setText(memberDTOS.get(position).date2);
        ((RowCell)holder).date3.setText(memberDTOS.get(position).date3);
        ((RowCell)holder).date4.setText(memberDTOS.get(position).date4);
        ((RowCell)holder).date5.setText(memberDTOS.get(position).date5);
        ((RowCell)holder).date6.setText(memberDTOS.get(position).date6);
        ((RowCell)holder).date7.setText(memberDTOS.get(position).date7);

    }

    @Override
    public int getItemCount() {

        //뷰홀더를 몇개 생성할지 정하는 부분
        //size함수를 사용해서 memberDTOS에 넣은 데이터의 수만큼 뷰홀더가 생성되도록함
       return memberDTOS.size();
    }


    //리사이클러에 들어갈 뷰홀더와 뷰홀더에 들어갈 데이터를 지정해주는 부분

    private static class RowCell extends RecyclerView.ViewHolder {

        TextView day;

        TextView date1;
        TextView date2;
        TextView date3;
        TextView date4;
        TextView date5;
        TextView date6;
        TextView date7;

        public RowCell(View view){
            super(view);
            day = (TextView)view.findViewById(R.id.info_day);

            date1 = (TextView)view.findViewById(R.id.info_date1);
            date2 = (TextView)view.findViewById(R.id.info_date2);
            date3 = (TextView)view.findViewById(R.id.info_date3);
            date4 = (TextView)view.findViewById(R.id.info_date4);
            date5 = (TextView)view.findViewById(R.id.info_date5);
            date6 = (TextView)view.findViewById(R.id.info_date6);
            date7 = (TextView)view.findViewById(R.id.info_date7);

        }
    }


}
