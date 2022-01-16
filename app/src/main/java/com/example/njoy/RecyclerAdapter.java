package com.example.njoy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private final Context context;
    private final List<Event> eventList;

    public RecyclerAdapter(Context context, List<Event> eventList) {
        this.context = context;
        this.eventList = eventList;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name, city, startDate, endDate, longitude, latitude;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.event_name);
            city = (TextView) itemView.findViewById(R.id.event_city);
            startDate = (TextView) itemView.findViewById(R.id.event_startDate);
            endDate = (TextView) itemView.findViewById(R.id.event_endDate);
            longitude = (TextView) itemView.findViewById(R.id.event_longitude);
            latitude = (TextView) itemView.findViewById(R.id.event_latitude);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);

        return new ItemViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        int viewType = getItemViewType(i);

        switch (viewType) {
            case TYPE:
            default:
                ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                Event event = (Event) eventList.get(i);

                itemViewHolder.name.setText(event.getName());
                itemViewHolder.city.setText(event.getCity());
                itemViewHolder.startDate.setText(event.getStartDate());
                itemViewHolder.endDate.setText(event.getEndDate());
                itemViewHolder.longitude.setText(event.getLongitude());
                itemViewHolder.latitude.setText(event.getLatitude());
        }
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}