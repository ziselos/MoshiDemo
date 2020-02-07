package com.example.moshiparsingdemo.ui.extensions

import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso


fun AppCompatImageView.loadImage(imageUrl : String?, errorImage: Int) {

    if (imageUrl.isNullOrEmpty()) {
        Picasso.get().load(errorImage).into(this)
        return
    }

    Picasso.get().load(imageUrl).into(this)
}