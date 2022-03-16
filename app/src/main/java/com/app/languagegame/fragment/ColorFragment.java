package com.app.languagegame.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.englishkids.Piclinks;
import com.example.englishkids.R;


public class ColorFragment extends Fragment {
    AppCompatImageView voiceRed, colorRed, colorYellow, voiceYellow, colorBlue, voiceBlue, colorGreen, voiceGreen, colorBrown, voiceBrown, colorPink, voicePink, colorPurple, voicePurple, colorBlack, voiceBlack, colorOrange, voiceOrange, colorWhite, voiceWhite, colorGold, voiceGold, colorSkyBlue, voiceSkyBlue, colorGray, voiceGray, animOrange, animGreen, animPink;


    public ColorFragment() {

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        //Red
        colorRed = view.findViewById(R.id.color_red);
        Glide.with(this).load(Piclinks.COLOR_RED).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorRed);
        voiceRed = view.findViewById(R.id.color_red);
        voiceRed.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_RED))));
        //Yellow



        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
