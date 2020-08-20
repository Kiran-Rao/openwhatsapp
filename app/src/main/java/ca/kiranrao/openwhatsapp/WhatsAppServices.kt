package ca.kiranrao.openwhatsapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.Telephony

object WhatsAppServices {
    fun openWhatsAppMessageThread(activity: Activity, phone: String) {
        val url = "https://api.whatsapp.com/send?phone=$phone"
        val i = Intent(Intent.ACTION_VIEW)
        i.setPackage("com.whatsapp");
        i.data = Uri.parse(url)
        activity.startActivity(i)
    }

    fun openWhatsAppDefault(activity: Activity) {
        val waIntent = Intent(Intent.ACTION_SEND)
        waIntent.type = "text/plain"
        waIntent.setPackage("com.whatsapp")
        waIntent.putExtra(Intent.EXTRA_TEXT, "YOUR TEXT")
        activity.startActivity(waIntent)
    }
}