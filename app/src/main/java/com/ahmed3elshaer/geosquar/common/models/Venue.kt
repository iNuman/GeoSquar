/*
 * *
 *  * Created by Ahmed Elshaer on 10/26/19 4:17 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 10/26/19 1:09 AM
 *
 */

package com.ahmed3elshaer.geosquar.common.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "venues")
data class Venue(
        @PrimaryKey(autoGenerate = true) val id_: Long=-1,
        @ColumnInfo(name = "name")
        @Json(name = "name")
        val name: String = "",
        @ColumnInfo(name = "location")
        @Json(name = "location")
        val location: VenuesResponse.Location,
        @ColumnInfo(name = "id")
        @Json(name = "id")
        val id: String = ""
)