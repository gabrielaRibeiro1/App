package ipvc.estg.app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    val ACT2_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ACT_CODE_1 = 1
        val edit1 = findViewById<EditText>(R.id.b12)

        val intent =  Intent (this, MainActivity2::class.java)
        intent.putExtra(PARAM1_NAME, edit1.text.toString())
        startActivityForResult(intent,ACT_CODE_1 )
    }


    companion object{
        const val PARAM1_NAME = "param1"
    }

    fun onAction(requestCode: Int, resultCode: Int, data:Intent?) {
       super.onActivityResult(requestCode,resultCode,data)

        if(requestCode == ACT2_CODE && resultCode == Activity.RESULT_OK){
            val msg = data?.getStringExtra(PARAM1_NAME)
            if(msg != null){

            }   else{
                
            }
        }
    }


}