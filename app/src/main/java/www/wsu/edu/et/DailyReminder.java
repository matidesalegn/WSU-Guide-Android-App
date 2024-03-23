package www.wsu.edu.et;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

import android.os.Bundle;

public class DailyReminder extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private ArrayList<String> mRemindersList;
    private RecyclerView mRecyclerView;
    private ReminderAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private EditText mReminderEditText;
    private TextView mDateTextView;

    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_reminder);

        mRemindersList = new ArrayList<>();
        buildRecyclerView();

        mReminderEditText = findViewById(R.id.editTextReminder);
        mDateTextView = findViewById(R.id.textViewDate);

        Button pickDateButton = findViewById(R.id.buttonPickDate);
        pickDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        Button setReminderButton = findViewById(R.id.buttonSetReminder);
        setReminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String reminder = mReminderEditText.getText().toString();
                if (!reminder.isEmpty()) {
                    String date = mDay + "/" + mMonth + "/" + mYear;
                    String reminderWithDate = reminder + " - " + date;
                    mRemindersList.add(0, reminderWithDate);
                    mAdapter.notifyItemInserted(0);
                    mReminderEditText.setText("");
                    Toast.makeText(DailyReminder.this, "Reminder added", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(DailyReminder.this, "Please enter a reminder", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerViewReminders);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ReminderAdapter(mRemindersList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        mYear = year;
        mMonth = month + 1;
        mDay = day;
        mDateTextView.setText(mDay + "/" + mMonth + "/" + mYear);
    }
}


