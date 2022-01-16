package com.example.njoy;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.shadow.ShadowRenderer;

import java.security.PrivateKey;

public class SettingsFragment extends Fragment {

/*
    SwitchCompat switch1, switch2, switch3;

    Boolean stateSwitch1, stateSwitch2, stateSwitch3;
*/

    public SettingsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /*switch1 = container.findViewById(R.id.switch_1);
        switch2 = container.findViewById(R.id.switch_2);
        switch3 = container.findViewById(R.id.switch_3);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("PREFS", 0);

        stateSwitch1 = sharedPreferences.getBoolean("switch1", false);
        stateSwitch2 = sharedPreferences.getBoolean("switch2", false);
        stateSwitch3 = sharedPreferences.getBoolean("switch3", false);

        switch1.setChecked(stateSwitch1);
        switch2.setChecked(stateSwitch2);
        switch3.setChecked(stateSwitch3);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stateSwitch1 = !stateSwitch1;
                switch1.setChecked(stateSwitch1);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("switch1", stateSwitch1);
                editor.apply();
            }
        });

        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stateSwitch2 = !stateSwitch2;
                switch2.setChecked(stateSwitch2);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("switch2", stateSwitch2);
                editor.apply();
            }
        });

        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stateSwitch3 = !stateSwitch3;
                switch3.setChecked(stateSwitch3);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("switch3", stateSwitch3);
                editor.apply();
            }
        });*/

        return inflater.inflate(R.layout.fragment_settings, container, false);
    }
}
