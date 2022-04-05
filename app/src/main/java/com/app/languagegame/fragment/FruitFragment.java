package com.app.languagegame.fragment;


import android.annotation.SuppressLint;
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

public class FruitFragment extends Fragment {
    AppCompatImageView imageLemon, voiceLemon, imageBanana, voiceBanana, imageCoconut, voiceCoconut, imagePear, voicePear, imageApple, voiceApple, imageStrawberry, voiceStrawberry, imageRasberry, voiceRasBerry, imageCherries, voiceCherries, imageOrange, voiceOrange, imageGrape, voiceGrape, imageKiwi, voiceKiwi, imagePineapple, voicePineApple, imageWatermelon, voiceWatermelon, imagePeach, voicePeache, imageAvocado, voiceAvocado, imageMango, voiceMango;

    public FruitFragment() {

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
        View view = inflater.inflate(R.layout.fragment_fruit, container, false);
        //lemon
        imageLemon = view.findViewById(R.id.image_lemon);
        Glide.with(this).load(Piclinks.LEMON_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageLemon);
        voiceLemon = view.findViewById(R.id.image_lemon);
        voiceLemon.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_LEMON))));
        //banana
        imageBanana = view.findViewById(R.id.image_banana);
        Glide.with(this).load(Piclinks.BANANA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageBanana);
        voiceBanana = view.findViewById(R.id.image_banana);
        voiceBanana.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BANANA))));
        //COCONUT
        imageCoconut = view.findViewById(R.id.image_coconut);
        Glide.with(this).load(Piclinks.COCONUT_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageCoconut);
        voiceCoconut = view.findViewById(R.id.image_coconut);
        voiceCoconut.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_COCONUT))));
        //PEAR
        imagePear = view.findViewById(R.id.image_pear);
        Glide.with(this).load(Piclinks.PEAR_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imagePear);
        voicePear = view.findViewById(R.id.image_pear);
        voicePear.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PEAR))));
        //apple
        imageApple = view.findViewById(R.id.image_apple);
        Glide.with(this).load(Piclinks.APPLE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageApple);
        voiceApple = view.findViewById(R.id.image_apple);
        voiceApple.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_APPLE))));
        //strawberry
        imageStrawberry = view.findViewById(R.id.image_strawberry);
        Glide.with(this).load(Piclinks.STRAWBERRY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageStrawberry);
        voiceStrawberry = view.findViewById(R.id.image_strawberry);
        voiceStrawberry.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_STRAWBERRY))));
        //rasberry
        imageRasberry = view.findViewById(R.id.image_rasberry);
        Glide.with(this).load(Piclinks.RASBERRY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageRasberry);
        voiceRasBerry = view.findViewById(R.id.image_rasberry);
        voiceRasBerry.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_RASBERRY))));
        //CHERRy
        imageCherries = view.findViewById(R.id.image_cherries);
        Glide.with(this).load(Piclinks.CHERRY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageCherries);
        voiceCherries = view.findViewById(R.id.image_cherries);
        voiceCherries.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_CHERRI))));
        //ORANGE
        imageOrange = view.findViewById(R.id.image_orange);
        Glide.with(this).load(Piclinks.ORANGE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageOrange);
        voiceOrange = view.findViewById(R.id.image_orange);
        voiceOrange.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_ORANGE))));
        //GRAPES
        imageGrape = view.findViewById(R.id.image_grape);
        Glide.with(this).load(Piclinks.GRAPES_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageGrape);
        voiceGrape = view.findViewById(R.id.image_grape);
        voiceGrape.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_GRAPES))));
        //KIWI
        imageKiwi = view.findViewById(R.id.image_kiwi);
        Glide.with(this).load(Piclinks.KIWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageKiwi);
        voiceKiwi = view.findViewById(R.id.image_kiwi);
        voiceKiwi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_KIWI))));
        //PINEAPPLE
        imagePineapple = view.findViewById(R.id.image_pineapple);
        Glide.with(this).load(Piclinks.PINEAPPLE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imagePineapple);
        voicePineApple = view.findViewById(R.id.image_pineapple);
        voicePineApple.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PINEAPPLE))));
        //WATERMELON
        imageWatermelon = view.findViewById(R.id.image_watermelon);
        Glide.with(this).load(Piclinks.WATERMELONS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageWatermelon);
        voiceWatermelon = view.findViewById(R.id.image_watermelon);
        voiceWatermelon.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_WATERMELON))));
        //PEACH
        imagePeach = view.findViewById(R.id.image_peach);
        Glide.with(this).load(Piclinks.PEACH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imagePeach);
        voicePeache = view.findViewById(R.id.image_peach);
        voicePeache.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PEACH))));
        //AVOCADO
        imageAvocado = view.findViewById(R.id.image_avocado);
        Glide.with(this).load(Piclinks.AVOCADO_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageAvocado);
        voiceAvocado = view.findViewById(R.id.image_avocado);
        voiceAvocado.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_AVOCADO))));
        //MANGO
        imageMango = view.findViewById(R.id.image_mango);
        Glide.with(this).load(Piclinks.MANGO_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(imageMango);
        voiceMango = view.findViewById(R.id.image_mango);
        voiceMango.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_MANGO))));
        return view;
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