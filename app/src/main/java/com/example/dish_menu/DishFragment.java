package com.example.dish_menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DishFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DishFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "name";
    private static final String ARG_PARAM2 = "price";
    private static final String ARG_PARAM3 = "ingredient";

    // TODO: Rename and change types of parameters
    private String mName;
    private String mPrice;
    private String mIngredient;
    public DishFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mName Parameter 1.
     * @param mPrice Parameter 2.
     * @param mIngredient Parameter 3.
     * @return A new instance of fragment DishFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DishFragment newInstance(String mName, String mPrice,String mIngredient) {
        DishFragment fragment = new DishFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, mName);
        args.putString(ARG_PARAM2, mPrice);
        args.putString(ARG_PARAM2, mIngredient);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_PARAM1);
            mPrice = getArguments().getString(ARG_PARAM2);
            mIngredient = getArguments().getString(ARG_PARAM3);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_menu, container, false);
    }
}