package codingprojects.dippolsp.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NotesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // pull notes from database
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
