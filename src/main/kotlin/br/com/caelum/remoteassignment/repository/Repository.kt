package br.com.caelum.remoteassignment.repository

import br.com.caelum.remoteassignment.model.Entity

abstract class Repository<E : Entity> {

    protected val database: Map<Long, E> = HashMap()

    abstract val all: List<E>

    abstract fun save(entity: E): E

    abstract fun findById(id: Long?): E

}
