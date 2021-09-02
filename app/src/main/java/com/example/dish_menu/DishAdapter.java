package com.example.dish_menu;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
//  Create the class without extensions
public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {
    //create the list the the adapter will use to bind data
    List<Dish> allDishs = new ArrayList<Dish>();

    public DishAdapter(List<Dish> allDishs) {
        this.allDishs = allDishs;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dish,parent,false);
        DishViewHolder dishViewHolder = new DishViewHolder(view);
        return dishViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull  DishAdapter.DishViewHolder holder, int position) {
        holder.dish = allDishs.get(position);

        TextView getDishName = holder.itemView.findViewById(R.id.getDishName);
        TextView getDishPrice = holder.itemView.findViewById(R.id.getDishPrice);

        getDishName.setText("Name  "+holder.dish.name);
        getDishPrice.setText("Price  "+holder.dish.price);

    }

    @Override
    public int getItemCount() {
        return allDishs.size();
    }
    //  create the ViewHolder class (Wraps the data and the view)
    public static class DishViewHolder extends RecyclerView.ViewHolder{
        // The model object
        public Dish dish;
        // view object
        View itemView;

        public DishViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            // using putExtra here to pass data to details dish page

            itemView.findViewById(R.id.dishDragment).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent goToDetailPageActivity = new Intent(view.getContext(),DishDetails.class);
                    goToDetailPageActivity.putExtra("dishName",dish.name);
                    goToDetailPageActivity.putExtra("dishPrice",dish.price);
                    goToDetailPageActivity.putExtra("dishIngredient",dish.ingredient);
                    view.getContext().startActivity(goToDetailPageActivity);
                }
            });
        }
    }
}
