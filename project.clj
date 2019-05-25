(def SPRING-BOOT-VERSION "2.1.4.RELEASE")

;; build: lein clean && lein spring-boot-jar
;; run: java -jar target/boot-clj-spring-demo-1.0.jar

(defproject clj-spring-demo "1.0"
  :description "Sample of using Clojure with Spring and Java"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.springframework.boot/spring-boot-starter-web ~SPRING-BOOT-VERSION]]
  :repositories [["spring-milestone" "https://repo.spring.io/milestone"]]
  :main cljspring.App
  :spring-boot-loader-version "2.1.4.RELEASE"
  :plugins [[lein-spring-boot-jar "0.1.0"]
            [lein-ancient "0.6.15"]]
  :aot :all
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"])