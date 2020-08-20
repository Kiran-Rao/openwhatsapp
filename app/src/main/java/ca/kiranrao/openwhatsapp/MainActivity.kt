package ca.kiranrao.openwhatsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var openWhatsappButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openWhatsappButton = this.findViewById(R.id.open_whatsapp_button);
        openWhatsappButton.setOnClickListener {
            openWhatsApp("4155551234")
        }
    }

    private fun openWhatsApp(phone: String) {
        val url = "https://api.whatsapp.com/send?phone=$phone"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
}