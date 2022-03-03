package com.example.englishkids;


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

public class FruitFragment extends Fragment {
    AppCompatImageView image_lemon, image_banana,image_coconut, image_pear, image_apple, image_strawberry, image_rasberry, image_cherries, image_orange, image_grape, image_kiwi, image_pineapple, image_watermelon, image_peach, image_avocado, image_mango;

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

    @SuppressLint("CutPasteId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animals, container, false);
        //lemon
        image_lemon= view.findViewById(R.id.image_lemon );
        Glide.with(this).load(PicLinks.LEMON_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_lemon);
        image_lemon = view.findViewById(R.id.image_lemon);
        image_lemon.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_LEMON))));
        //banana
        image_banana = view.findViewById(R.id.image_banana);
        Glide.with(this).load(PicLinks.BANANA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_banana);
        image_banana= view.findViewById(R.id.image_banana);
        image_banana.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_BANANA))));
        //COCONUT
        image_coconut= view.findViewById(R.id.image_coconut);
        Glide.with(this).load(PicLinks.COCONUT_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_coconut);
        image_coconut = view.findViewById(R.id.image_coconut);
        image_coconut.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_COCONUT))));
        //PEAR
        image_pear= view.findViewById(R.id.image_pear);
        Glide.with(this).load(PicLinks.PEAR_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_pear);
        image_pear = view.findViewById(R.id.image_pear);
        image_pear.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_PEAR))));
        //apple
        image_apple = view.findViewById(R.id.image_apple);
        Glide.with(this).load(PicLinks.APPLE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_apple);
        image_apple = view.findViewById(R.id.image_apple);
        image_apple.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_APPLE))));
        //strawberry
        image_strawberry= view.findViewById(R.id.image_strawberry);
        Glide.with(this).load(PicLinks.STRAWBERRY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_strawberry);
        image_strawberry= view.findViewById(R.id.image_strawberry);
        image_strawberry.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_STRAWBERRY))));
        //rasberry
        image_rasberry = view.findViewById(R.id.image_rasberry);
        Glide.with(this).load(PicLinks.RASBERRY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_rasberry);
        image_rasberry = view.findViewById(R.id.image_rasberry);
        image_rasberry.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_RASBERRY))));
        //CHERRy
        image_cherries = view.findViewById(R.id.image_pig);
        Glide.with(this).load(PicLinks.CHERRY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_cherries);
        image_cherries = view.findViewById(R.id.image_cherries);
        image_cherries.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_CHERRI))));
        //ORANGE
        image_orange = view.findViewById(R.id.image_orange);
        Glide.with(this).load(PicLinks.ORANGE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_orange);
        image_orange = view.findViewById(R.id.image_orange);
        image_orange.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_ORANGE))));
        //GRAPES
        image_grape = view.findViewById(R.id.image_grape);
        Glide.with(this).load(PicLinks.GRAPES_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_grape);
        image_grape = view.findViewById(R.id.image_grape);
        image_grape.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_GRAPES))));
        //KIWI
        image_kiwi = view.findViewById(R.id.image_kiwi);
        Glide.with(this).load(PicLinks.KIWI_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_kiwi);
        image_kiwi = view.findViewById(R.id.image_kiwi);
        image_kiwi.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_KIWI))));
        //PINEAPPLE
        image_pineapple = view.findViewById(R.id.image_pineapple);
        Glide.with(this).load(PicLinks.PINEAPPLE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_pineapple);
        image_pineapple = view.findViewById(R.id.image_pineapple);
        image_pineapple.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_PINEAPPLE))));
        //WATERMELON
        image_watermelon = view.findViewById(R.id.image_watermelon);
        Glide.with(this).load(PicLinks.WATERMELONS_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_watermelon);
        image_watermelon= view.findViewById(R.id.image_watermelon);
        image_watermelon.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_WATERMELON))));
        //PEACH
        image_peach= view.findViewById(R.id.image_peach);
        Glide.with(this).load(PicLinks.PEACH_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_peach);
        image_peach= view.findViewById(R.id.image_peach);
        image_peach.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_PEACH))));


        //AVOCADO
        image_avocado = view.findViewById(R.id.image_avocado);
        Glide.with(this).load(PicLinks.AVOCADO_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_avocado);
        image_avocado = view.findViewById(R.id.image_avocado);
        image_avocado.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_AVOCADO))));

        //MANGO
        image_mango= view.findViewById(R.id.image_mango);
        Glide.with(this).load(PicLinks.MANGO_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_mango);
        image_mango = view.findViewById(R.id.image_mango);
        image_mango.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PicLinks.VOICE_MANGO))));
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