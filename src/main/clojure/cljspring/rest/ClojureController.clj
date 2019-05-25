(ns cljspring.rest.ClojureController
    (:require [cljspring.service.ClojureService :as service])
    (:gen-class
        :name ^{org.springframework.web.bind.annotation.RestController {}} cljspring.rest.ClojureController
        :methods [
            [^{org.springframework.web.bind.annotation.RequestMapping ["/hello"]} hello [] String]
            [^{org.springframework.web.bind.annotation.RequestMapping ["/factorial/{n}"]} factorial [
              ^{org.springframework.web.bind.annotation.PathVariable {:value "n"}} Long
              ] Long]
      ]))
  
(defn -hello
  [this]
  (service/greet))

(defn -factorial [this n]
  (service/factorial n))
