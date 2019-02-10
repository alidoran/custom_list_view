package alidoran.ir.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnok;
    EditText etxt;
    ListView newslst;
    ArrayList <news> newsarrayList;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        newslst =findViewById ( R.id.lst );
                etxt = findViewById ( R.id.txtinput );
        btnok = findViewById ( R.id.btnok );
        newsarrayList = new ArrayList <> ( );
        final News_Adapter news_adapter= new News_Adapter ( MainActivity.this,R.layout.activity_customnews,newsarrayList);
        newslst.setAdapter ( news_adapter  );
        btnok.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                newsarrayList.add ( new news ( R.drawable.img ,etxt.getText ().toString () ));
                 news_adapter.notifyDataSetChanged ();
            }
        } );
    }
}
