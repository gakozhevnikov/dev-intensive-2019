package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User (
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false

) {
    constructor (id: String, firstName: String?, lastName: String?):this(
        id = id,
        firstName =firstName,
        lastName =lastName,
        avatar =null
    )
    init {
        println("Hello")
        println("First name:$firstName, last name: $lastName, avatar $avatar")

    }

    companion object Factory {
        private  var lastId: Int = -1
        fun makeUser (fullName:String?):User{
            lastId++

            val (firstName, lastName) = Utils.parseFullName(fullName)
            val init =Utils.toInitials(firstName,lastName)
            return User (id ="$lastId", firstName = firstName,lastName = lastName, avatar =init)

        }
    }
}