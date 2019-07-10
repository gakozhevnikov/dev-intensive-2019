package ru.skillbranch.devintensive.utils

//import java.lang.StringBuilder
import kotlin.text.StringBuilder

object Utils {
    fun parseFullName (fulLName:String?):Pair <String?,String?>{
        val parts:List<String>? = fulLName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }
    fun toInitials(firstName: String?, lastName: String?):String{
        val init1:String= firstName?.substring(0..0) ?: ""
        val init2:String= lastName?.substring(0..0) ?: ""
        return init1+init2
    }

    fun transliteration(s: String): String {
        val sb = StringBuilder()
        s.forEach { c: Char ->  if (c.isUpperCase())
            sb.append(transliterationGetLatin(c.toLowerCase()).toUpperCase())
         else sb.append(transliterationGetLatin(c.toLowerCase()))
        }
        return sb.toString()
    }

    fun transliterationGetLatin (c: Char):String{
        val a:String = when (c){
            'а'->"a"
            'б'-> "b"
            'в'-> "v"
            'г'-> "g"
            'д'-> "d"
            'е'-> "e"
            'ё'-> "e"
            'ж'-> "zh"
            'з'-> "z"
            'и'-> "i"
            'й'-> "i"
            'к'-> "k"
            'л'-> "l"
            'м'-> "m"
            'н'-> "n"
            'о'-> "o"
            'п'-> "p"
            'р'-> "r"
            'с'-> "s"
            'т'-> "t"
            'у'-> "u"
            'ф'-> "f"
            'х'-> "h"
            'ц'-> "c"
            'ч'-> "ch"
            'ш'-> "sh"
            'щ'-> "sh"
            'ъ'-> ""
            'ы'-> "i"
            'ь'-> ""
            'э'-> "e"
            'ю'-> "yu"
            'я'-> "ya"
            else -> c.toString()
        } as String
        return a
    }
}