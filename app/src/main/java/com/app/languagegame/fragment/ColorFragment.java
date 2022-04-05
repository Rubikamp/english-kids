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
        colorYellow = view.findViewById(R.id.color_yellow);
        Glide.with(this).load(Piclinks.COLOR_YELLOW).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorYellow);
        voiceYellow = view.findViewById(R.id.color_yellow);
        voiceYellow.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_YELLOW))));
        //Blue
        colorBlue = view.findViewById(R.id.color_blue);
        Glide.with(this).load(Piclinks.COLOR_BLUE).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorBlue);
        voiceBlue = view.findViewById(R.id.color_blue);
        voiceBlue.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BLUE))));
        //Green
        colorGreen = view.findViewById(R.id.color_green);
        Glide.with(this).load(Piclinks.COLOR_GREEN).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorGreen);
        voiceGreen = view.findViewById(R.id.color_green);
        voiceGreen.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_GREEN))));
        //Brown
        colorBrown = view.findViewById(R.id.color_brown);
        Glide.with(this).load(Piclinks.COLOR_BROWN).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorBrown);
        voiceBrown = view.findViewById(R.id.color_brown);
        voiceBrown.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BROWN))));
        //Pink
        colorPink = view.findViewById(R.id.color_pink);
        Glide.with(this).load(Piclinks.COLOR_PINK).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorPink);
        voicePink = view.findViewById(R.id.color_brown);
        voicePink.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PINK))));
        //Purple
        colorPurple = view.findViewById(R.id.color_purple);
        Glide.with(this).load(Piclinks.COLOR_PURPLE).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorPurple);
        voicePurple = view.findViewById(R.id.color_purple);
        voicePurple.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PURPLE))));
        //Black
        colorBlack = view.findViewById(R.id.color_black);
        Glide.with(this).load(Piclinks.COLOR_BLACK).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorBlack);
        voiceBlack = view.findViewById(R.id.color_black);
        voiceBlack.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BLACK))));
        //Orange
        colorOrange = view.findViewById(R.id.color_orange);
        Glide.with(this).load(Piclinks.COLOR_ORANGE).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorOrange);
        voiceOrange = view.findViewById(R.id.color_orange);
        voiceOrange.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_ORANGE))));
        //White
        colorWhite = view.findViewById(R.id.color_white);
        Glide.with(this).load(Piclinks.COLOR_WHITE).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorWhite);
        voiceWhite = view.findViewById(R.id.color_white);
        voiceWhite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_WHITE))));
        //Gold
        colorGold = view.findViewById(R.id.color_gold);
        Glide.with(this).load(Piclinks.COLOR_GOLD).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorGold);
        voiceGold = view.findViewById(R.id.color_gold);
        voiceGold.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_GOLD))));
        //Sky Blue
        colorSkyBlue = view.findViewById(R.id.color_sky_blue);
        Glide.with(this).load(Piclinks.COLOR_SKY_BLUE).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorSkyBlue);
        voiceSkyBlue = view.findViewById(R.id.color_sky_blue);
        voiceSkyBlue.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_SKY_BLUE))));
        //Gray
        colorGray = view.findViewById(R.id.color_grey);
        Glide.with(this).load(Piclinks.COLOR_GREY).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(colorGray);
        voiceGray = view.findViewById(R.id.color_grey);
        voiceGray.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_GRAY))));
        //Anim Orange
        animOrange = view.findViewById(R.id.color_anim_orange);
        Glide.with(this).load(Piclinks.ANIM_ORANGE).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(animOrange);
        //Anim Green
        animGreen = view.findViewById(R.id.color_anim_green);
        Glide.with(this).load(Piclinks.ANIM_GREEN).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(animGreen);
        //Anim Pink
        animPink = view.findViewById(R.id.color_anim_pink);
        Glide.with(this).load(Piclinks.ANIM_PINK).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(animPink);
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
