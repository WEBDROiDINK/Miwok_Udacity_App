/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        SimplePagerAdaptor adapter = new SimplePagerAdaptor(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }



    public void GoToNumbers(View view) {

        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void GoToFamily(View view) {

        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }
    public void GoToColors(View view) {

        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
    public void GoToPhrases(View view) {

        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);

    }

}


