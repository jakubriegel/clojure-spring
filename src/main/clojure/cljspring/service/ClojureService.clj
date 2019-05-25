(ns cljspring.service.ClojureService)

(defn greet [] "Hello World!")

(defn factorial [n]
  (if (= n 1)
      1
      (* n (factorial (dec n)))
    ))