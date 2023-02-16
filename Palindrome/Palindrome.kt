package Palindrome

import java.util.*

object Palindrome {
    @JvmStatic
    fun main(args: Array<String>) {
        val string = "igor"
        val list: LinkedList<Any?> = LinkedList<Any?>()
        for (c in string.toCharArray()) {
            list.add(c)
            println(list)
        }
        //проверка на палиндром
        val it: MutableListIterator<Any?> = list.listIterator()
        val reverse: MutableListIterator<Any?> = list.listIterator(list.size)
        var isPalindrome = true
        while (it.hasNext() && reverse.hasPrevious()) {
            if (it.next() !== reverse.previous()) {
                isPalindrome = false
                break
            }
        }
        if (isPalindrome) {
            println("palindrome")
        } else {
            println("Is not Palindrome")
        }
        val string1 = "igor"
        var str = ""
        var ch: Char
        for (element in string1) {
            ch = element
            str = ch.toString() + str
        }
        println(str)

        val sb = StringBuilder()
        sb.append("igor")
        sb.reverse()
        println(sb)
    }
}