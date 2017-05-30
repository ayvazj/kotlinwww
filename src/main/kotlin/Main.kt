package main

import jQuery
import kotlin.browser.document
import kotlin.browser.window


fun main(args: Array<String>) {
    jQuery(selector="#learn-more-button", context=document.documentElement).click {
        console.log("learn-more-button clicked")
        window.alert("Thanks for clicking!")
    }
}
