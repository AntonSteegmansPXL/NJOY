/*package com.example.njoy;

import android.content.Context;
import android.database.Cursor;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONObject;

import java.util.ArrayList;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventListViewHolder> {
    private Cursor mCursor;
    private Context mContext;

    public EventListAdapter(Context context, Cursor cursor) {
        this.mContext = context;
        this.mCursor = cursor;
    }

    @Override
    public EventListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.event_list_item, parent, false);
        return new EventListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventListViewHolder holder, int position) {
        if (!mCursor.moveToPosition(position)) {
            return;
        }
        String eventType = null;
        eventType = mCursor.getString(mCursor.getColumnIndex("eventType"));

        String rankingAsString = mCursor.getString(mCursor.getColumnIndex("ranking"));
        JSONObject rankings;

        ArrayList<String> players = new ArrayList<>();
        ArrayList<String> scores = new ArrayList<>();

        holder.nameTextView.setText(eventType);
    }

    @Override
    public int getItemCount() {
        if (mCursor == null) {
            return 0;
        }
        return mCursor.getCount();
    }

    public void swapCursor(Cursor newCursor) {
        if (mCursor != null) mCursor.close();
        mCursor = newCursor;
        if (newCursor != null) {
            this.notifyDataSetChanged();
        }
    }

    class EventListViewHolder extends RecyclerView.ViewHolder {
        TextView pos1TextView;
        TextView pos2TextView;
        TextView pos3TextView;
        TextView pos4TextView;
        TextView pos5TextView;

        TextView nameTextView;

        public EventListViewHolder(View itemView) {
            super(itemView);
            pos1TextView = (TextView) itemView.findViewById(R.id.tv_pos1);
            pos2TextView = (TextView) itemView.findViewById(R.id.tv_pos2);
            pos3TextView = (TextView) itemView.findViewById(R.id.tv_pos3);
            pos4TextView = (TextView) itemView.findViewById(R.id.tv_pos4);
            pos5TextView = (TextView) itemView.findViewById(R.id.tv_pos5);
        }
    }
}*/
