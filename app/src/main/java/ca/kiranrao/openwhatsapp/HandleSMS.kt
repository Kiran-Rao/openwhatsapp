package ca.kiranrao.openwhatsapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HandleSMS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val number = intent.data?.schemeSpecificPart
        if (number != null) {
            Toast.makeText(applicationContext, "Opening $number in WhatsApp", Toast.LENGTH_LONG)
                .show();
            WhatsAppServices.openWhatsAppMessageThread(this, number)
        } else {
            Toast.makeText(applicationContext, "Opening WhatsApp", Toast.LENGTH_LONG).show();
            WhatsAppServices.openWhatsAppDefault(this)
        }
        finishAffinity()
    }

}