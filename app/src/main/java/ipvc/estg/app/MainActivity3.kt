package ipvc.estg.app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val message = intent.getStringExtra(MainActivity2.PARAM1_NAME)
        findViewById<EditText>(R.id.b13).setText(message)
    }

    fun onAction(view: View){
        val message = R.id.b13.toString()
        val replyIntent = Intent()
        if(TextUtils.isEmpty(message)){
            setResult(Activity.RESULT_OK, replyIntent)
        }
        finish()
    }

}