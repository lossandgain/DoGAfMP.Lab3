package com.example.lab3;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    private float mTextSize = 20;
    private EditText mEdit;
    private TextView tSize;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit = findViewById(R.id.edittext);
        tSize = findViewById(R.id.textsize);
        Button buttonB = findViewById(R.id.buttonb);
        Button buttonI = findViewById(R.id.buttoni);
        Button buttonSans = findViewById(R.id.buttonsansserif);
        Button buttonSerif = findViewById(R.id.buttonserif);
        Button monoSpace = findViewById(R.id.buttonmonospace);
        Button buttonPlus = findViewById(R.id.buttonplus);
        Button buttonMinus = findViewById(R.id.buttonminus);
        buttonB.setOnClickListener(this);
        buttonI.setOnClickListener(this);
        buttonSans.setOnClickListener(this);
        buttonSerif.setOnClickListener(this);
        monoSpace.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int but = v.getId();
        if (but == R.id.buttonplus) {
            if (mTextSize < 72) {
                mTextSize += 2;
                mEdit.setTextSize(mTextSize);
                tSize.setText(String.format("%.0f", mTextSize));
            }
        }
        if (but == R.id.buttonminus) {
            if (mTextSize > 18) {
                mTextSize -= 2;
                mEdit.setTextSize(mTextSize);
                tSize.setText(String.format("%.0f", mTextSize));
            }
        }
        if (but == R.id.buttonb) {
            if (mEdit.getTypeface().getStyle() == Typeface.ITALIC)
                mEdit.setTypeface(mEdit.getTypeface(), Typeface.BOLD_ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                mEdit.setTypeface(mEdit.getTypeface(), Typeface.ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD)
                mEdit.setTypeface(Typeface.create(mEdit.getTypeface(),
                        Typeface.NORMAL));
            else mEdit.setTypeface(mEdit.getTypeface(), Typeface.BOLD);
        }
        if (but == R.id.buttoni) {
            if (mEdit.getTypeface().getStyle() == Typeface.BOLD) {
                mEdit.setTypeface(mEdit.getTypeface(), Typeface.BOLD_ITALIC);
            } else if (mEdit.getTypeface().getStyle() == Typeface.BOLD_ITALIC) {
                mEdit.setTypeface(mEdit.getTypeface(), Typeface.BOLD);
            } else if (mEdit.getTypeface().getStyle() == Typeface.ITALIC) {
                mEdit.setTypeface(Typeface.create(mEdit.getTypeface(), Typeface.NORMAL));
            } else mEdit.setTypeface(mEdit.getTypeface(), Typeface.ITALIC);
        }
        if (but == R.id.buttonsansserif) {
            if (mEdit.getTypeface().getStyle() == Typeface.ITALIC)
                mEdit.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                mEdit.setTypeface(Typeface.SANS_SERIF,
                        Typeface.BOLD_ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD)
                mEdit.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
            else mEdit.setTypeface(Typeface.SANS_SERIF, Typeface.NORMAL);
        }
        if (but == R.id.buttonserif) {
            if (mEdit.getTypeface().getStyle() == Typeface.ITALIC)
                mEdit.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                mEdit.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD)
                mEdit.setTypeface(Typeface.SERIF, Typeface.BOLD);
            else mEdit.setTypeface(Typeface.SERIF, Typeface.NORMAL);
        }
        if (but == R.id.buttonmonospace) {
            if (mEdit.getTypeface().getStyle() == Typeface.ITALIC)
                mEdit.setTypeface(Typeface.MONOSPACE, Typeface.ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                mEdit.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
            else if (mEdit.getTypeface().getStyle() == Typeface.BOLD)
                mEdit.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
            else mEdit.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL);
        }
    }
}