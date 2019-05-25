(ns cljspring.rest.JavaController
    (:import (cljspring.service JavaService))
    (:gen-class
      :name ^{org.springframework.web.bind.annotation.RestController {}} cljspring.rest.JavaController
      :methods [
          [^{org.springframework.web.bind.annotation.RequestMapping ["/add"]} add [
            ^{org.springframework.web.bind.annotation.RequestParam {:value "a"}} long
            ^{org.springframework.web.bind.annotation.RequestParam {:value "b"}} long
            ] long]
          [^{org.springframework.web.bind.annotation.RequestMapping ["/letters/{word}"]} letters [
            ^{org.springframework.web.bind.annotation.PathVariable {:value "word"}} String
            ] cljspring.model.LetterCount]
        ]))
  
(def javaService (new JavaService))
  
(defn -add [this a b]
    (.add javaService a b))
  
(defn -letters [this word]
    (.letters javaService word))