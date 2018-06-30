package ke.co.sombo.apps.quizapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView (R.id.toolbar)
    Toolbar toolbar;
    @BindView (R.id.q1option1)
    RadioButton q1option1;
    @BindView (R.id.q1option2)
    RadioButton q1option2;
    @BindView (R.id.q1option3)
    RadioButton q1option3;
    @BindView (R.id.q1option4)
    RadioButton q1option4;
    @BindView (R.id.q2option1)
    CheckBox q2option1;
    @BindView (R.id.q2option2)
    CheckBox q2option2;
    @BindView (R.id.q2option3)
    CheckBox q2option3;
    @BindView (R.id.q2option4)
    CheckBox q2option4;
    @BindView (R.id.q4option1)
    RadioButton q4option1;
    @BindView (R.id.q4option2)
    RadioButton q4option2;
    @BindView (R.id.q5option1)
    CheckBox q5option1;
    @BindView (R.id.q5option2)
    CheckBox q5option2;
    @BindView (R.id.q3option1)
    RadioButton q3option1;
    @BindView (R.id.q3option2)
    RadioButton q3option2;
    @BindView (R.id.q3option3)
    RadioButton q3option3;
    @BindView (R.id.q3option4)
    RadioButton q3option4;
    @BindView (R.id.q6option1)
    RadioButton q6option1;
    @BindView (R.id.q6option2)
    RadioButton q6option2;
    @BindView (R.id.q6option3)
    RadioButton q6option3;
    @BindView (R.id.q6option4)
    RadioButton q6option4;
    @BindView (R.id.q7option1)
    RadioButton q7option1;
    @BindView (R.id.q7option2)
    RadioButton q7option2;
    @BindView (R.id.q7option3)
    RadioButton q7option3;
    @BindView (R.id.q7option4)
    RadioButton q7option4;
    @BindView (R.id.q8option1)
    CheckBox q8option1;
    @BindView (R.id.q8option2)
    CheckBox q8option2;
    @BindView (R.id.q9option1)
    RadioButton q9option1;
    @BindView (R.id.q9option2)
    RadioButton q9option2;
    @BindView (R.id.q9option3)
    RadioButton q9option3;
    @BindView (R.id.q9option4)
    RadioButton q9option4;
    @BindView (R.id.q10option1)
    RadioButton q10option1;
    @BindView (R.id.q10option2)
    RadioButton q10option2;
    @BindView (R.id.q10option3)
    RadioButton q10option3;
    @BindView (R.id.radio_group_1)
    RadioGroup radioGroup1;
    @BindView (R.id.radio_group_3)
    RadioGroup radioGroup3;
    @BindView (R.id.radio_group_2)
    RadioGroup radioGroup2;
    @BindView (R.id.radio_group_4)
    RadioGroup radioGroup4;
    @BindView (R.id.radio_group_5)
    RadioGroup radioGroup5;
    @BindView (R.id.radio_group_7)
    RadioGroup radioGroup7;
    @BindView (R.id.radio_group_8)
    RadioGroup radioGroup8;
    private int score;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        score = 0;
    }

    @OnClick (R.id.submit_button)
    public void onViewClicked () {
        if (q1option1.isChecked()) {
            incrementScore();
        }
        if (q2option1.isChecked() && q2option2.isChecked() && q2option3.isChecked() && ! q2option4.isChecked()) {
            incrementScore();
        }
        if (q3option3.isChecked()) {
            incrementScore();
        }
        if (q4option1.isChecked()) {
            incrementScore();
        }
        if (q5option1.isChecked()) {
            incrementScore();
        }
        if (q6option4.isChecked()) {
            incrementScore();
        }
        if (q7option4.isChecked()) {
            incrementScore();
        }
        if (q8option1.isChecked()) {
            incrementScore();
        }
        if (q9option1.isChecked()) {
            incrementScore();
        }
        if (q10option2.isChecked()) {
            incrementScore();
        }
        new MaterialDialog.Builder(MainActivity.this)
                .title("Score")
                .content("Your Score is " + score)
                .neutralText("Close")
                .onNeutral(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick (@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                        resetGame();
                    }
                }).show();
    }

    public void incrementScore () {
        score += 1;
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        if (item.getItemId() == R.id.reset) {
            resetGame();
        }
        return super.onOptionsItemSelected(item);
    }

    private void resetGame () {
        q1option1.setChecked(false);
        q1option2.setChecked(false);
        q1option3.setChecked(false);
        q1option4.setChecked(false);
        q2option1.setChecked(false);
        q2option2.setChecked(false);
        q2option3.setChecked(false);
        q2option4.setChecked(false);
        q3option1.setChecked(false);
        q3option2.setChecked(false);
        q3option3.setChecked(false);
        q3option4.setChecked(false);
        q4option1.setChecked(false);
        q4option2.setChecked(false);
        q5option1.setChecked(false);
        q5option2.setChecked(false);
        q6option1.setChecked(false);
        q6option2.setChecked(false);
        q6option3.setChecked(false);
        q6option4.setChecked(false);
        q7option1.setChecked(false);
        q7option2.setChecked(false);
        q7option3.setChecked(false);
        q7option4.setChecked(false);
        q8option1.setChecked(false);
        q8option2.setChecked(false);
        q9option1.setChecked(false);
        q9option2.setChecked(false);
        q9option3.setChecked(false);
        q9option4.setChecked(false);
        q10option1.setChecked(false);
        q10option2.setChecked(false);
        q10option3.setChecked(false);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        score = 0;
    }
}
