package ipvc.estg.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "MY_TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"onCreate")
    }



    fun onAction(view: View) {
        val t = findViewById<TextView>(R.id.b1)
        val e1 = findViewById<EditText>(R.id.b2)
        val e2 = findViewById<EditText>(R.id.b3)
        val e3 = findViewById<EditText>(R.id.b4)

        val x= ( e1.text.toString().toInt() + e2.text.toString().toInt()+ e3.text.toString().toInt())

        t.setText("Resultado: $x")


    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }

    fun ButtonClick(view: View) {
        Toast.makeText(this,R.string.KEY_WELCOME, Toast.LENGTH_LONG).show()
    }


}