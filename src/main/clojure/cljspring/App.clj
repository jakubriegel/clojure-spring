(ns cljspring.App
  (:import
    [org.springframework.boot SpringApplication]
    [org.springframework.context ApplicationContext])
  (:gen-class
    :name ^{org.springframework.boot.autoconfigure.SpringBootApplication {}} cljspring.App))


(defn -main [& args]
  (let [^ApplicationContext ctx (
            SpringApplication/run ^Object cljspring.App ^"[Ljava.lang.String;" (into-array String args))
        ]))
