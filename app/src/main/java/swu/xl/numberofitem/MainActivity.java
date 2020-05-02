package swu.xl.numberofitem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberOfItem item = findViewById(R.id.number_item);
        NumberOfItem item1 = findViewById(R.id.number_item1);

        item.setCount(10);
    }
}
