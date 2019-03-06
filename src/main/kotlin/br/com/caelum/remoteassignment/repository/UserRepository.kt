package br.com.caelum.remoteassignment.repository

import br.com.caelum.remoteassignment.model.User

class UserRepository : Repository<User>() {

    //Implementar
    fun findByEmail(email: String): User? {
        return null
    }

    //Implementar
    fun findByEmailLike(emailPart: String): List<User>? {
        return null
    }

    //Implementar
    fun findByName(name: String): List<User>? {
        return null
    }

    //Implementar
    fun findByNameLike(namePart: String): List<User>? {
        return null
    }

}
