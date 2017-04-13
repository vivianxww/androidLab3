package edu.fjnu.cse.androidclass3;

/**
 * Created by 14334 on 2017/3/28.
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/14 0014.
 */

public class AlertDialoger extends Activity {

    private Button btn_adl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog);
        btn_adl= (Button) findViewById(R.id.btn_dialog);
        btn_adl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1=getLayoutInflater().inflate(R.layout.alert_dialog_child,null);
                new AlertDialog.Builder(AlertDialoger.this).setView(view1)
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialoger.this,"登录成功",Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
    }
}