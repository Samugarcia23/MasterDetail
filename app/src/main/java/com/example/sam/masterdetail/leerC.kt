package com.example.sam.masterdetail

/**
 * Created by Sam on 17/11/2017.
 */
class leerC(toString: String) {
    public fun convierte(): Pair<String,String> {
        var cadenaentera="{'uno','dos'}"
        var cadena=(cadenaentera.substringAfter("{")).substringBefore("}")
        var uno=(cadena.substringAfter("'")).substringBefore("'")


        cadena=(cadenaentera.substringAfter(",")).substringBefore("}")
        var dos=(cadena.substringAfter("'")).substringBefore("'")
        return Pair(uno, dos)
    }
}