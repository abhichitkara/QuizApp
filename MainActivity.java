package com.example.abhi.quiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctanswers = 0;
    int totalq = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View v) {
        checkallquestions();
        Toast.makeText(this, "\n Number of correct answers are " + correctanswers + "/" + totalq, Toast.LENGTH_SHORT).show();
        TextView Result1 = (TextView) findViewById(R.id.tv_result);

        Result1.setText("\n Number of correct answers are: " + correctanswers + "/" + totalq + "\n\n You can Scroll up to check which answers are right and which ones are wrong");
    }

    public void reset(View v) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.rb_ques1option1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rb_ques1option2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.rb_ques1option3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.rb_ques3option1);
        RadioButton rb5 = (RadioButton) findViewById(R.id.rb_ques3option2);
        RadioButton rb6 = (RadioButton) findViewById(R.id.rb_ques3option3);
        RadioButton rb7 = (RadioButton) findViewById(R.id.rb_ques6option1);
        RadioButton rb8 = (RadioButton) findViewById(R.id.rb_ques6option2);
        RadioButton rb9 = (RadioButton) findViewById(R.id.rb_ques6option3);
        CheckBox cb1 = (CheckBox) findViewById(R.id.cb_ques2option1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb_ques2option2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb_ques2option3);
        TextView tv1 = (TextView) findViewById(R.id.edt_userinput4);
        TextView tv2 = (TextView) findViewById(R.id.edt_userinput5);
        TextView tv3 = (TextView) findViewById(R.id.tv_result);
        TextView tv4 = (TextView) findViewById(R.id.tv_ques1result);
        TextView tv5 = (TextView) findViewById(R.id.tv_ques2result);
        TextView tv6 = (TextView) findViewById(R.id.tv_ques3result);
        TextView tv7 = (TextView) findViewById(R.id.tv_ques4result);
        TextView tv8 = (TextView) findViewById(R.id.tv_ques5result);
        TextView tv9 = (TextView) findViewById(R.id.tv_ques6result);
        rb1.setChecked(false);
        rb2.setChecked(false);
        rb3.setChecked(false);
        rb4.setChecked(false);
        rb5.setChecked(false);
        rb6.setChecked(false);
        rb7.setChecked(false);
        rb8.setChecked(false);
        rb9.setChecked(false);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        tv7.setText("");
        tv8.setText("");
        tv9.setText("");
        correctanswers = 0;
    }

    public void checkquestionone() {
        RadioButton ans1 = (RadioButton) findViewById(R.id.rb_ques1option1);
        TextView tv1 = (TextView) findViewById(R.id.tv_ques1result);
        boolean isans1checked = ans1.isChecked();
        if (isans1checked) {
            correctanswers += 1;
            tv1.setText("Correct Answer");
            tv1.setTextColor(Color.GREEN);
        } else {
            tv1.setText("Wrong Answer");
            tv1.setTextColor(Color.RED);
        }
    }

    public void checkquestiontwo() {
        CheckBox ans1 = (CheckBox) findViewById(R.id.cb_ques2option1);
        CheckBox ans2 = (CheckBox) findViewById(R.id.cb_ques2option2);
        CheckBox ans3 = (CheckBox) findViewById(R.id.cb_ques2option3);
        TextView tv2 = (TextView) findViewById(R.id.tv_ques2result);
        boolean isans1checked = ans1.isChecked();
        boolean isans2checked = ans2.isChecked();
        boolean isans3checked = ans3.isChecked();
        if (isans1checked && isans2checked && !isans3checked) {
            correctanswers += 1;
            tv2.setText("Correct Answer");
            tv2.setTextColor(Color.GREEN);
        } else {
            tv2.setText("Wrong Answer");
            tv2.setTextColor(Color.RED);
        }
    }

    public void checkquestionthree() {
        RadioButton ans1 = (RadioButton) findViewById(R.id.rb_ques3option2);
        TextView tv3 = (TextView) findViewById(R.id.tv_ques3result);
        boolean isans1checked = ans1.isChecked();
        if (isans1checked) {
            correctanswers += 1;
            tv3.setText("Correct Answer");
            tv3.setTextColor(Color.GREEN);
        } else {
            tv3.setText("Wrong Answer");
            tv3.setTextColor(Color.RED);
        }
    }

    private String getquestion4input() {
        EditText question4input = (EditText) findViewById(R.id.edt_userinput4);
        String ans4 = question4input.getText().toString();
        return ans4;
    }

    public void checkquestionfour() {
        TextView tv4 = (TextView) findViewById(R.id.tv_ques4result);
        String dat = getquestion4input();
        if (dat.equals("9")) {
            correctanswers += 1;
            tv4.setText("Correct Answer");
            tv4.setTextColor(Color.GREEN);

        } else {
            tv4.setText("Wrong Answer");
            tv4.setTextColor(Color.RED);
        }
    }

    private String getquestion5input() {
        EditText question5input = (EditText) findViewById(R.id.edt_userinput5);
        String ans5 = question5input.getText().toString();
        return ans5;
    }

    public void checkquestionfive() {
        TextView tv5 = (TextView) findViewById(R.id.tv_ques5result);
        String dat = getquestion5input();
        if (dat.equalsIgnoreCase("ygritte")) {
            correctanswers += 1;
            tv5.setText("Correct Answer");
            tv5.setTextColor(Color.GREEN);
        } else {
            tv5.setText("Wrong Answer");
            tv5.setTextColor(Color.RED);
        }
    }

    public void checkquestionsix() {
        RadioButton ans1 = (RadioButton) findViewById(R.id.rb_ques6option2);
        TextView tv6 = (TextView) findViewById(R.id.tv_ques6result);
        boolean isans1checked = ans1.isChecked();
        if (isans1checked) {
            correctanswers += 1;
            tv6.setText("Correct Answer");
            tv6.setTextColor(Color.GREEN);

        } else {
            tv6.setText("Wrong Answer");
            tv6.setTextColor(Color.RED);
        }
    }

    public void checkallquestions() {
        correctanswers = 0;
        checkquestionone();
        checkquestiontwo();
        checkquestionthree();
        checkquestionfour();
        checkquestionfive();
        checkquestionsix();
    }
}
