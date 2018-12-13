package com.example.madinaochilova.smack.Model

/**
 * Created by madinaochilova on 9/7/17.
 */
class Channel(val name: String, val description: String, val id: String) {
    override fun toString(): String {
        return "#$name"
    }
}