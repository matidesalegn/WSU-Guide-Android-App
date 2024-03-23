package www.wsu.edu.et;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ReminderViewHolder> {

    private ArrayList<Reminder> mReminders;

    public ReminderAdapter(ArrayList<String> mRemindersList) {
    }

    public static class ReminderViewHolder extends RecyclerView.ViewHolder {
        public TextView mReminderTextView;
        public TextView mDateTextView;

        public ReminderViewHolder(@NonNull View itemView) {
            super(itemView);
            mReminderTextView = itemView.findViewById(R.id.text_view_reminder);
            mDateTextView = itemView.findViewById(R.id.text_view_date);
        }
    }

    @NonNull
    @Override
    public ReminderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_item, parent, false);
        ReminderViewHolder viewHolder = new ReminderViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReminderViewHolder holder, int position) {
        Reminder currentReminder = mReminders.get(position);

        holder.mReminderTextView.setText(currentReminder.getReminderText());
        holder.mDateTextView.setText((CharSequence) currentReminder.getDateString());
    }

    @Override
    public int getItemCount() {
        if (mReminders == null) {
            return 0;
        }
        return mReminders.size();
    }

}

