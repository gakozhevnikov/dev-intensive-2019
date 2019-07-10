package ru.skillbranch.devintensive.models

import java.util.*

class UserView(
    val id : String,
    var fullName : String,
    var nickName : String,
    var avatar : String?=null,
    var status : String?="offline",
    var initials: String?) {
}