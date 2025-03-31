package dev.api.git

class User {

    String name
    String email

    static constraints = {
        name blank: false, unique: true
        email email: true
    }

}
