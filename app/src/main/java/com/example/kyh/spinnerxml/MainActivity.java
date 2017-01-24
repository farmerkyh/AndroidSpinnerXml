package com.example.kyh.spinnerxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.kyh.spinner01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----------------------------------------------------------------------------------------------------------
        //구분 Spinner (xml방식)
        //-----------------------------------------------------------------------------------------------------------
        Spinner sp_year = (Spinner)findViewById(R.id.sp_year);

        // 스피너에 뿌려질 xml형식의 Data를 담을 Adapter
        // 안드로이드 values 폴더에 arrays에 셋팅된 List를 Adapter에 셋팅 해준다.
        ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(this, R.array.date_year, android.R.layout.simple_spinner_item);

        // Spinner 클릭시 DropDown 모양을 설정
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어답터를 연결
        sp_year.setAdapter(yearAdapter);

        //-----------------------------------------------------------------------------------------------------------
        //구분 Spinner (xml -> 연결 -> strings 방식)
        //-----------------------------------------------------------------------------------------------------------
        Spinner sp_month = (Spinner)findViewById(R.id.sp_month);

        // 스피너에 뿌려질 xml형식의 Data를 담을 Adapter
        //     안드로이드 values 폴더에 arrays에 셋팅된 List를 Adapter에 셋팅 해준다.
        // getResources() 메서드는 리소스 사용에 관한 메서드로 Activity 상속시 사용할 수 있다.
        //     그래서 array에 @string으로 정의된 resouce를 찾아서 처리해 준다.
        ArrayAdapter monthAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, (String[])getResources().getStringArray(R.array.date_month));

        // Spinner 클릭시 DropDown 모양을 설정
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어답터를 연결
        sp_month.setAdapter(monthAdapter);

    }
}
