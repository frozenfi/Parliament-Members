package com.example.parliamentapplication.utils

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 03.10.2022
*/
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.parliamentapplication.R

/*
Binding utilities used to access through data binding in xml file
 */

//It set the party name format
@BindingAdapter("partyNameFormatted")
fun TextView.setPartyName(item: String){
    item.let{
        text = when (item) {
            "kd" -> "Christian Democrats"
            "kesk" -> "Centre Party"
            "kok" -> "National Coalition Party"
            "liik" -> "Movement Now"
            "ps" -> "Finns party"
            "r" -> "Swedish People's Party"
            "sd" -> "Social Democratic Party"
            "vas" -> "Left Alliance"
            "vihr" -> "Green League"
            else -> ""
        }
    }
}

//sets the party logo
@BindingAdapter("partyLogoDisplay")
fun ImageView.setPartyLogo(item: String){
    item.let{
        setImageResource(
            when (item) {
                "kd" -> R.drawable.kd
                "kesk" -> R.drawable.kesk
                "kok" -> R.drawable.kok
                "liik" -> R.drawable.liik
                "ps" -> R.drawable.ps
                "r" -> R.drawable.r
                "sd" -> R.drawable.sdp
                "vas" -> R.drawable.vas
                "vihr" -> R.drawable.vihr
                else -> R.drawable.ic_launcher_foreground
            }
        )
    }
}


//accessing the image url through glide library
//Downloads, cache and bind the image
@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    val imageUrl =  "https://avoindata.eduskunta.fi/$imgUrl"

    imageUrl.let {
        val imgUri = imageUrl.toUri().buildUpon().scheme("https").build()

        Glide.with(imgView.context).load(imgUri).apply(RequestOptions().placeholder(R.drawable.loading_animation)).into(imgView)
    }
}
