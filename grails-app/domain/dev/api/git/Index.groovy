package dev.api.git

class Index {

    String home
    String about
    String contact

    static constraints = {
        home blank: false, unique: false
        about blank: false, unique: false
        contact blank: false, unique: false
    }

}
