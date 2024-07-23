package com.gmail.eamosse.tp2

//TODO : Complete the class
data class Student(
    val name: String,
    val code: String,
    val sexe: Char,
    val adresse: String,
    val age: Int
) {
    init {
        require(sexe == 'M' || sexe == 'F') {
            "Sexe doit être 'M' ou 'F'"
        }
        require(age >= 0) {
            "L'âge doit être un nombre positif"
        }
    }
}
