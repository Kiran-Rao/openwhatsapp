package ca.kiranrao.openwhatsapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HandleSMS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(applicationContext, "Message sent", Toast.LENGTH_LONG).show();
        val number = intent.data?.schemeSpecificPart
        if (number != null) {
            WhatsAppServices.openWhatsAppMessageThread(this, number)
        } else {
            WhatsAppServices.openWhatsAppDefault(this)
        }
        finish()
    }

}