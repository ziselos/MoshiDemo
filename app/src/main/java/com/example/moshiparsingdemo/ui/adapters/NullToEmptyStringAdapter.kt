package com.example.moshiparsingdemo.ui.adapters

import androidx.annotation.Nullable
import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson


@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class NullToEmptyString


class NullToEmptyStringAdapter {

   @ToJson
   fun toJson(@NullToEmptyString value: String?) : String? {
       return value
   }


    @FromJson
    @NullToEmptyString
    fun fromJson(@Nullable data: String?): String? {
        return data?: ""
    }
}