package sg.edu.rp.c346.quizsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView quiz;
    ArrayList<String> alQuiz;
    ArrayAdapter<String> aaQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz=findViewById(R.id.lvQuiz);
        alQuiz = new ArrayList<>();

        //step2c:add data into the arraylist
        alQuiz.add("Area of Rectangle Length x Length Formula type is:Area");
        alQuiz.add("Area of Triangle (Length of base x Length)/2 Formula type is:Area");
        alQuiz.add("Volume of Cube Length x Length x Length Formula type is:Volume");


        //step3b:initialize the arrayadapter and bind it to the arraylist (simple_list_item is for a row item)
        aaQuiz= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alQuiz);

        //step4a:bind the list view to the array adapter
        quiz.setAdapter(aaQuiz);
    }
}
