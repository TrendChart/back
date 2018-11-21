package com.trend.back.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController {

    val htmlName = "hello_world" //表示するhtmlの名前

    @GetMapping("/")
    fun root(model: Model): String {
        model.addAttribute("hello", "hello world!")
        return htmlName //表示するテンプレートのhtml名をreturn(.htmlはいらない)
    }
}