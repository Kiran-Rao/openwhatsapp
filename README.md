# Open SMS in WhatsApp
Open SMS Message Intent to Whatsapp

## Background
My grandmother's primary method of communication is a cheap Android tablet.
It unfortunately includes a preinstalled SMS app that upsells a VoIP SMS service.
My grandmother gets extremely frustrated by accidently clicking the message icon and opening an upsell page.
There's no way to uninstall the VoIP app. 

So instead of giving up and buying a new tablet or paying for an unnecessary service, I hacked together this project. 

## How it works
openwhatsapp conforms to SMS Default Handler: https://developer.android.com/guide/topics/permissions/default-handlers

I then set openwhatsapp as the default SMS App.
Now instead of launching the preinstalled VoIP app, it will
1. Launch openwhatsapp
1. Extract the phone number 
1. Attempt to open Whatsapp to the conversation associated with the number 
1. If no number, fall back to opening whatsapp
1. Finish() the openwhatsapp activity. We no longer need it. 

## License 
The source code is licensed under MIT License. 
