package edu.gatech.seclass.sdpencryptor;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private EditText messageInput;
    private EditText scaleInput;
    private EditText shiftInput;
    private TextView encodedText;
    private Button encodeButton;

    // Need to add alphanumeric string a-zA-Z0-9


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //remove for academic integrity 

    private static int gcd(int a, int b) {

        // Using Euclid's repeated division to the GCD value
        // https://www.geeksforgeeks.org/java-program-to-compute-gcd/
                //remove for academic integrity 

    }

    // Here when Button is clicked
    private void encodeMessage() {

        boolean valid = true;
        int aScale = 0;
        int bShift = 0;

        // input message text > check message > check for !isEmpty or isValid
                //remove for academic integrity 



        // @return String encrypted using Affine Cipher
        // 62-character alphabet and use in encrypt
                //remove for academic integrity 

    }
}