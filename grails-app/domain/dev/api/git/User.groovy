package dev.api.git

class User {

    String fullName
    String email

    static constraints = {
        name blank: false, unique: false
        email email: true
    }

}
