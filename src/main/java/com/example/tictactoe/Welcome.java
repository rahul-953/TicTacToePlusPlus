package com.example.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @ Created by rahul on 2/12/17.
 */

public class Welcome extends Activity implements View.OnClickListener {

    EditText m_player1;
    EditText m_player2;
    Button m_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        m_player1 = (EditText)findViewById(R.id.inputP1);
        m_player2 = (EditText)findViewById(R.id.inputP2);
        m_start = (Button) findViewById(R.id.start);
        m_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){

            case R.id.start :
                if(emptyNamesExist()){
                    break;
                }
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            intent.putExtra("P1",m_player1.getText().toString().trim());
            intent.putExtra("P2",m_player2.getText().toString().trim());
            startActivity(intent);
        }
    }

    private boolean emptyNamesExist(){
        if(m_player1.getText().toString().replaceAll("\\s","").equals("")){
            Toast.makeText(this, "Enter Player 1 Name", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(m_player2.getText().toString().replaceAll("\\s","").equals("")){
            Toast.makeText(this, "Enter Player 2 Name", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

}



