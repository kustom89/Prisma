package cl.kustom89.easyshiping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import cl.kustom89.easyshiping.models.User;

public class MainActivity extends AppCompatActivity {

    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        final EditText rutEt= findViewById( R.id.rutEt );
        final EditText nombreEt= findViewById( R.id.nombresEt );
        final EditText apellidosEt=findViewById( R.id.apellidosEt );
        final EditText fechaNacEt=findViewById( R.id.fechaEt );
        final EditText direccionEt= findViewById( R.id.direccionEt );
        final EditText telefonoEt=findViewById( R.id.direccionEt );
        final EditText emailEt=findViewById( R.id.mailEt );

        Button save= findViewById( R.id.saveBtn );

        save.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rut=rutEt.getText().toString();
                String firsName=nombreEt.getText().toString();
                String lastName=apellidosEt.getText().toString();
                String birthDay=fechaNacEt.getText().toString();
                String address=direccionEt.getText().toString();
                String phone=telefonoEt.getText().toString();
                String email=emailEt.getText().toString();
                if(rut.trim().length()>0&&firsName.trim().length()>0&&lastName.trim().length()>0
                        && birthDay.trim().length()>0 &&address.trim().length()>0
                        && phone.trim().length()>0&& email.trim().length()>0){
                    User user= new User( rut, firsName,lastName,birthDay,address, phone, email );
                    user.save();
      //              users=getUsers();
                    rutEt.setText( " " );
                    nombreEt.setText( " " );
                    apellidosEt.setText( " " );
                    fechaNacEt.setText( " " );
                    direccionEt.setText( " " );
                    telefonoEt.setText( " " );
                    emailEt.setText( " " );

                    Toast.makeText( MainActivity.this, "Datos Guardados", Toast.LENGTH_SHORT ).show();
                    Intent intent= new Intent( MainActivity.this, LoginActivity.class );
                    startActivity( intent );
                }else {
                    Toast.makeText( MainActivity.this, "Relenar todos Los Cambios", Toast.LENGTH_SHORT ).show();
                }

            }
        } );

    }

    /*private List<User> getUsers(){
        return User.find( User.class,  );

    }*/
}
