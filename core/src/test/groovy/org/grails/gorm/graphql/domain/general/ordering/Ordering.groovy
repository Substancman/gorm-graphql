package org.grails.gorm.graphql.domain.general.ordering

import grails.gorm.annotation.Entity
import org.grails.gorm.graphql.entity.dsl.GraphQLMapping

@Entity
class Ordering {
    String d
    String c
    String a
    String b
    
    
    static constraints = {
        a order: 1
        b order: 2
    }
    
    static graphql = GraphQLMapping.build {
        add("aa",String.class,{
            order(1) // same order as 'a'
        })
    }
}
