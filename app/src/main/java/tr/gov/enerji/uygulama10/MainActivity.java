package tr.gov.enerji.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Asker asker =new Asker();
    Tankci  tankci = new Tankci();
    Topcu topcu=new Topcu();
    String mesaj = "";
    TextView textViewMesaj;
    Button buttonAsker,buttonTankci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewMesaj = findViewById(R.id.textViewMesaj);
        buttonAsker = findViewById(R.id.buttonAsker);
        buttonTankci = findViewById(R.id.buttonTankci);
    }

    public void askerAtesEt(View view) {
        mesaj = asker.atesEt();
        textViewMesaj.setText(mesaj);
    }

    public void tankciAtesEt(View view) {
        mesaj = tankci.atesEt();
        textViewMesaj.setText(mesaj);
    }

    public void topcuAtesEt(View view) {
        mesaj =topcu.atesEt();
        textViewMesaj.setText(mesaj);
    }
}