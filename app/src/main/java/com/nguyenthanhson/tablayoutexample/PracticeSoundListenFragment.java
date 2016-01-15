package com.nguyenthanhson.tablayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SON on 1/12/2016.
 */
public class PracticeSoundListenFragment extends Fragment {
    public PracticeSoundListenFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=(View)inflater.inflate(R.layout.fragment_listening_practice_sound,container,false);
        return rootView;
    }
}
