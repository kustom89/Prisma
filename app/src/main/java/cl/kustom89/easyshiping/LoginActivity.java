package cl.kustom89.easyshiping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        EditText mailEt=findViewById( R.id.mailEt );
        EditText passwordEt=findViewById( R.id.passwordEt );
        Button login= findViewById( R.id.logiBtn );
        Button register= findViewById( R.id.registerBtn );

        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );

        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent( LoginActivity.this, MainActivity.class );
                startActivity( intent );
            }
        } );




    }
}
