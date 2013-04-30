(ns reflect-log-test.core
  (:use clojure.tools.logging))

(defn foo
  "I don't do a whole lot."
  [x]
  (fatal x "Hello, World!"))
