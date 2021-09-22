package edu.temple.signupform

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //finding the textViews and initializing a variable for it
        //turns out I didn't need it, but now I know I can do that
        val username : String = findViewById<TextView>(R.id.username).text.toString() //=username
        val password : String = findViewById<TextView>(R.id.password).text.toString() // = password
        val password2 : String = findViewById<TextView>(R.id.password2).text.toString().trim() // = password2
        val email : String = findViewById<TextView>(R.id.email).text.toString() // = email

        //finding the button and giving it a click function
        findViewById<Button>(R.id.button).setOnClickListener { v, ->
            (v as Button)
            if(findViewById<TextView>(R.id.username).text.isNotEmpty()
                && findViewById<TextView>(R.id.password).text.isNotEmpty()
                && findViewById<TextView>(R.id.password2).text.isNotEmpty()
                && findViewById<TextView>(R.id.email).text.isNotEmpty()
                && findViewById<TextView>(R.id.password).text == findViewById<TextView>(R.id.password2).text
            ) {
                    Toast.makeText(applicationContext, "Welcome, ${findViewById<TextView>(R.id.username).text}, to the SignUpForm", Toast.LENGTH_LONG).show()
            } else if (findViewById<TextView>(R.id.password).text != findViewById<TextView>(R.id.password2).text){
            Toast.makeText(applicationContext, "Password Don't Match", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(applicationContext, "Please make sure all entries are filled and password matches confirmation" +
                        " password! ", Toast.LENGTH_LONG).show()
            }
        }
    }
}

