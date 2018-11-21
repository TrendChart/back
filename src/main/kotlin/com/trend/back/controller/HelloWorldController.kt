package com.trend.back.controller

import com.trend.back.controller.dto.Person
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["hello"])
class HelloController {

    @RequestMapping(value = ["/person"], method = arrayOf(RequestMethod.POST))
    fun getPerson(@RequestBody person: Person): Person {
        return Person(person.name, person.age)
    }

}