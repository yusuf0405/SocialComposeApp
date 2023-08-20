package com.joseph.socialcomposeapp.fake_data

data class User(
    val id: Int,
    val name: String,
    val profileUrl: String,
    val email: String,
    val password: String,
)

val sampleUsers = listOf(
    User(
        id = 1,
        name = "Joseph Barbera",
        profileUrl = "https://picsum.photos/200",
        email = "joseph@gmail.com",
        password = "joseph1234"
    ),
    User(
        id = 2,
        name = "John Cena",
        profileUrl = "https://picsum.photos/200",
        email = "john@gmail.com",
        password = "john1234"
    ),
    User(
        id = 3,
        name = "Cristiano",
        profileUrl = "https://picsum.photos/200",
        email = "cristiano@gmail.com",
        password = "cristiano1234"
    ),
    User(
        id = 4,
        name = "L. James",
        profileUrl = "https://picsum.photos/200",
        email = "james@gmail.com",
        password = "james1234"
    )
)