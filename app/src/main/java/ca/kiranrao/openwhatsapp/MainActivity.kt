package ca.kiranrao.openwhatsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var openWhatsappButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openWhatsappButton = findViewById(R.id.open_whatsapp_button);
        openWhatsappButton.setOnClickListener {
            WhatsAppServices.openWhatsAppDefault(this)
        }
    }


}