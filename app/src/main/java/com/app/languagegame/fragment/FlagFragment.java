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


public class FlagFragment extends Fragment {
    AppCompatImageView flagUSA, flagBelgium,flagFrance, flagSwitzerland, flagItaly, flagIndia, flagCanada, flagRussia, flagChina, flagBrazil, flagUkraine, flagIceland, flagIran, flagQatar, flagAzerbaijan, flagTurkey, voiceUSA, voiceBelgium,voiceFrance, voiceSwitzerland, voiceItaly, voiceIndia, voiceCanada, voiceRussia, voiceChina, voiceBrazil, voiceUkraine, voiceIceland, voiceIran, voiceQatar, voiceAzerbaijan, voiceTurkey;


    public FlagFragment() {

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
        View view = inflater.inflate(R.layout.fragment_flag, container, false);
        //USA
        flagUSA = view.findViewById(R.id.flag_usa);
        Glide.with(this).load(Piclinks.USA_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagUSA);
        voiceUSA = view.findViewById(R.id.flag_usa);
        voiceUSA.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_USA))));
        //Belgium
        flagBelgium = view.findViewById(R.id.flag_belgium);
        Glide.with(this).load(Piclinks.BELGIUM_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagBelgium);
        voiceBelgium = view.findViewById(R.id.flag_belgium);
        voiceBelgium.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BELGIUM))));
        //France
        flagFrance = view.findViewById(R.id.flag_france);
        Glide.with(this).load(Piclinks.FRANCE_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagFrance);
        voiceFrance = view.findViewById(R.id.flag_france);
        voiceFrance.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_FRANCE))));
        //Switzerland
        flagSwitzerland = view.findViewById(R.id.flag_switzerland);
        Glide.with(this).load(Piclinks.SWITZERLAND_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagSwitzerland);
        voiceSwitzerland = view.findViewById(R.id.flag_switzerland);
        voiceSwitzerland.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_SWITZERLAND))));
        //Italy
        flagItaly = view.findViewById(R.id.flag_italy);
        Glide.with(this).load(Piclinks.ITALY_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagItaly);
        voiceItaly = view.findViewById(R.id.flag_italy);
        voiceItaly.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_ITALY))));
        //India
        flagIndia = view.findViewById(R.id.flag_india);
        Glide.with(this).load(Piclinks.INDIA_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagIndia);
        voiceIndia = view.findViewById(R.id.flag_india);
        voiceIndia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_INDIA))));
        //Canada
        flagCanada = view.findViewById(R.id.flag_canada);
        Glide.with(this).load(Piclinks.CANADA_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagCanada);
        voiceCanada = view.findViewById(R.id.flag_canada);
        voiceCanada.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_CANADA))));
        //Russia
        flagRussia = view.findViewById(R.id.flag_russia);
        Glide.with(this).load(Piclinks.RUSSIA_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagRussia);
        voiceRussia = view.findViewById(R.id.flag_russia);
        voiceRussia.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_RUSSIA))));
        //China
        flagChina = view.findViewById(R.id.flag_china);
        Glide.with(this).load(Piclinks.CHINA_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagChina);
        voiceChina = view.findViewById(R.id.flag_china);
        voiceChina.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_CHINA))));
        //Brazil
        flagBrazil = view.findViewById(R.id.flag_brazil);
        Glide.with(this).load(Piclinks.BRAZIL_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagBrazil);
        voiceBrazil = view.findViewById(R.id.flag_brazil);
        voiceBrazil.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BRAZIL))));
        //Ukraine
        flagUkraine = view.findViewById(R.id.flag_ukraine);
        Glide.with(this).load(Piclinks.UKRAINE_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagUkraine);
        voiceUkraine = view.findViewById(R.id.flag_ukraine);
        voiceUkraine.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_UKRAINE))));
        //Iceland
        flagIceland = view.findViewById(R.id.flag_iceland);
        Glide.with(this).load(Piclinks.ICELAND_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagIceland);
        voiceIceland = view.findViewById(R.id.flag_iceland);
        voiceIceland.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_ICELAND))));
        //Iran
        flagIran = view.findViewById(R.id.flag_iran);
        Glide.with(this).load(Piclinks.IRAN_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagIran);
        voiceIran = view.findViewById(R.id.flag_iran);
        voiceIran.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_IRAN))));
        //Qatar
        flagQatar = view.findViewById(R.id.flag_qatar);
        Glide.with(this).load(Piclinks.QATAR_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagQatar);
        voiceQatar = view.findViewById(R.id.flag_qatar);
        voiceQatar.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_QATAR))));
        //Azerbaijan
        flagAzerbaijan = view.findViewById(R.id.flag_azerbaijan);
        Glide.with(this).load(Piclinks.AZERBAIJAN_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagAzerbaijan);
        voiceAzerbaijan = view.findViewById(R.id.flag_azerbaijan);
        voiceAzerbaijan.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_AZERBAIJAN))));
        //Turkey
        flagTurkey = view.findViewById(R.id.flag_turkey);
        Glide.with(this).load(Piclinks.TURKEY_FLAG).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(flagTurkey);
        voiceTurkey = view.findViewById(R.id.flag_turkey);
        voiceTurkey.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_TURKEY))));
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