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

public class AnimalsFragment extends Fragment {
    AppCompatImageView image_lion, image_giraffe,image_leopard, image_monkey, image_cow, image_chick, image_horse, image_pig, image_donkey, image_tiger, image_snake, image_hippo, image_zabra, image_fox, image_bird, image_panda;

    public AnimalsFragment() {

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
        //lion
        image_lion = view.findViewById(R.id.image_lion);
        Glide.with(this).load(Piclinks.LION_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_lion);
        image_lion.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_LION))));
        //giraffe

        image_giraffe = view.findViewById(R.id.image_giraffe);
        Glide.with(this).load(Piclinks.GIRAFFE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_giraffe);
        image_giraffe.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_GIRAFFE))));

        //leopard
        image_leopard = view.findViewById(R.id.image_leopard);
        Glide.with(this).load(Piclinks.LEOPARD_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_leopard);
        image_leopard.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_LEOPARD))));
        //monkey
        image_monkey= view.findViewById(R.id.image_monkey);
        Glide.with(this).load(Piclinks.MONKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_monkey);
        image_monkey.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_MONKEY))));
        //cow
        image_cow = view.findViewById(R.id.image_cow);
        Glide.with(this).load(Piclinks.COW_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_cow);
        image_cow.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_COW))));
        //chick
        image_chick= view.findViewById(R.id.image_chick);
        Glide.with(this).load(Piclinks.CHICK_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_chick);
        image_chick.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_CHICK))));
        //horse
        image_horse = view.findViewById(R.id.image_horse);
        Glide.with(this).load(Piclinks.HORSE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_horse);
        image_horse.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_HORSE))));
        //Russia
        image_pig = view.findViewById(R.id.image_pig);
        Glide.with(this).load(Piclinks.PIG_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_pig);
        image_pig.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PIG))));
        //DONKEY
        image_donkey = view.findViewById(R.id.image_donkey);
        Glide.with(this).load(Piclinks.DONKEY_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_donkey);
        image_donkey.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_DONKEY))));
        //TIGER
        image_tiger = view.findViewById(R.id.image_tiger);
        Glide.with(this).load(Piclinks.TIGER_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_tiger);
        image_tiger.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_TIGER))));
        //SNAKE
        image_snake = view.findViewById(R.id.image_snake);
        Glide.with(this).load(Piclinks.SNAKE_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_snake);
        image_snake.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_SNAKE))));
        //HIPPO
        image_hippo = view.findViewById(R.id.image_hippo);
        Glide.with(this).load(Piclinks.HIPPO_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_hippo);
        image_hippo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_HIPPO))));
        //ZEBRA
        image_zabra = view.findViewById(R.id.image_zabra);
        Glide.with(this).load(Piclinks.ZEBRA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_zabra);
        image_zabra.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_ZEBRA))));
        //FOX
        image_fox= view.findViewById(R.id.image_fox);
        Glide.with(this).load(Piclinks.FOX_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_fox);
        image_fox.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_FOX))));
        //BIRDS
        image_bird = view.findViewById(R.id.image_bird);
        Glide.with(this).load(Piclinks.BIRD_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_bird);
        image_bird.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_BIRD))));
        //Turkey
        image_panda= view.findViewById(R.id.image_panda);
        Glide.with(this).load(Piclinks.PANDA_URL).placeholder(R.drawable.ic_launcher_background).error(R.drawable.broken_image).into(image_panda);
        image_panda.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Piclinks.VOICE_PANDA))));
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